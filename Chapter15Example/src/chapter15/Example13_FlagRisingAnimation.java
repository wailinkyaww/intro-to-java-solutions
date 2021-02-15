package chapter15;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Example13_FlagRisingAnimation extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a pane
		Pane pane = new Pane();

		// Add an image view and add it to pane
		ImageView imageView = new ImageView("https://www.utycc.edu.mm/stock-img/logo.png");
		pane.getChildren().add(imageView);

		// Create a path transition
		PathTransition pt = new PathTransition(Duration.millis(10000), new Line(100, 200, 100, 0), imageView);
		pt.setCycleCount(5);
		pt.play(); 	// Start Animation
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane,250,200);
		primaryStage.setTitle("FlagRisingAnimation"); 	// Set the stage title
		primaryStage.setScene(scene); 	// Place the scene on the stage
		primaryStage.show(); 	// Display the stage
	}
}
