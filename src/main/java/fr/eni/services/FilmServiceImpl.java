package fr.eni.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.eni.bo.Avis;
import fr.eni.bo.Film;
import fr.eni.bo.Genre;
import fr.eni.bo.Participant;
import fr.eni.dal.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService {
	
	@Autowired
	private FilmRepository filmRepo;
	
	@Override
	public ArrayList<Film> listFilm(){
		return (ArrayList<Film>) filmRepo.findAll();
	}

	@Override
	public Film detailFilm(Integer idFilm) {
		return filmRepo.findById(idFilm).get();
	}
	
	@Override
	public void ajouterUnFilm(Film film) {
		System.out.println(film);
		filmRepo.save(film);
	}

	//A faire si le temps
	@Override
	public void ajouterUnAvis(Avis avis) {
		// TODO Auto-generated method stub

	}
}
