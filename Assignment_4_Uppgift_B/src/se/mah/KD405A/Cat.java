package se.mah.KD405A;

public class Cat extends Mammal {

	private int numberOfLives;

	//Constructors
	/**Creates a Dog with instance-variables latinName, gestationTime and numberOfLives*/
	public Cat(String latinName, int gestationTime, int numberOfLives) {
		super(latinName, gestationTime);
		this.numberOfLives = numberOfLives;
	}
	
	//Methods
	/**Animals abstract-method getInfo implemented*/
	public String getInfo() {
		return "The cat named 'noname' lat: '" + latinName + "' nurses for " + super.getGestationTime() + " months and has " + numberOfLives + " lives";
	}
	/**A method to get numberOfLives of the Cat*/
	public int getNumberOfLives() {
		return this.numberOfLives;
	}
	/**A method to get numberOfLives of the Cat*/
	public void setNumberOfLives(int i) {
		this.numberOfLives = i;
	}	
}
