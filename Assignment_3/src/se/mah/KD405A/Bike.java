package se.mah.KD405A;

public class Bike {
	private String color = "REGNBÅGSMÖNSTRAD";  //fåtal godkända färger
	private int price = 5555555;	//0-30000 kr
	private int size = 1000;   //8-28 tum

	
	//Constructors
	
	/**Creates a Bike with instance-variables color and size limited by values in Constants.java*/
	public Bike(String color, int size) {
		for (int i=0; i<5; i++) {
			if (color == Constants.COLORARRAY[i]) {
				this.color = color;
			} 
		}
		if (size >= Constants.MIN_SIZE && size <= Constants.MAX_SIZE) {
			this.size = size;
		}
	}
	/**Creates a Bike with instance-variables color, size and price limited by values in Constants.java*/
	public Bike(String color, int size, int price) {
		for (int i=0; i<5; i++) {
			//if (color == Constants.COLORARRAY[i].toString()) {
			if (0 == color.compareTo(Constants.COLORARRAY[i].toString())) {
				this.color = color;
				break;
			} 
		}
		if (size >= Constants.MIN_SIZE && size <= Constants.MAX_SIZE) {
			this.size = size;
		}
		if (price >= Constants.MIN_PRICE && price <= Constants.MAX_PRICE) {
			this.price = price;
		}
		//nbrOfBikes = nbrOfBikes +1;
	}

	//Methods
	
	/**A method to get the color of the bike*/
	public String getColor() {
		return this.color;
	}
	/**A method to get the size of the bike*/
	public int getSize() {
		return this.size;
	}
	/**A method to get the price of the bike*/
	public int getPrice() {
		return this.price;
	}
	
	/**Sets the size between 8 and 28 inches*/
	public void setSize(int size) {
		if (size >= Constants.MIN_SIZE && size <= Constants.MAX_SIZE) {
			this.size = size;
		}
	}

}
