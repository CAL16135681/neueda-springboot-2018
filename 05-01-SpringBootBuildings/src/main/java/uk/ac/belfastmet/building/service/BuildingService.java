package uk.ac.belfastmet.building.service;

import java.util.ArrayList;

import uk.ac.belfastmet.building.domain.Building; 


public class BuildingService {
	
	public BuildingService() {
		super();
	}
	
	public ArrayList<Building> getVolumeBuildings(){
		
		ArrayList<Building> buildings = new ArrayList<Building>();
		
		
		Building boeingeverett = new Building("Boeing Everett Factory", "EEUU", "Washington", "boeingeverett.jpeg", "map");
		buildings.add(boeingeverett);		
		Building mecca = new Building("Great Mosque of Mecca", "Saudi Arabia", "Hijaz-Saudi Arabia", "mecca.jpeg", "map");
		buildings.add(mecca);	
		Building airbus = new Building("Airbus Plant", "France", "Toulouse", "airbus.jpeg", "map");
		buildings.add(airbus);	
		Building boeingwing = new Building("Boeing Composite Wing Center", "EEUU", "Washington", "boeingwing.jpeg", "map");
		buildings.add(boeingwing);	
		Building aerium = new Building("Aerium", "Germany", "Brandenburg", "aerium.jpeg", "map");
		buildings.add(aerium);	
		
		return buildings;
	}
	
	public ArrayList<Building> getFootprintBuildings(){
		
		ArrayList<Building> buildings = new ArrayList<Building>();
		
		
		Building aalsmeer  = new Building("Aalsmeer Flower ", "Netherlands", "Aalsmeer", "aalsmeer.jpeg", "map");
		buildings.add(aalsmeer);		
		Building dubai = new Building("The Dubai Mall", " United Arab Emirates", "Dubai", "dubai.jpeg", "map");
		buildings.add(dubai);	
		Building tesla = new Building("Tesla Factory", "EEUU", "California", "tesla.jpeg", "map");
		buildings.add(tesla);	
		Building boeingeverett2 = new Building("Boeing Composite Wing Center", "EEUU", "Washington", "boeingeverett2.jpeg", "map");
		buildings.add(boeingeverett2);	
		Building texas = new Building("Daikin Texas", "EEUU", "Texas", "texas.jpeg", "map");
		buildings.add(texas);
		
		return buildings;
	}
	
	
	public ArrayList<Building> getFloorareaBuildings(){
		
		ArrayList<Building> buildings = new ArrayList<Building>();
		
		
		Building newcentury  = new Building("New Century Global Center ", "China", "Chengdu", "newcentury.jpeg", "map");
		buildings.add(newcentury);		
		Building dubaiairport = new Building("Dubai International Airport", " United Arab Emirates", "Dubai", "dubaiairport.jpeg", "map");
		buildings.add(dubaiairport);	
		Building abraj = new Building("Abraj Al-Bait Endowment", "Saudi Arabia", "Mecca", "abraj.jpeg", "map");
		buildings.add(abraj);	
		Building centralworld = new Building("CentralWorld", "Thailand", "Bangkok", "centralworld.jpeg", "map");
		buildings.add(centralworld);	
		Building texas = new Building("Daikin Texas", "EEUU", "Texas", "texas.jpeg", "map");
		buildings.add(texas);	
		
		return buildings;
	}
	
	
	
	
}