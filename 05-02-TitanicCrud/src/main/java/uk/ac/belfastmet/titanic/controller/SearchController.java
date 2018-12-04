package uk.ac.belfastmet.titanic.controller;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.titanic.domain.Titanic;
import uk.ac.belfastmet.titanic.repository.TitanicRepository;

@Controller
@RequestMapping
public class SearchController {

	TitanicRepository titanicRepository; 



	public SearchController(TitanicRepository titanicRepository) {
		super();
		this.titanicRepository = titanicRepository;
	}
	
	@GetMapping("/searchid")
	public String passengerid(@RequestParam("id") Integer passengerid, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("titanic",this.titanicRepository.findBypassengerid(passengerid));
		return "passengersPage";
	}


}