package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Listing14_10ShowFlowPane extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a pane and set its property
		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(11, 12, 13, 14));
		pane.setVgap(5);
		pane.setHgap(5);

		// Place the node in the pane
		pane.getChildren().addAll(new Label("First Name"), new TextField(), new Label("MI: "));
		TextField tfMi = new TextField();
		tfMi.setPrefColumnCount(1);
		pane.getChildren().addAll(tfMi,new Label("Last Name"),new TextField());
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane,200,250);
		primaryStage.setTitle("ShowFlowPane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
