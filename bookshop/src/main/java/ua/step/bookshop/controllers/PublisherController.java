package ua.step.bookshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ua.step.bookshop.repositories.PublisherRepository;

@Controller
public class PublisherController {
	
	@Autowired
	private PublisherRepository repo;
	
	@GetMapping("/publishers")
	public String getGenres(Model model) {
		
		model.addAttribute("genres", repo.findAll());
		
		return "genres";
		
	}

}