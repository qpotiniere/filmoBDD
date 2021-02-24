package fr.eni.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.bo.Film;
import fr.eni.forms.FilmForm;
import fr.eni.services.FilmService;
import fr.eni.services.GenreService;
import fr.eni.services.ParticipantService;

@Controller
public class Filmcontroller {

	@Autowired
	private FilmService serviceFilm;
	@Autowired
	private GenreService serviceGenre;
	@Autowired
	private ParticipantService serviceParticipant;

	@GetMapping({""})
	public String films(Model model) {
	    model.addAttribute("films", serviceFilm.listFilm());
	    return "films";
	}
	
	@GetMapping({"/ajoutFilm"})
	public String add(Model model) {
		model.addAttribute("genres", serviceGenre.listGenre());
		model.addAttribute("acteurs", serviceParticipant.listParticipant());
        model.addAttribute("realisateurs", serviceParticipant.listParticipant());
	    model.addAttribute("film", new FilmForm());
	    return "ajoutFilm";
	}
	
	@PostMapping({"/ajoutFilm"})
    public String ajouterFilm(@ModelAttribute("film") FilmForm film) {
		
		System.out.println(film);
		
        Film newFilm = new Film();
        newFilm.setTitre(film.getTitre());
        newFilm.setAnnee(film.getAnnee());
        newFilm.setGenre(serviceGenre.genreById(film.getIdGenre()));
        newFilm.setReal(serviceParticipant.participantById(film.getIdRealisateur()));
        newFilm.setActeurs(serviceParticipant.participantByListId(film.getIdActeurs()));
        newFilm.setDuree(film.getDuree());
        newFilm.setSynopsis(film.getSynopsis());

        serviceFilm.ajouterUnFilm(newFilm);

        return "redirect:/";
    }
	
	@GetMapping({"/detailFilm/{id}"})
	public String detail(Model model, @PathVariable("id") Integer id) {
	    model.addAttribute("films", serviceFilm.detailFilm(id));
	    return "detailFilm";
	}
}
