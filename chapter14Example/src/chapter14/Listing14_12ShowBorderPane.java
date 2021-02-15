package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Listing14_12ShowBorderPane extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a border pane
		BorderPane pane = new BorderPane();

		// Place the nodes in the pane
		pane.setTop(new CustomPane("Top"));
		pane.setRight(new CustomPane("Right"));
		pane.setBottom(new CustomPane("Bottom"));
		pane.setLeft(new CustomPane("Left"));
		pane.setCenter(new CustomPane("Center"));

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);

		// Set stage title
		primaryStage.setTitle("ShowBorderPane");

		// Place the scene in the stage
		primaryStage.setScene(scene);

		// Display the stage
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}

// Define a custom pane to hold the label in the center of the pane
class CustomPane extends StackPane {
	public CustomPane(String title) {
		getChildren().add(new Label(title));
		setStyle("-fx-border-color:red;");
		setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
	}
}