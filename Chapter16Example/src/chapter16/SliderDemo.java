package chapter16;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SliderDemo extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Text text = new Text(20, 20, "JavaFX Programming");

		Slider slHorizontal = new Slider();
		slHorizontal.setShowTickLabels(true);
		slHorizontal.setShowTickMarks(true);

		Slider slVertical = new Slider();
		slVertical.setOrientation(Orientation.VERTICAL);
		slVertical.setShowTickLabels(true);
		slVertical.setShowTickMarks(true);
		slVertical.setValue(100);

		// Create a text in a pane
		Pane paneForText = new Pane();
		paneForText.getChildren().add(text);

		BorderPane pane = new BorderPane();
		pane.setCenter(paneForText);
		pane.setBottom(slHorizontal);
		pane.setRight(slVertical);

		// Listener for horizontal slider
		slHorizontal.valueProperty().addListener(ov -> {
			text.setX(slHorizontal.getValue() * paneForText.getWidth() / slHorizontal.getMax());
		});

		// Listener for vertical slider
		slVertical.valueProperty().addListener(ov -> {
			text.setY((slVertical.getMax() - slVertical.getValue()) * paneForText.getHeight() / slVertical.getMax());
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 450, 170);
		primaryStage.setTitle("Slider Demo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
