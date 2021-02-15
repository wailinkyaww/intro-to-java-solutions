package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Listing14_13ShowHBoxVBox extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a pane
		BorderPane pane = new BorderPane();
		
		// Place the nodes in the pane
		pane.setTop(getHBox());
		pane.setLeft(getVBox());
		
		// Create a scene and place it in stage
		Scene scene = new Scene(pane);
		
		// Set the stage title
		primaryStage.setTitle("ShowHBoxVBox");
		
		// Place the scene in the stage
		primaryStage.setScene(scene);
		
		// Display the stage
		primaryStage.show();
	}

	private HBox getHBox() {
		HBox hBox = new HBox(15);
		hBox.setPadding(new Insets(15, 15, 15, 15));
		hBox.setStyle("-fx-background-color:gold;");
		hBox.getChildren().add(new Button("Computer Science"));
		hBox.getChildren().add(new Button("Chemistry"));
		ImageView imageView = new ImageView(new Image("https://www.utycc.edu.mm/stock-img/logo.png"));
		hBox.getChildren().add(imageView);
		return hBox;
	}

	private VBox getVBox() {
		VBox vBox = new VBox(15);
		vBox.setPadding(new Insets(15, 5, 5, 5));
		vBox.getChildren().add(new Label("Courses"));

		Label[] courses = { new Label("CSCI 1301"), new Label("CSCI 1302"), new Label("CSCI 2410"),
				new Label("CSCI 3720"), };

		for (Label course : courses) {
			VBox.setMargin(course, new Insets(0, 0, 0, 15));
			vBox.getChildren().add(course);
		}

		return vBox;
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
