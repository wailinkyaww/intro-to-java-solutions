package chapter14;

import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise08_Display54Cards extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	public ArrayList<String> getCardList() {
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 1; i <= 54; i++)
			list.add(i + ".png");

		return list;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ArrayList<String> cardList = getCardList();

		// Shuffle cards
		Collections.shuffle(cardList);
		
		// Create a pane to hold images
		GridPane pane = new GridPane();

		int cards = cardList.size();
		for (int i = 0; i < cards; i++) {
			pane.add(new ImageView(getClass().getResource("images/card/" + cardList.get(i)).toExternalForm()), i % 9,
					i / 9);
		}

		// Create a Scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Display Cards"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}
