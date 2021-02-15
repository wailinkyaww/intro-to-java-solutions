package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Listing14_9ShowImage extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a Pane to hold the image views
		Pane pane = new HBox();
		pane.setPadding(new Insets(5, 5, 5, 5));

		Image image = new Image("images/blue-eyes-girl-ad.jpg");
		pane.getChildren().add(new ImageView(image));

		ImageView imageView2 = new ImageView(image);
		imageView2.setFitHeight(100);
		imageView2.setFitWidth(100);
		pane.getChildren().add(imageView2);

		ImageView imageView3 = new ImageView(image);
		imageView3.setRotate(90);
		pane.getChildren().add(imageView3);
		
		// Create a Scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowImage");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
