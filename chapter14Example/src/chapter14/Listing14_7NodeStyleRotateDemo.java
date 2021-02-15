package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Listing14_7NodeStyleRotateDemo extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a scence and place a button in the scene
		StackPane pane = new StackPane();
		Button btOK = new Button("OK");
		btOK.setStyle("-fx-border-color:blue;");
		pane.getChildren().add(btOK);

		pane.setRotate(45);
		pane.setStyle("-fx-border-color:red; -fx-background-color:lightgrey;");

		Scene scene = new Scene(pane, 200, 250);
		primaryStage.setTitle("NodeStyleRotateDemo");
		primaryStage.setScene(scene);
		
		// Display the stage
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
