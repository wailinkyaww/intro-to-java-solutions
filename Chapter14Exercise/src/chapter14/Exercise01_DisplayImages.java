package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise01_DisplayImages extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a Pane
		GridPane pane = new GridPane();
		pane.setHgap(5.5);
		pane.setVgap(5.5);

		ImageView imageView = new ImageView(getClass().getResource("images/flag5.gif").toExternalForm());
		ImageView imageView1 = new ImageView(getClass().getResource("images/ca.gif").toExternalForm());
		ImageView imageView2 = new ImageView(getClass().getResource("images/flag2.gif").toExternalForm());
		ImageView imageView3 = new ImageView(getClass().getResource("images/flag6.gif").toExternalForm());

		pane.add(imageView, 0, 0);
		pane.add(imageView1, 1, 0);
		pane.add(imageView2, 0, 1);
		pane.add(imageView3, 1, 1);

		// Create a scene and place it on the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Display Images"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene on the stage
		primaryStage.show();  // Display the stage
	}
}
