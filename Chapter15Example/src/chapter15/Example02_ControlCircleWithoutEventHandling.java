package chapter15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Example02_ControlCircleWithoutEventHandling extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		Circle circle = new Circle(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		pane.getChildren().add(circle);

		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btEnlarge = new Button("Enlarge");
		Button btShrink = new Button("Shrink");
		hBox.getChildren().add(btEnlarge);
		hBox.getChildren().add(btShrink);

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circle);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);

		// Create a Scene and place it in the stage
		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setTitle("ControlCircle");	// Set the stage title
		primaryStage.setScene(scene);	// Place the scene in the stage
		primaryStage.show();	// Display the stage
	}
}
