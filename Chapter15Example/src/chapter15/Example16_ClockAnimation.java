package chapter15;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Example16_ClockAnimation extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a clock
		ClockPane clock = new ClockPane();

		// Create a handler for animation
		EventHandler<ActionEvent> eventHandler = e -> {
			clock.setCurrentTime();
		};

		// Create an animation for running clock
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play(); // Start animation

		// Create a scene and place it in the stage
		Scene scene = new Scene(clock, 250, 250);
		primaryStage.setTitle("ClockAnimation"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene on the stage
		primaryStage.show(); // Display the stage
	}
}
