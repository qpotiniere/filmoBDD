package fr.eni.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.bo.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer>{

}
