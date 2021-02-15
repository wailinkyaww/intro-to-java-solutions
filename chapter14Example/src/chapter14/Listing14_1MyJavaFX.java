package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Listing14_1MyJavaFX extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a scene and place a button in the scene
		Button btOk = new Button("OK");
		Scene scene = new Scene(btOk, 200, 250);

		// Set the stage title
		primaryStage.setTitle("MyJavaFX");

		// Place the scene in the stage
		primaryStage.setScene(scene);

		// Display the stage
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
