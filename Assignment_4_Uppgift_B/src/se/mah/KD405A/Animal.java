package se.mah.KD405A;

public abstract class Animal {
	
	protected String latinName;
	protected String friendlyName;

	//Constructor
	/**Creates an Animal with instance-variable latinName*/
	public Animal(String latinName) {
		this.latinName = latinName;
		//this.friendlyName = friendlyName;
	}
	
	//Methods
	/**An abstract method that all sub-classes must implement*/
	public abstract String getInfo();

	/**A method to set the friendlyName of the Animal*/
	public void setFriendlyName(String name) {
		this.friendlyName = name;
	}
	
	/**A method to get the friendlyName of the Animal*/
	public String getFriendlyName() {
		return this.friendlyName;
	}
}
