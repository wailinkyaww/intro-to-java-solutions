package chapter15;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Example14_FadeTransitionDemo extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Place an ellipse to the pane
		Pane pane = new Pane();
		
		Ellipse ellipse = new Ellipse(10,10,100,50);
		ellipse.setFill(Color.ORANGE);
		ellipse.setStroke(Color.BLACK);
		ellipse.centerXProperty().bind(pane.widthProperty().divide(2));
		ellipse.centerYProperty().bind(pane.heightProperty().divide(2));
		ellipse.radiusXProperty().bind(pane.widthProperty().multiply(0.4));
		ellipse.radiusYProperty().bind(pane.heightProperty().multiply(0.4));
		pane.getChildren().add(ellipse);
		
		// Apply the fade transition to ellipse
		FadeTransition ft = new FadeTransition(Duration.millis(3000),ellipse);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play(); 	// Start the animation
		
		// Control Animation
		ellipse.setOnMousePressed(e -> ft.pause());
		ellipse.setOnMouseReleased(e -> ft.play());
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane,200,150);
		primaryStage.setTitle("FadeTransitionDemo"); 	// Set the stage title
		primaryStage.setScene(scene);	// Place the scene on the stage
		primaryStage.show(); 	// Display the stage
 	}
}
