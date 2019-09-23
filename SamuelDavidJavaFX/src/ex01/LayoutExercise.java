package ex01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LayoutExercise extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		
		Button btn1 = new Button("alpha");
		Button btn2 = new Button("beta");
		Button btn3 = new Button("delta");
		Button btn4 = new Button("gamma");
				
		
		BorderPane root = new BorderPane();
		
		VBox h1 = new VBox();
		h1.getChildren().addAll(btn1, btn2, btn3, btn4);
		
		
		root.setLeft(h1);
		
		Scene scene = new Scene(root, 150, 100);
		
		primaryStage.setTitle("Layout exercise");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
