package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise02_TicTacToeBoard extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a Pane
		GridPane pane = new GridPane();
		pane.setHgap(5.5);
		pane.setVgap(5.5);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				byte status = (byte) (Math.random() * 3);
				if (status == 0) {
					ImageView o = new ImageView(getClass().getResource("images/o.gif").toExternalForm());
					pane.add(o, j, i);
				} else if (status == 1) {
					ImageView x = new ImageView(getClass().getResource("images/x.gif").toExternalForm());
					pane.add(x, j, i);
				}
			}
		}

		// Create a Scene and place it in the stage
		Scene scene = new Scene(pane, 150, 150);
		primaryStage.setTitle("TicTacToeBoard"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}
