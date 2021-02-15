package chapter15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class BounceBallControl extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a ball pane
		BallPane ballPane = new BallPane();

		// Pause and resume animation
		ballPane.setOnMouseClicked(e -> ballPane.pause());
		ballPane.setOnMouseReleased(e -> ballPane.play());

		// Increase and Decrease animation
		ballPane.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.UP)
				ballPane.increaseSpeed();
			else if (e.getCode() == KeyCode.DOWN)
				ballPane.decreaseSpeed();
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(ballPane, 200, 150);
		primaryStage.setTitle("BounceBallControl"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene on the stage
		primaryStage.show(); // Display the stage

		// Must request focus after the primaryStage is displayed
		ballPane.requestFocus();
	}
}
