package uk.ac.belfastmet.building.domain;

public class BuildingFootprint extends Building {
	
		private String footprint;
		private String lengthxwidth;
		private String description;
	
	public BuildingFootprint() {
			super();
		}

	public BuildingFootprint(String name, String country, String place, String image, String map) {
		super(name, country, place, image, map);
		// TODO Auto-generated constructor stub
	}

}
