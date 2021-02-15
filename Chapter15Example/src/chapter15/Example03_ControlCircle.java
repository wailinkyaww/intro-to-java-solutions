package chapter15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Example03_ControlCircle extends Application {
	private CirclePane circlePane = new CirclePane();
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		Circle circle = new Circle(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		pane.getChildren().add(circle);

		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btEnlarge = new Button("Enlarge");
		Button btShrink = new Button("Shrink");
		hBox.getChildren().add(btEnlarge);
		hBox.getChildren().add(btShrink);
		
		// Create and register the handler
		btEnlarge.setOnAction(new EnlargeHandler());
		btShrink.setOnAction(new ShrinkHandler());

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);

		// Create a Scene and place it in the stage
		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setTitle("ControlCircle"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	class EnlargeHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			circlePane.enlarge();
		}
	}
	
	class ShrinkHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			circlePane.shrink();
		}
	}

}

class CirclePane extends StackPane {
	private Circle circle = new Circle(50);

	public CirclePane() {
		getChildren().add(circle);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
	}

	public void enlarge() {
		circle.setRadius(circle.getRadius() + 2);
	}

	public void shrink() {
		circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2 : circle.getRadius());
	}
}
