package ex01;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorView {
	private CalculatorModel model;
	private Stage stage;
	protected Label lblResult;
	protected Button b1, b2, b3, b4, b5, b6, b7, b8, b9, bPlus, bClear, bResult;
	
	protected CalculatorView(Stage stage, CalculatorModel model) {
		this.stage = stage;
		this.model = model;
		stage.setTitle("Calculator");
		
		GridPane pane = new GridPane();
		lblResult = new Label();
		pane.add(lblResult, 0, 0, 3, 1);
		
		b1 = new Button();
		b1.setText("1");
		pane.add(b1, 0, 1);
		
		b2 = new Button();
		b2.setText("2");
		pane.add(b2, 1, 1);
		
		b3 = new Button();
		b3.setText("3");
		pane.add(b3, 2, 1);
		
		b4 = new Button();
		b4.setText("4");
		pane.add(b4, 0, 2);
		
		b5 = new Button();
		b5.setText("5");
		pane.add(b5, 1, 2);
		
		b6 = new Button();
		b6.setText("6");
		pane.add(b6, 2, 2);
		
		b7 = new Button();
		b7.setText("7");
		pane.add(b7, 0, 3);
		
		b8 = new Button();
		b8.setText("8");
		pane.add(b8, 1, 3);
		
		b9 = new Button();
		b9.setText("9");
		pane.add(b9, 2, 3);
		
		bPlus = new Button();
		bPlus.setText("+");
		pane.add(bPlus, 0, 4);
		
		bClear = new Button();
		bClear.setText("C");
		pane.add(bClear, 1, 4);
		
		bResult = new Button();
		bResult.setText("=");
		pane.add(bResult, 2, 4);
		
		Scene scene = new Scene(pane);
		scene.getStylesheets().add(getClass().getResource("CalculatorMVC.css").toExternalForm());
		stage.setScene(scene);
		
	}
	
	public void start() {
		stage.show();
	}
	
	public void stop() {
		stage.hide();
	}
	
	public Stage getStage() {
		return stage;
	}

}
