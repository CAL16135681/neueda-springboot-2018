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
	
	@GetMapping("/searchsurvived")
	public String survived(@RequestParam("survived") String survived, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("titanic",this.titanicRepository.findBysurvived(survived));
		return "passengersPage";
	}
	
	@GetMapping("/searchpclass")
	public String pclass(@RequestParam("pclass") String pclass, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("titanic",this.titanicRepository.findByPclass(pclass));
		return "passengersPage";
	}
	
	@GetMapping("/searchsex")
	public String sex(@RequestParam("sex") String sex, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("titanic",this.titanicRepository.findBySex(sex));
		return "passengersPage";
	}	
	
	
	@GetMapping("/searchage")
	public String age(@RequestParam("age") Integer age, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("titanic",this.titanicRepository.findByAge(age));
		return "passengersPage";
	}	
	

	


}