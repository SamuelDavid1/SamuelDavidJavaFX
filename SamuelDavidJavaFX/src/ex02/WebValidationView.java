package ex02;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WebValidationView {
	private WebValidationModel model;
	private Stage primaryStage;
	protected TextArea inputField;
	protected Button btn1;
	
	protected WebValidationView(Stage primaryStage, WebValidationModel model) {
		this.primaryStage = primaryStage;
		this.model = model;
		primaryStage.setTitle("Web Adress Validation");
		
		VBox v1 = new VBox();
		inputField = new TextArea();
		btn1 = new Button("GO");
		
		v1.getChildren().addAll(inputField, btn1);
		
		Scene scene = new Scene(v1);
		primaryStage.setScene(scene);
		
	}
	
	public void start() {
		primaryStage.show();
	}

}
