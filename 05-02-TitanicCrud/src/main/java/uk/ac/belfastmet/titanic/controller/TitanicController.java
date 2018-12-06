package uk.ac.belfastmet.titanic.controller;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import uk.ac.belfastmet.titanic.domain.Titanic;
import uk.ac.belfastmet.titanic.repository.TitanicRepository;


@Controller
@RequestMapping
public class TitanicController {

	TitanicRepository titanicRepository; 

	public TitanicController(TitanicRepository titanicRepository) {
		super();
		this.titanicRepository = titanicRepository;
	}


	@GetMapping("/passengersPage")
	public String passengers(Model model) {
		return "passengersPage";
	}
	
	//<!-- paso 3, lo puse aqui debajo-->
	@GetMapping("/view/{passengerid}")
	public String viewPassengers(@PathVariable("passengerid") Integer passengerid,  Model model) { 
		model.addAttribute("pageTitle", "View");
		model.addAttribute("titanic",this.titanicRepository.findBypassengerid(passengerid));
		return "viewPassengers";
	}

	
	//<!--  1.3 thursday-->
	@GetMapping("/add")
	public String addPassenger(Model model) {
		model.addAttribute("pageTitle", "Add");
		model.addAttribute("titanic", new Titanic());
	return "editPassengers";
	}

	@PostMapping("/save")
	public String savePassenger(@Valid Titanic passenger, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors())
		{
		return "editPassengers";
		}else {
		Titanic savedPassenger = this.titanicRepository.save(passenger);
		return "redirect:/view/"+ passenger.getPassengerid();
		}
	}
	
	
}