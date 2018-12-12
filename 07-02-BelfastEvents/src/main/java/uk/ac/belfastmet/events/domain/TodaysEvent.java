package uk.ac.belfastmet.events.domain;


//import java.util.Map;

import lombok.Data;

@Data
public class TodaysEvent {
	
	private AllEvents allEvents;
	
	public String toString() {
		
		
		return allEvents.toString() ;
		
	}
	
	

}
