package uk.ac.belfastmet.dwarf.controller;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarf.domain.Dwarf;
import uk.ac.belfastmet.dwarf.service.DwarfService;

@Controller
@RequestMapping("/disney")
public class DisneyController {
	
	@GetMapping("")
	public String home(Model model) {
		
		
		DwarfService dwarfService = new DwarfService();
		ArrayList<Dwarf> disneyDwarfs = dwarfService.getDisneyDwarfs();
		
		Dwarf mysteryDwarf = disneyDwarfs.get(4);
		
		model.addAttribute("pageTitle", "Disney!");
		model.addAttribute("disneydwarfs", disneyDwarfs);
		return "disney";
	}

}