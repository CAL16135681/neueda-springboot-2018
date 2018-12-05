package uk.ac.belfastmet.dwarf.controller;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarf.domain.Dwarf;
import uk.ac.belfastmet.dwarf.repository.DwarfRepository;
import uk.ac.belfastmet.dwarf.service.DwarfService;

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
	
	//<!-- paso 3, lo puse aqui debajo-->
	@GetMapping("/view/{dwarfId}")
	public String viewDwarf(@PathVariable("dwarfId") Integer dwarfId,  Model model) { 
		model.addAttribute("pageTitle", "View");
		model.addAttribute("dwarf",this.dwarfRepository.findByDwarfId(dwarfId));
		return "viewDwarf";
	}
	
	
	
	
	
	
	
	
}