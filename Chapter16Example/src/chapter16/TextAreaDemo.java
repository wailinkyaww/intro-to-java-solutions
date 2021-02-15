package chapter16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TextAreaDemo extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Declare and create a description pane
		DescriptionPane descriptionPane = new DescriptionPane();

		// Set title, text, image in the description pane
		descriptionPane.setTitle("Canada");
		String description = "Canadian National Flag...";
		descriptionPane.setDescription(description);
		descriptionPane.setImageView(new ImageView(getClass().getResource("image/ca.gif").toExternalForm()));

		// Create a scene and place it in the stage
		Scene scene = new Scene(descriptionPane, 450, 200);
		primaryStage.setTitle("Text Area Demo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene on the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
