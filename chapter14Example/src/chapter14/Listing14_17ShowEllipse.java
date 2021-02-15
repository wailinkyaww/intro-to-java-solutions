package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Listing14_17ShowEllipse extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a pane
		Pane pane = new Pane();
		
		for(int i = 0; i < 16; i++)
		{
			Ellipse e1 = new Ellipse(150,100,100,50);
			e1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
			e1.setFill(Color.WHITE);
			e1.setRotate(i * 180 / 16);
			pane.getChildren().add(e1);
		}
		
		// Create a Scene and place it in the stage
		Scene scene = new Scene(pane);
		
		// Set the stage title
		primaryStage.setTitle("ShowEllipse");
		
		// Place the scene in the stage
		primaryStage.setScene(scene);
		
		// Display the stage
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
