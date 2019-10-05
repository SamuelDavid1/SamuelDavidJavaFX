package ex01;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class CalculatorView {
	final private CalculatorModel model;
	final private Stage stage;
	
	protected TextField lblResult;
	protected Button bPlus, bClear, bResult;
	protected Button digits[] = new Button[10];
	
	protected CalculatorView(Stage stage, CalculatorModel model) {
		this.stage = stage;
		this.model = model;		
		
		BorderPane root = new BorderPane();	
		lblResult = new TextField();
		lblResult.setDisable(true);
		root.setTop(lblResult);
		
		
		GridPane pane = new GridPane();
		root.setCenter(pane);
		
		for (int i = 0; i < digits.length; i++) {
			digits[i] = new Button(Integer.toString(i));
		}
		
		// special add for button 0
		pane.add(digits[0], 0, 3, 3, 1);
		
		// add all other digits
		for (int i = 1; i < digits.length; i++) {
			pane.add(digits[i], (i-1) % 3, 2 - (i-1) / 3);
		}		
		
		bPlus = new Button();
		bPlus.setText("+");
		pane.add(bPlus, 3, 0);
		
		bClear = new Button();
		bClear.setText("C");
		pane.add(bClear, 3, 1);
		
		bResult = new Button();
		bResult.setText("=");
		pane.add(bResult, 3, 2, 1, 2);
		
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(25);
		pane.getColumnConstraints().addAll(cc, cc, cc, cc);
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(25);
		pane.getRowConstraints().addAll(rc, rc, rc, rc);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("CalculatorMVC.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Calculator");
		
	
	}
	
	public void start() {
		stage.show();
	}
	
	public void stop() {
		stage.hide();
	}
	
}
