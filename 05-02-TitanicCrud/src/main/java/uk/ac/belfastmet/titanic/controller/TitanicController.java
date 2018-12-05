package uk.ac.belfastmet.titanic.controller;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titanic.domain.Titanic;
import uk.ac.belfastmet.titanic.repository.TitanicRepository;


@Controller
@RequestMapping
public class TitanicController {

	TitanicRepository dwarfRepository; 

	public TitanicController(TitanicRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}


	@GetMapping("/passengersPage")
	public String disney(Model model) {
		return "passengersPage";
	}
	
	//<!-- paso 3, lo puse aqui debajo-->
	@GetMapping("/view/{passengerid}")
	public String viewPassengers(@PathVariable("passengerid") Integer passengerid,  Model model) { 
		model.addAttribute("pageTitle", "View");
		model.addAttribute("titanic",this.dwarfRepository.findBypassengerid(passengerid));
		return "viewPassengers";
	}


	
	
}