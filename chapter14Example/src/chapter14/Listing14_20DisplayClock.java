package chapter14;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Listing14_20DisplayClock extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a clock and a label
		ClockPane clock = new ClockPane();
		String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
		Label lblCurrentTime = new Label(timeString);

		// Place clock and label in the border pane
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);

		// set stage title
		primaryStage.setTitle("Display Clock");

		// Place the scene on the pane
		primaryStage.setScene(scene);

		// Display the stage
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
