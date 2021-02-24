package fr.eni.services;

import java.util.ArrayList;

import fr.eni.bo.Avis;
import fr.eni.bo.Film;

public interface FilmService {
	
	public ArrayList<Film> ajouterUnFilm();
	
	public void ajouterUnAvis(Avis avis);
	
	public Film detailFilm(int idFilm);
	
	public ArrayList<Film> listFilm();
}
