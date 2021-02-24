package fr.eni.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.bo.Film;

public interface FilmRepository extends JpaRepository<Film, Integer>{

}
