package uk.ac.belfastmet.sbcontroller.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/toystory")
public class ToyStory {

	@GetMapping("/woody")
	public String woody(Model model) {
		return "woody was played by Tom Hanks";
	}
	
	@GetMapping("/buzz")
	public String buzz(Model model) {
		return "Buzz was played by Tim Allen";
	}
	
	@GetMapping("/slinky")
	public String slinky(Model model) {
		return "Slinky was played by Jim Varney";
	}
	
	@GetMapping("/ham")
	public String ham(Model model) {
		return "Ham was played by John  Ratzenberger";
	}
	
	
	@GetMapping("/rex")
	public String rex(Model model) {
		return "Rex was played by Wallace  Shawn";
	}
	
	
	@GetMapping("/mrPotatoHead")
	public String mrPotatoHead(Model model) {
		return "Mr Potato Head was played by Don Rickles";
	}
	
	
	
	
	
	
	
	
	
}
