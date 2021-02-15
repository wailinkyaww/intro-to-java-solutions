package chapter16;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListViewDemo extends Application {
	// Declare an array of Strings for flag titles
	private String[] flagTitles = { "Canada", "China", "Denmark", "France", "Germany", "India", "Norway",
			"United Kingdom", "United States of America" };

	// Declare an ImageView array for the national flags of 9 countries
	private ImageView[] flagImage = { new ImageView(getClass().getResource("image/ca.gif").toExternalForm()),
			new ImageView(getClass().getResource("image/china.gif").toExternalForm()),
			new ImageView(getClass().getResource("image/denmark.gif").toExternalForm()),
			new ImageView(getClass().getResource("image/fr.gif").toExternalForm()),
			new ImageView(getClass().getResource("image/germany.gif").toExternalForm()),
			new ImageView(getClass().getResource("image/india.gif").toExternalForm()),
			new ImageView(getClass().getResource("image/norway.gif").toExternalForm()),
			new ImageView(getClass().getResource("image/uk.gif").toExternalForm()),
			new ImageView(getClass().getResource("image/us.gif").toExternalForm()) };

	@Override
	public void start(Stage primaryStage) throws Exception {
		ListView<String> lv = new ListView<>(FXCollections.observableArrayList(flagTitles));
		lv.setPrefSize(400, 400);
		lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		// Create a pane to hold image views
		FlowPane imagePane = new FlowPane(10, 10);
		BorderPane pane = new BorderPane();
		pane.setLeft(new ScrollPane(lv));
		pane.setCenter(imagePane);

		lv.getSelectionModel().selectedItemProperty().addListener(ov -> {
			imagePane.getChildren().clear();
			for (Integer i : lv.getSelectionModel().getSelectedIndices()) {
				imagePane.getChildren().add(flagImage[i]);
			}
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 450, 170);
		primaryStage.setTitle("List View Demo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
