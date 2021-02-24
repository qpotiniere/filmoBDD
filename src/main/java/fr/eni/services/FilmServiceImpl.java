package fr.eni.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import fr.eni.bo.Avis;
import fr.eni.bo.Film;
import fr.eni.bo.Genre;
import fr.eni.bo.Participant;

@Service
public class FilmServiceImpl implements FilmService {
	
	ArrayList<Film> films = new ArrayList<Film>();
	
	public ArrayList<Film> lesFilms(){
		ArrayList<Participant> acteurs = new ArrayList<Participant>();
		acteurs.add(new Participant("DiCaprio", "Leonardo"));
		acteurs.add(new Participant("Winselt", "Kate"));
		films.add(new Film(0,"Titanic0", 2005, new Genre(1,"romantic"), new Participant("James", "Cameron") , "1h30 min", acteurs , "En 1997, l'épave du Titanic est l'objet d'une exploration fièvreuse"));
		films.add(new Film(1,"Titanic1", 2005, new Genre(1,"romantic"), new Participant("James", "Cameron") , "1h30 min", acteurs , "En 1997, l'épave du Titanic est l'objet d'une exploration fièvreuse"));
		films.add(new Film(2,"Titanic2", 2005, new Genre(1,"romantic"), new Participant("James", "Cameron") , "1h30 min", acteurs , "En 1997, l'épave du Titanic est l'objet d'une exploration fièvreuse"));
		return films;
	}

	@Override
	public ArrayList<Film> ajouterUnFilm() {
		ArrayList<Participant> acteurs = new ArrayList<Participant>();
		acteurs.add(new Participant("DiCaprio", "Leonardo"));
		acteurs.add(new Participant("Winselt", "Kate"));
		Film film = new Film(3,"Titanic3", 2005, new Genre(1,"romantic"), new Participant("James", "Cameron") , "1h30 min", acteurs , "En 1997, l'épave du Titanic est l'objet d'une exploration fièvreuse");
		lesFilms().add(film);
		return lesFilms();
		// TODO Auto-generated method stub
	}

	@Override
	public Film detailFilm(int idFilm) {
		return lesFilms().get(idFilm);
	}

	@Override
	public ArrayList<Film> listFilm() {
		return lesFilms();
	}
	
	//A faire si le temps
	@Override
	public void ajouterUnAvis(Avis avis) {
		// TODO Auto-generated method stub

	}
}
