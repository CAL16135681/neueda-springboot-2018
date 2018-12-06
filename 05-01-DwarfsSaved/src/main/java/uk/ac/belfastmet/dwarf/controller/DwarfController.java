package uk.ac.belfastmet.dwarf.controller;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	//<!-- 1.3-->
	@GetMapping("/view/{dwarfId}")
	public String viewDwarf(@PathVariable("dwarfId") Integer dwarfId,  Model model) { 
		model.addAttribute("pageTitle", "View");
		model.addAttribute("dwarf",this.dwarfRepository.findByDwarfId(dwarfId));
		return "viewDwarf";
	}
	
	//<!--  2.1 -->
	@GetMapping("/dwarfs")
	public String allDwarfs(Model model) {
		model.addAttribute("pageTitle", "All");
		model.addAttribute("dwarfs", this.dwarfRepository.findAll());
		return "dwarfPage";
	}
	
	//<!--  1.3 thursday-->
	@GetMapping("/add")
	public String addDwarf(Model model) {
		model.addAttribute("pageTitle", "Add");
		model.addAttribute("dwarf", new Dwarf());
	return "editDwarf";
	}
	
	//<!--  1.3 thursday-->
	@GetMapping("/edit/{dwarfId}")
	public String editDwarf(@PathVariable ("dwarf") Integer dwarfId, Model model) {
		model.addAttribute("pageTitle", "Edit");
		model.addAttribute("dwarf", this.dwarfRepository.findByDwarfId(dwarfId));
	return "editDwarf";
	}
	
	
	//<!--  1.3 thursday-->
	@PostMapping("/save")
	public String saveDwarf(@Valid Dwarf dwarf, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors())
		{
		return "editDwarf";
		}else {
		Dwarf savedDwarf = this.dwarfRepository.save(dwarf);
		return "redirect:/view/"+ dwarf.getDwarfId();
		}
	}
	
	
	
	
}