package ex02;

import ex02.Pet;
import ex02.Pet.Gender;
import ex02.Pet.Species;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PetView {
	private Stage stage;
	private PetModel model;
	
	// Controls used for data processing
	Tab tab1 = new Tab();
	Tab tab2 = new Tab();
	TextField txtName = new TextField();
	ComboBox<Species> cmbSpecies = new ComboBox<>();
	ComboBox<Gender> cmbGender = new ComboBox<>();
	Label lblDataID = new Label();
	Label lblDataName = new Label();
	Label lblDataSpecies = new Label();
	Label lblDataGender = new Label();
    Text t1 = new Text();
	
	// Buttons
	Button btnSave = new Button("Save");
	Button btnDelete = new Button("Delete");
	Button refresh = new Button("Refresh");
	

	public PetView(Stage stage, PetModel model) {
		this.stage = stage;
		this.model = model;
		
		VBox root = new VBox();
		root.getChildren().add(createDataEntryPane());
		root.getChildren().add(createControlPane());
		root.getChildren().add(createDataDisplayPane());
		
		VBox show = new VBox();
		show.getChildren().add(showDataDisplayPane());
		
		
		tab1.setText("Tier erfassen");
		tab1.setClosable(false);
		tab1.setContent(root);
		
		tab2.setText("Liste");
		tab2.setClosable(false);
		tab2.setContent(show);
		
		TabPane tabPane = new TabPane();
		tabPane.getTabs().addAll(tab1, tab2);
		
		BorderPane top = new BorderPane();
		top.setTop(tabPane);		

		// Standard stuff for Scene and Stage
		Scene scene = new Scene(top);
		scene.getStylesheets().add(
				getClass().getResource("Pet.css").toExternalForm());
		stage.setTitle("Enter and display a pet");
		stage.setScene(scene);
		stage.show();
	}
	
	public void start() {
		stage.show();
	}

	private Pane createDataEntryPane() {
		GridPane pane = new GridPane();
		pane.setId("dataEntry");
		// Declare the individual controls in the GUI
		Label lblName = new Label("Name");
		Label lblSpecies = new Label("Species");
		Label lblGender = new Label("Gender");
		
		// Fill combos
		cmbSpecies.getItems().addAll(Pet.Species.values());
		cmbSpecies.setValue(Species.CAT);
		cmbGender.getItems().addAll(Pet.Gender.values());
		cmbGender.setValue(Gender.FEMALE);
		
		// Organize the layout, add in the controls (col, row)
		pane.add(lblName, 0, 0);		pane.add(txtName, 1, 0);
		pane.add(lblSpecies, 0, 1);		pane.add(cmbSpecies, 1, 1);
		pane.add(lblGender, 0, 2);	pane.add(cmbGender, 1, 2);
		
		return pane;
	}

	private Pane createControlPane() {
		GridPane pane = new GridPane();
		pane.setId("controlArea");
		pane.add(btnSave, 0, 0);
		pane.add(btnDelete, 1, 0);
		
		return pane;
	}

	private Pane createDataDisplayPane() {
		GridPane pane = new GridPane();
		pane.setId("dataDisplay");
		// Declare the individual controls in the GUI
	    Label lblID = new Label("ID");
		Label lblName = new Label("Name");
		Label lblSpecies = new Label("Species");
		Label lblGender = new Label("Gender");
		
		// Organize the layout, add in the controls (col, row)
	    pane.add(lblID, 0, 0); pane.add(lblDataID, 1, 0);
	    pane.add(lblName, 0, 1); pane.add(lblDataName, 1, 1);
	    pane.add(lblSpecies, 0, 2); pane.add(lblDataSpecies, 1, 2);
	    pane.add(lblGender, 0, 3); pane.add(lblDataGender, 1, 3);
	    
	    return pane;
	}
	
	private Pane showDataDisplayPane() {
		GridPane pane = new GridPane();
		pane.setId("showDisplay");
		pane.add(t1, 0, 0);
		pane.add(refresh, 0, 1);
	    
	    return pane;
	}
}
