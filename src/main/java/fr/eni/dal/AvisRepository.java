package fr.eni.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.eni.bo.Avis;

@Repository
public interface AvisRepository extends JpaRepository<Avis, Integer> {

}
