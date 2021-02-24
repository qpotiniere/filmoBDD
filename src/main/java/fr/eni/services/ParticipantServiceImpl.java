package fr.eni.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.bo.Participant;
import fr.eni.dal.ParticipantRepository;

@Service
public class ParticipantServiceImpl implements ParticipantService{

	@Autowired
	private ParticipantRepository participantRepo;

	@Override
	public ArrayList<Participant> listParticipant() {
		return (ArrayList<Participant>) participantRepo.findAll();
	}

	@Override
	public Participant participantById(Integer id) {
		return participantRepo.findById(id).get();
	}

	@Override
    public ArrayList<Participant> participantByListId(ArrayList<Integer> ids) {
		ArrayList<Participant> listParticipants = new ArrayList<>();

        for (Integer id: ids){
            listParticipants.add(participantRepo.findById(id).get());
        }

        return listParticipants;
    }
}
