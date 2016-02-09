package se.mah.KD405A;

public class Dog {
	
	private String name;

	//Constructor
	/**Creates a Dog with instance-variable name*/
	public Dog(String name) {
		this.name = name;
		//printa i errorrutan String "Hunden saknar ägare"
	}
	//Method
	/**A method to get the name of the Dog*/
	public String getName() {
		return this.name;
	}
}
