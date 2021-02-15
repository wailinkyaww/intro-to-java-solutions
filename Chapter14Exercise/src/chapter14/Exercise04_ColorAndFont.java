package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise04_ColorAndFont extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a Pane
		HBox hBox = new HBox(10);
		hBox.setPadding(new Insets(11.5, 12.5, 12.5, 11.5));

		// Create texts and add to the pane
		String textContet = "Java";
		for (int i = 0; i < 5; i++) {
			Text text = new Text(textContet);
			text.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
			text.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
			text.setRotate(90);
			hBox.getChildren().add(text);
		}
		
		// Create a Scene and place it in the stage
		Scene scene = new Scene(hBox);
		primaryStage.setTitle("Color And Font");  	// Set the stage title
		primaryStage.setScene(scene);  	// Place the scene on the stage
		primaryStage.show();  // Display the stage
	}
}
