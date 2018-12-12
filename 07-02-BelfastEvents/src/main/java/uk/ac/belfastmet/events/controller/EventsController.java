package uk.ac.belfastmet.events.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.events.domain.TodaysEvent;


@Controller
@RequestMapping
public class EventsController {
	
	@GetMapping("")
	public String home () {
		
		return "home";
	}
	
	@GetMapping("/events/{allEvents}")
	public String belfast(@PathVariable("allevents") String location, Model model) {
		
		//build for the 3 cities
		String belfastEventsUrl="https://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		RestTemplate restTemplate1 = new RestTemplate();
		TodaysEvent todaysEvent = restTemplate1.getForObject(belfastEventsUrl, TodaysEvent.class);
		
		
		
		//slf4j-----morado y el rojo, q sea el slf4j (mirar arriba)
		Logger logger = LoggerFactory.getLogger(TodaysEvent.class);
		logger.info(todaysEvent.toString());
		
		
					model.addAttribute("todaysEvent", todaysEvent);
		return "event";
		
	}
	

}
