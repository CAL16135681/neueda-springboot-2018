package uk.ac.belfastmet.building.controller;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.building.domain.Building;
import uk.ac.belfastmet.building.service.BuildingService;

@Controller
@RequestMapping
public class VolumeController {
	
	@GetMapping("/volume")
	public String home(Model model) {
		
		
		BuildingService buildingService = new BuildingService();
		ArrayList<Building> volumeBuildings = buildingService.getVolumeBuildings();
		
		
		model.addAttribute("pageTitle", "Volume!");
		model.addAttribute("volumeBuildings", volumeBuildings);
		return "volume";
	}

}
