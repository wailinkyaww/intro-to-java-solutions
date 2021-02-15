package chapter16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BounceBallSlider extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BallPane ballPane = new BallPane();
		
		Slider slSpeed = new Slider();
		slSpeed.setMax(25);
		ballPane.rateProperty().bind(slSpeed.valueProperty());
		
		BorderPane pane = new BorderPane();
		pane.setCenter(ballPane);
		pane.setBottom(slSpeed);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("Bounce Ball Slider"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
}
