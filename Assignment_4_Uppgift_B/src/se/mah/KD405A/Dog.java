package se.mah.KD405A;

public class Dog extends Mammal {
	private boolean stupid;

	//Constructors
	/**Creates a Dog with instance-variables latinName, gestationTime and stupid*/
	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;
		this.friendlyName = friendlyName;
	}
	/**Creates a Dog with instance-variables latinName, gestationTime, stupid and friendlyName*/
	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName) {
		super(latinName, gestationTime);
		this.stupid = stupid;
		this.friendlyName = friendlyName;
	}

	//Methods
	/**Animals abstract-method getInfo implemented*/
	public String getInfo() {
		String s = "The dog named '" + super.getFriendlyName() + "' lat: '" + latinName + "' nurses for " + super.getGestationTime() + " months and is ";
		if (this.isStupid()) {
			s+="stupid";
		} else {
			s+="not stupid";
		}
		return s;
	}
	/**A method to see if the Dog is stupid*/
	public boolean isStupid() {
		if (stupid) {
			return true;
		} else {
			return false;
		}
	}
}
