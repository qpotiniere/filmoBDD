package fr.eni.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.services.FilmService;

@Controller
@RequestMapping("/films")
public class Filmcontroller {
	
	@Autowired
	private FilmService service;

	@GetMapping({"/list"})
	public String films(Model model) {
	    model.addAttribute("films", service.listFilm());
	    return "films";
	}
	
	@GetMapping({"/ajoutFilm"})
	public String add(Model model) {
	    model.addAttribute("films", service.ajouterUnFilm());
	    return "ajoutFilm";
	}
	
	@GetMapping({"/detailFilm/{id}"})
	public String detail(Model model, @PathVariable("id") int id) {
	    model.addAttribute("films", service.detailFilm(id));
	    return "detailFilm";
	}
}
