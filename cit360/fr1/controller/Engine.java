/*
 * @author Jeremy James Alkire
 */
package fr1.controller;

import java.util.Arrays;
import java.util.List;

import fr1.model.Athlete;
import fr1.view.RequestData;

public class Engine {
	
	public static void main(String args[]) {
		
		// Create a new athlete.
		Athlete athlete = new Athlete();
		
		// Request athlete data from the user.
		String data = RequestData.requestAthleteData();
		
		// Split data into a list of strings.
		List<String> dataList = Arrays.asList(data.split(","));
		
		// Configure athlete with the data contained in the list of strings.
		athlete.configureAthlete(dataList.get(0), 
				Integer.parseInt(dataList.get(1)), 
				Double.parseDouble(dataList.get(2)));
	}
}
