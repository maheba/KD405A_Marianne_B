package se.mah.k3lara.skaneAPI.view;

import java.util.ArrayList;
import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Line;
import se.mah.k3lara.skaneAPI.model.Lines;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class TestClass {

	public static void main(String[] args) {
		/*Uppgift 3: Skapar sj�lva s�k-URL:en f�r �nskade start- och slutstationer med �nskat antal tr�ffar.*/
		String searchURL = Constants.getURL("80000","81216",20); //Malm� C = 80000,  Lund C, 81216 Malm� Gatorg 80100, H�ssleholm C 93070
		System.out.println(searchURL);
		System.out.println("// Results when searching:");
		
		/*Uppgift 3: H�r anv�nds URL:en fr�n ovan och g�r en s�kning hos Sk�netrafiken samt lagrar resultaten.*/
		Journeys journeys = Parser.getJourneys(searchURL);
		for (Journey journey : journeys.getJourneys()) {
			System.out.print(journey.getStartStation()+" - ");
			System.out.print(journey.getEndStation());
			String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
			System.out.println(" Departs " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. And it is "+journey.getDepTimeDeviation()+" min late");
		} 
		
	   System.out.println("// Stations when searching for stations containing \"Malm\"");
	   /*Uppgift 3: H�r skapar man en ny ArrayList av typen Station, som �r en klass, och d�per listan till searchStations.*/
		ArrayList<Station> searchStations = new ArrayList<Station>(); 
		/*Uppgift 3: G�r en s�kning hos Sk�netrafiken p� alla stationer som inneh�ller �nskad text, h�r "Malm", och l�gger till dem i ArrayListan som heter searchStations.*/
		searchStations.addAll(Parser.getStationsFromURL("Malm"));
		for (Station s: searchStations){
			System.out.println(s.getStationName() +" number:" +s.getStationNbr());
		}
		
		System.out.println("// Busses departing from Ub�tshallen stationsnummer 80046 ");
		Lines lines = Parser.getStationResults(new Station("80046"));
		for (Line l : lines.getLines()) {
			System.out.println("Line " + l.getLine() +" departs: "+l.getDepTime().get(Calendar.HOUR_OF_DAY)+":"+l.getDepTime().get(Calendar.MINUTE)+
					" and is "+l.getDepTimeDeviation()+" minutes late");
		}
	}
}

