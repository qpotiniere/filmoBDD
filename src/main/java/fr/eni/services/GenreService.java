package fr.eni.services;

import java.util.ArrayList;

import fr.eni.bo.Genre;

public interface GenreService {
	
	public ArrayList<Genre> listGenre();

	public Genre genreById(Integer id);

}
