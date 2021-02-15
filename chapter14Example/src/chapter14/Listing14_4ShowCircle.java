package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Listing14_4ShowCircle extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a Circle and show its properties
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);

		// Create a pane to hold the circle
		Pane pane = new Pane();
		pane.getChildren().add(circle);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Show Circle");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
