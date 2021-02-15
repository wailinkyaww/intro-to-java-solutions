package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Listing14_3ButtonInPane extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a scence and place a button in the scene
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("OK"));
		Scene scene = new Scene(pane, 200, 59);

		// Set the stage title
		primaryStage.setTitle("Button in a pane");

		// Place the scene in the stage
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
