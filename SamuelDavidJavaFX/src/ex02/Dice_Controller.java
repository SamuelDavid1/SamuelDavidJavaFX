package ex02;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Dice_Controller {
	private Dice_Model model;
	private Dice_View view;

	public Dice_Controller(Dice_Model model, Dice_View view) {
		this.model = model;
		this.view = view;
		
		for (Button btn : view.dice) {
			// TODO: Event handler must call the "roll" method
			btn.setOnAction(this::roll);
		}
	}
	
	private void roll(ActionEvent e) {
		// Get the button that was clicked
		Button btn = (Button) e.getSource();
		
		// Roll a new value, and place the value into the button
		
		// TODO: get number from model, convert to string, display in view
		int number = model.getRandomValue();
		btn.setText(Integer.toString(number));
	}
}
