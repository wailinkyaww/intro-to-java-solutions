package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise06_DisplayACheckBoard extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a GridPane
		GridPane pane = new GridPane();

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Rectangle r = new Rectangle(30, 30);
				if (needToPaint(i, j))
					r.setFill(Color.WHITE);
				pane.add(r, j, i);
				r.widthProperty().bind(pane.widthProperty().divide(8));
				r.heightProperty().bind(pane.heightProperty().divide(8));
			}
		}

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Display Check Board"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene on the stage
		primaryStage.show(); // Display the stage
	}

	private boolean needToPaint(int row, int col) {
		if ((row & 1) == 1)
			return (col & 1) == 1;
		else
			return (col & 1) != 1;
	}
}
