package chapter14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Listing14_19ShowPolygon extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a pane
		Pane pane = new Pane();

		Polygon polygon = new Polygon();
		pane.getChildren().add(polygon);
		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.BLACK);
		ObservableList<Double> list = polygon.getPoints();

		final double WIDTH = 200, HEIGHT = 200;
		double centerX = WIDTH / 2.0, centerY = HEIGHT / 2.0;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
		
		// Add points to the polygon
		for (int i = 0; i < 6; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
		}
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		
		// Set the stage title
		primaryStage.setTitle("Show Polygon");
		
		// Place the scene on the stage
		primaryStage.setScene(scene);
		
		// Display the stage
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
