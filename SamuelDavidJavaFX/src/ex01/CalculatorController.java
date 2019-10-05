package ex01;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class CalculatorController implements EventHandler<ActionEvent> {
	final private CalculatorModel model;
	final private CalculatorView view;
	
	protected CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
		
		for (Button b : view.digits) {
			b.setOnAction(this);
		}
		
		view.bPlus.setOnAction(this);
		view.bClear.setOnAction(this);
		view.bResult.setOnAction(this);
	}

	@Override
	public void handle(ActionEvent event) {
		Button btn = (Button) event.getSource();
		
		if (btn == view.bClear) {
			view.lblResult.setText("");
		} else if (btn == view.bResult) {
			String result = model.calculate(view.lblResult.getText());
			view.lblResult.setText(result);
		} else { // All other buttons: append button.text to text-field
			view.lblResult.setText(view.lblResult.getText() + btn.getText());;
		}
	}
}
