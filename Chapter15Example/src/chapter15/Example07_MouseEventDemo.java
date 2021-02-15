package chapter15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Example07_MouseEventDemo extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a pane and set its properties
		Pane pane = new Pane();
		Text text = new Text(20, 20, "Programmnig is Fun");
		pane.getChildren().add(text);
		text.setOnMouseDragged(e -> {
			text.setX(e.getX());
			text.setY(e.getY());
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 100);
		primaryStage.setTitle("MouseEventDemo");  	// Set the stage title
		primaryStage.setScene(scene); 	// Place the scene in the stage
		primaryStage.show(); 	// Display the stage
	}
}
