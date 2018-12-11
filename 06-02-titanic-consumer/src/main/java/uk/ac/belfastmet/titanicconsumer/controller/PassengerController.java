package uk.ac.belfastmet.titanicconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.titanicconsumer.domain.AllPassengers;
import uk.ac.belfastmet.titanicconsumer.domain.Passenger;
import uk.ac.belfastmet.titanicconsumer.service.PassengerService;

@Controller
public class PassengerController {

	@Autowired
	PassengerService passengerService;
	AllPassengers allPassengers;
	
	public PassengerController() {
		super();
		}
	
	public PassengerController(PassengerService passengerService) {
		super();
		this.passengerService = passengerService;
	}
	
	
	public PassengerController(PassengerService passengerService, AllPassengers allPassengers) {
		super();
		this.passengerService = passengerService;
		this.allPassengers = allPassengers;
	}
	
	
	@GetMapping("/passengers")
	public String passengers(Model model) {
				
		model.addAttribute("passengers", this.passengerService.list());
		
		return "passengers";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("category") String category, @RequestParam("val") String val, @RequestParam("radioValue") String radioValue, Model model) {
				

		return "passengers";
	}
	
	
	
	
	
	@GetMapping("passengers/{passengerId}")
	public String view(@PathVariable("passengerId") Integer passengerId, Model model) {
		
		Passenger passenger = this.passengerService.get(passengerId);
		
		model.addAttribute("pageTitle", "View Passenger");
		model.addAttribute("passenger", passenger);
		
		return "view";
	}
	
	
	
	@GetMapping("/add")
	public String addPassenger(Model model) {
		model.addAttribute("pageTitle", "Add Passenger");
		
		Passenger passenger = new Passenger();
		model.addAttribute("passenger", passenger);
		return "editPassenger";	
	}
	
	@PostMapping("/save")
	public String save(Passenger passenger, @RequestParam("addUpdate") String addUpdate, Model model)
	
		if(addUpdate.equals("Add Passenger")) {
			this.passengerService.add(passenger);
			return "redirect:/titanic";
			else {
				this.passengerService.update(passenger);
				return "redirect:/titanic/view/" + passenger.getPassengerId();
				
			}	
			
		}
	
	
	
	
	
	
}
