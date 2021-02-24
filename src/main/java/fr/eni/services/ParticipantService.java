package fr.eni.services;

import java.util.ArrayList;

import fr.eni.bo.Participant;

public interface ParticipantService {
	
	public ArrayList<Participant> listParticipant();

	public Participant participantById(Integer id);

	ArrayList<Participant> participantByListId(ArrayList<Integer> ids);
}
