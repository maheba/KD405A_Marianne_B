package se.mah.KD405A;

public abstract class Mammal extends Animal {
	private int gestationTime;
	//Constructor
	/**Creates a Mammal with instance-variables latinName and gestationTime*/
	public Mammal(String latinName, int gestationTime) {
		super(latinName);
		this.gestationTime = gestationTime;
	}

	//Methods
	/**A method to set the friendlyName of the Animal*/
	public int getGestationTime() {
		return this.gestationTime;
	}

}
