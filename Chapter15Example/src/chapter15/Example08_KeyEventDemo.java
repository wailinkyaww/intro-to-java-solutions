package chapter15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Example08_KeyEventDemo extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a pane and set its properties
		Pane pane = new Pane();
		Text text = new Text(20, 20, "A");
		pane.getChildren().add(text);

		text.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case DOWN:
				text.setY(text.getY() + 10);
				break;
			case UP:
				text.setY(text.getY() - 10);
				break;
			case LEFT:
				text.setX(text.getX() - 10);
				break;
			case RIGHT:
				text.setX(text.getX() + 10);
				break;
			default:
				if (Character.isLetterOrDigit(e.getText().charAt(0)))
					text.setText(e.getText());
			}
		});
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("KeyEventDemo"); 	// Set the stage title
		primaryStage.setScene(scene); 	// Place the scene on the stage
		primaryStage.show(); 	// Display the stage
		
		text.requestFocus(); // text is focused to receive key input 
	}
}
