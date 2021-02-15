package chapter15;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Example06_LoadCalculator extends Application {
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfLoanAmount = new TextField();
	private TextField tfMonthlyPayment = new TextField();
	private TextField tfTotalPayment = new TextField();
	private Button btCalculate = new Button("Calculate");

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create UI
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("Annual Interest Rate"), 0, 0);
		gridPane.add(tfAnnualInterestRate, 1, 0);
		gridPane.add(new Label("Number Of Years"), 0, 1);
		gridPane.add(tfNumberOfYears, 1, 1);
		gridPane.add(new Label("Loan Amount"), 0, 2);
		gridPane.add(tfLoanAmount, 1, 2);
		gridPane.add(new Label("Monthly Payment"), 0, 3);
		gridPane.add(tfMonthlyPayment, 1, 3);
		gridPane.add(new Label("Total Payment"), 0, 4);
		gridPane.add(tfTotalPayment, 1, 4);
		gridPane.add(btCalculate, 1, 5);

		// Set properties for UI
		gridPane.setAlignment(Pos.CENTER);
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
		tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
		tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
		tfMonthlyPayment.setEditable(false);
		tfTotalPayment.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);

		// Process events
		btCalculate.setOnAction(e -> calculateLoanPayment());

		// Create a scene and place it in the stage
		Scene scene = new Scene(gridPane, 400, 250);
		primaryStage.setTitle("LoadCalculator"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public void calculateLoanPayment() {
		// Get Values from text fields
		double interest = Double.parseDouble(tfAnnualInterestRate.getText());
		int year = Integer.parseInt(tfNumberOfYears.getText());
		double loanAmonunt = Double.parseDouble(tfLoanAmount.getText());

		// Create a loan Object, defined in Listing 10.2
		Loan loan = new Loan(interest, year, loanAmonunt);

		// Display monthly payment and total payment
		tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
		tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
	}
}
