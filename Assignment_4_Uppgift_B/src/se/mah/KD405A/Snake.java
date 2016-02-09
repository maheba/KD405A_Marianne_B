package se.mah.KD405A;

public class Snake extends Animal {
	
	private boolean poisonus;

	//Constructor
	/**Creates a Snake with instance-variables latinName and poisonus*/
	public Snake(String latinName, boolean poisonus) {
		super(latinName);
		this.poisonus = poisonus;
	}
	
	//Methods
	/**A method to check if the Snake is poisonus*/
	public boolean isPoisonus() {
		if (poisonus) {
			return true;
		} else {
			return false;
		}
	}
	/**Animals abstract-method getInfo implemented*/
	public String getInfo() {
		String s = "The snake named 'noname' lat: '" + latinName + "' is ";
		if (this.isPoisonus()) {
			s+="poisonus";
		} else {
			s+="not poisonus";
		}
		return s;
	}
}
