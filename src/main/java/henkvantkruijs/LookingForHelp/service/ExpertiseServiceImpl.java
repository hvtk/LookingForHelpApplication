package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.DatabaseErrorException;
import henkvantkruijs.LookingForHelp.exception.IdNotFoundException;
import henkvantkruijs.LookingForHelp.exception.RecordNotFoundException;
import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.Expertise;
import henkvantkruijs.LookingForHelp.model.TakeAction;
import henkvantkruijs.LookingForHelp.repository.ExpertiseRepository;
import henkvantkruijs.LookingForHelp.repository.TakeActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpertiseServiceImpl implements ExpertiseService {

    @Autowired
    private ExpertiseRepository expertiseRepository;

    @Override
    public List<Expertise> getAllExpertises() {
        return expertiseRepository.findAll();
    }

    @Override
    public List<Expertise> getExpertisesExpertiseNameStartsWith(String expertiseName) {
        return expertiseRepository.findAllByExpertiseNameStartsWith(expertiseName);
    }

    @Override
    public Expertise getExpertise(long id) {
        if (expertiseRepository.existsById(id)) {
            return expertiseRepository.findById(id).get();
        }
        else {
            throw new IdNotFoundException("No Expertise with id " + id);
        }
    }

    @Override
    public void save(Expertise expertise) {
        expertiseRepository.save(expertise);
    }

    @Override
    public void deleteById(long id) {
        expertiseRepository.deleteById(id);
    }

    @Override
    public void updateExpertise(long id, Expertise expertise) {
        if (expertiseRepository.existsById(id)) {
            try {
                Expertise existingExpertise = expertiseRepository.findById(id).orElse(null);
                existingExpertise.setExpertiseName(expertise.getExpertiseName());
                existingExpertise.setExpertiseAvailable(expertise.getExpertiseAvailable());
                expertiseRepository.save(existingExpertise);
            }
            catch (Exception ex) {
                throw new DatabaseErrorException();
            }
        }
        else {
            throw new RecordNotFoundException();
        }
    }

}

