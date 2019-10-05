package ex02;

import java.util.ArrayList;

import ex02.Pet;
import javafx.beans.property.SimpleObjectProperty;

public class PetModel {
	
	ArrayList<Pet> pets = new ArrayList<Pet>();
	
	private final SimpleObjectProperty<Pet> petProperty = new SimpleObjectProperty<>();
	
	public void savePet(Pet.Species species, Pet.Gender gender, String name) {
		petProperty.set(new Pet(species, gender, name));	
		pets.add(getPet());
	}
	
	public void deletePet() {
		petProperty.set(null);
	}
	
	public Pet getPet() {
		return petProperty.get();
	}
	
	public SimpleObjectProperty<Pet> petProperty() {
		return petProperty;
	}
}
