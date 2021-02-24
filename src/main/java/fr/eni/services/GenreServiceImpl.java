package fr.eni.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.bo.Genre;
import fr.eni.dal.GenreRepository;

@Service
public class GenreServiceImpl implements GenreService {

	@Autowired
	private GenreRepository genreRepo;

	@Override
	public ArrayList<Genre> listGenre() {
		return (ArrayList<Genre>) genreRepo.findAll();
	}

	@Override
    public Genre genreById(Integer id) {
        return genreRepo.findById(id).get();
    }

}
