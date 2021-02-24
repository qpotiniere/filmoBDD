package fr.eni.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.bo.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {

}
