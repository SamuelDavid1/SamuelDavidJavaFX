package ex02;

public class WebValidationController {
	final private WebValidationModel model;
	final private WebValidationView view;
	
	protected WebValidationController(WebValidationModel model, WebValidationView view) {
		this.model = model;
		this.view = view;
		
		view.inputField.textProperty().addListener((observable, oldValue, newValue) -> validateWebAdress(newValue));
	}
	
	private void validateWebAdress(String newValue) {
		boolean valid = false;
		
		
		
	}

}
