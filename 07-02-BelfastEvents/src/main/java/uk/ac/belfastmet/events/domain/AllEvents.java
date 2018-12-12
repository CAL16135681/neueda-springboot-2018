package uk.ac.belfastmet.events.domain;

import lombok.Data;

@Data
public class AllEvents {
	
	private String identifier;
	private String url;
	private String title;
	private String startDate;
	private String endDate;
	private String time;
	private String venue;
	private String venueUrl;
	private String image;
	private String audience;
	private String theme;
	private String cost;
	private String content;
	
	
	
	
	public String toString() {
		
		String allevents = "\n" + this.getIdentifier() + ", " 
				+ this.getUrl() + ", " 
				+ this.getTitle() + ", " 
				+ this.getStartDate() + ", " 
				+ this.getEndDate() + ", " 
				+ this.getTime() + ", " 
				+ this.getVenue() + ", " 
				+ this.getVenueUrl() + ", " 
				+ this.getImage() + ", " 
				+ this.getAudience() + ", " 
				+ this.getTheme() + ", " 
				+ this.getCost() + ", "
				+ this.getContent() + "\n";
		
		
		return allevents ;
		
	}
	

}
