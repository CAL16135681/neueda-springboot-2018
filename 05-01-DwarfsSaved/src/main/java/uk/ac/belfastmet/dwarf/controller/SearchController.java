package uk.ac.belfastmet.dwarf.controller;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.dwarf.domain.Dwarf;
import uk.ac.belfastmet.dwarf.repository.DwarfRepository;
import uk.ac.belfastmet.dwarf.service.DwarfService;

@Controller
@RequestMapping
public class SearchController {

	DwarfRepository dwarfRepository; 



	public SearchController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	@GetMapping("/searchid")
	public String searchId(@RequestParam("id") Integer dwarfId, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("dwarfs",this.dwarfRepository.findByDwarfId(dwarfId));
		return "dwarfPage";
	}

	
	@GetMapping("/searchname")
	public String serachName (@RequestParam("name") String name, Model model) {
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("dwarfs",this.dwarfRepository.findByName(name));
		return "dwarfPage";
	}
	
	@GetMapping("/searchauthor")
	public String searchAuthor(@RequestParam("author") String author, Model model) {
		model.addAttribute("pateTitle", "Search!");
		model.addAttribute("dwarfs", this.dwarfRepository.findByAuthor(author));
		return "dwarfPage";
	}
	
	@GetMapping("/searchnameauthor")
	public String searchAuthor(@RequestParam("name") String name, @RequestParam("author") String author, Model model) {
		model.addAttribute("pateTitle", "Search!");
		model.addAttribute("dwarfs", this.dwarfRepository.findByNameAndAuthor(name, author));
		return "dwarfPage";
	}
	
	
	
	
	
}