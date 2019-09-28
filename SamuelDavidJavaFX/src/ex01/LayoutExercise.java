package ex01;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
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
		 
		Button btn5 = new Button("left");
		Button btn6 = new Button("right");
		
		TextArea t1 = new TextArea("Lorem ipsum dolor sit amet,\n consetetur sadipscing elitr,\n sed diam nonumy eirmod tempor\n invidunt ut labore et dolore\n magna aliquyam erat, sed diam\n voluptua. At vero eos et accusam\n et justo duo dolores et ea rebum.\n Stet clita kasd gubergren, no sea\n takimata sanctus est Lorem ipsum\n dolor sit amet. Lorem ipsum dolor\n sit amet, consetetur sadipscing\n elitr, sed diam nonumy eirmod\n tempor invidunt ut labore et\n dolore magna aliquyam erat, sed\n diam voluptua. At vero eos et\n accusam et justo duo dolores et\n ea rebum. Stet clita kasd\n gubergren, no sea takimata sanctus\n est Lorem ipsum dolor sit amet.");
		
		BorderPane root = new BorderPane();
		
		VBox v1 = new VBox();
		v1.getChildren().addAll(btn1, btn2, btn3, btn4);
		
		
		HBox h1 = new HBox();
		h1.getChildren().addAll(btn5, btn6);
		h1.setSpacing(150);	
	
		
		VBox v2 = new VBox();
		v2.getChildren().add(t1);
		v2.getChildren().add(h1);
		
		
		root.setLeft(v1);
		root.setCenter(v2);
	
		
		Scene scene = new Scene(root, 300, 250);
		
		primaryStage.setTitle("Layout exercise");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
