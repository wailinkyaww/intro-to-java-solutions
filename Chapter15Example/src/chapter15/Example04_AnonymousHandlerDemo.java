package chapter15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Example04_AnonymousHandlerDemo extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Hold two buttons in an HBox
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btNew = new Button("New");
		Button btOpen = new Button("Open");
		Button btSave = new Button("Save");
		Button btPrint = new Button("Print");
		hBox.getChildren().addAll(btNew, btOpen, btSave, btPrint);

		// Create and register the handler
		btNew.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Process New");
			}
		});

		btOpen.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Process Open");
			}
		});

		btSave.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Process Save");
			}
		});

		btPrint.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Process Print");
			}
		});

		// Create a Scene and place it in the stage
		Scene scene = new Scene(hBox, 300, 50);
		primaryStage.setTitle("AnonymousHandlerDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene on the stage
		primaryStage.show(); // Display the stage
	}
}
