package fr.eni.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.eni.bo.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer>{

}
