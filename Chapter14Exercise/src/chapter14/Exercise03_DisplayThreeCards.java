package chapter14;

import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise03_DisplayThreeCards extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ArrayList<String> cardList = getCardList();

		// Shuffle cards
		Collections.shuffle(cardList);

		// Create a Pane
		HBox hBox = new HBox(10);
		hBox.setPadding(new Insets(11.5, 10, 10, 11.5));

		for (int i = 0; i < 3; i++) {
			ImageView imageView = new ImageView(
					getClass().getResource("images/card/" + cardList.get(i)).toExternalForm());
			hBox.getChildren().add(imageView);
		}

		// Create a Scene and place it in the stage
		Scene scene = new Scene(hBox);
		primaryStage.setTitle("Display Three Cards"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public ArrayList<String> getCardList() {
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 1; i <= 52; i++)
			list.add(i + ".png");

		return list;
	}
}
