package chapter16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Example01_LabelWithGraphic extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ImageView us = new ImageView(getClass().getResource("image/us.gif").toExternalForm());
		Label lbl = new Label("US\n50 States", us);
		lbl.setStyle("-fx-border-color: green; -fx-border-width: 2;");
		lbl.setContentDisplay(ContentDisplay.BOTTOM);
		lbl.setTextFill(Color.ORANGE);

		Label lbl2 = new Label("Cirle", new Circle(50, 50, 25));
		lbl2.setContentDisplay(ContentDisplay.TOP);
		lbl2.setTextFill(Color.ORANGE);

		Label lbl3 = new Label("Rectangle", new Rectangle(10, 10, 50, 15));
		lbl3.setContentDisplay(ContentDisplay.RIGHT);

		Label lbl4 = new Label("Ellipse", new Ellipse(50, 50, 50, 25));
		lbl4.setContentDisplay(ContentDisplay.LEFT);

		Ellipse ellipse = new Ellipse(50, 50, 50, 25);
		ellipse.setStroke(Color.GREEN);
		ellipse.setFill(Color.WHITE);
		StackPane stackPane = new StackPane();
		stackPane.getChildren().addAll(ellipse, new Label("Java FX"));
		Label lbl5 = new Label("A pane inside a label", stackPane);
		lbl5.setContentDisplay(ContentDisplay.BOTTOM);

		HBox pane = new HBox(20);
		pane.getChildren().addAll(lbl, lbl2, lbl3, lbl4, lbl5);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 450, 150);
		primaryStage.setTitle("Label With Graphic"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene on the stage
		primaryStage.show(); // Display the stage
	}

}
