package fr.eni.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.eni.bo.Participant;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Integer> {

}
