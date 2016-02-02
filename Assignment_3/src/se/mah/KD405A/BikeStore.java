package se.mah.KD405A;

import java.util.ArrayList;

public class BikeStore {
	private ArrayList<Bike> bikes;

	//Constructor
	
	/**Creates a BikeStore which consists of an ArrayList with Bikes*/
	public BikeStore() {
		this.bikes = new ArrayList<Bike>();
	}
	
	//Methods

	/**A method to get all the Bikes in the ArrayList of the BikeStore*/
	public String getAllBikes() {
		String s = "";
		for (int i=0; i<bikes.size(); i++) {
			s += "Cykel " + (i+1) + ": Färg ";
			s += bikes.get(i).getColor();
			s += ", Storlek ";
			s += bikes.get(i).getSize();
			s += " tum, Pris ";
			s += bikes.get(i).getPrice();
			s += " kr \n";	
		}
		return(s);
	}
	/**A method to add Bikes to the ArrayList of the BikeStore*/
	public void addBike(String color, int size, int price){
		Bike b = new Bike (color, size, price);
		this.bikes.add(b);
	}
}

//String
//Loopa alla cyklar och lägg till sträng
//Returnera strängen