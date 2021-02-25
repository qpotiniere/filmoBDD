package fr.eni.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.eni.bo.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer>{

}
