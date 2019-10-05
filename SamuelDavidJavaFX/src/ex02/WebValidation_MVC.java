package ex02;

import javafx.application.Application;
import javafx.stage.Stage;

public class WebValidation_MVC extends Application {
	
		private WebValidationModel model;
		private WebValidationView view;
		private WebValidationController controller;
		
		public static void main(String[] args) {
			launch();
		}

		public void start(Stage primaryStage) {
			this.model = new WebValidationModel();
			this.view = new WebValidationView(primaryStage, model);
			this.controller = new WebValidationController(model, view);
			view.start();
		}

}
