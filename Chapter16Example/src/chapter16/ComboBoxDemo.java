package chapter16;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application {
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

	// Declare an array of strings for flag description
	private String[] flagDescription = new String[9];

	// Declare and create a description pane
	private DescriptionPane descriptionPane = new DescriptionPane();

	// Create a comboBox for selecting countries
	private ComboBox<String> cbo = new ComboBox<>();

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Set text description
		for (int i = 0, length = flagDescription.length; i < length; i++) {
			flagDescription[i] = flagTitles[i] + " National Flag...";
		}

		// Set the first country for display
		setDisplay(0);

		// Add combo box and description pane to border pane
		BorderPane pane = new BorderPane();

		BorderPane paneForComboBox = new BorderPane();
		paneForComboBox.setPadding(new Insets(5));
		paneForComboBox.setLeft(new Label("Select Country: "));
		paneForComboBox.setCenter(cbo);
		pane.setTop(paneForComboBox);

		cbo.setPrefWidth(400);
		cbo.setValue("Canada");

		ObservableList<String> items = FXCollections.observableArrayList(flagTitles);
		cbo.getItems().addAll(items);
		pane.setCenter(descriptionPane);

		cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 450, 170);
		primaryStage.setTitle("Combo Box Demo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	// Set display information on the description pane
	public void setDisplay(int index) {
		descriptionPane.setTitle(flagTitles[index]);
		descriptionPane.setImageView(flagImage[index]);
		descriptionPane.setDescription(flagDescription[index]);
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
