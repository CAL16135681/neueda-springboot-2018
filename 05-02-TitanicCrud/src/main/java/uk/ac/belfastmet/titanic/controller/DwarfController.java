package uk.ac.belfastmet.titanic.controller;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titanic.domain.Dwarf;
import uk.ac.belfastmet.titanic.repository.DwarfRepository;
import uk.ac.belfastmet.titanic.service.DwarfService;

@Controller
@RequestMapping
public class DwarfController {

	DwarfRepository dwarfRepository; 

	public DwarfController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}


	@GetMapping("/tolkien")
	public String disney(Model model) {
		
		
		model.addAttribute("tolkiendwarfs",this.dwarfRepository.findByAuthor("Tolkien"));
		return "tolkien";
	}


	@GetMapping("/disney")
	public String tolkien(Model model) {
		
		
		model.addAttribute("disneydwarfs",this.dwarfRepository.findByAuthor("Disney"));
		return "disney";
	}
	
}