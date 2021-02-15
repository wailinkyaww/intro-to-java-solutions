package chapter16;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ScrollBarDemo extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Text text = new Text(20, 20, "JavaFX Programming");

		ScrollBar sbHorizontal = new ScrollBar();
		ScrollBar sbVertical = new ScrollBar();
		sbVertical.setOrientation(Orientation.VERTICAL);

		// Create a text in a pane
		Pane paneForText = new Pane();
		paneForText.getChildren().add(text);

		// Create a border pane to hold text and scroll bar
		BorderPane pane = new BorderPane();
		pane.setCenter(paneForText);
		pane.setRight(sbVertical);
		pane.setBottom(sbHorizontal);

		// Listener for horizontal scroll bar change
		sbHorizontal.valueProperty().addListener(ov -> {
			text.setX(sbHorizontal.getValue() * paneForText.getWidth() / sbHorizontal.getMax());
		});

		// Listener for vertical scroll bar change
		sbVertical.valueProperty().addListener(ov -> {
			text.setY(sbVertical.getValue() * paneForText.getHeight() / sbVertical.getMax());
		});

		// Create a Scene and place it in the stage
		Scene scene = new Scene(pane, 450, 170);
		primaryStage.setTitle("Scroll Bar Demo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
