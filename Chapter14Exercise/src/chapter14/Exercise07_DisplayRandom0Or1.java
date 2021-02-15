package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise07_DisplayRandom0Or1 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {

		GridPane pane = new GridPane();
		int size = 10;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int r = (int) (Math.random() * 2);
				pane.add(new TextField(String.valueOf(r)), j, i);
			}
		}

		// Create a Scene and place it in the stage
		Scene scene = new Scene(pane, 300, 250);
		primaryStage.setTitle("Display Random 0 OR 1"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene on the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
