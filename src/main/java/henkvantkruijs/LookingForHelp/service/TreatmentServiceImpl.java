package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.IdNotFoundException;
import henkvantkruijs.LookingForHelp.model.TakeAction;
import henkvantkruijs.LookingForHelp.model.Treatment;
import henkvantkruijs.LookingForHelp.repository.TakeActionRepository;
import henkvantkruijs.LookingForHelp.repository.TreatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreatmentServiceImpl implements TreatmentService {

    @Autowired
    private TreatmentRepository treatmentRepository;

    @Override
    public List<Treatment> getAllTreatments() {
        return treatmentRepository.findAll();
    }

    @Override
    public List<Treatment> getTreatmentsTreatmentNameStartsWith(String treatmentName) {
        return treatmentRepository.findAllByTreatmentNameStartsWith(treatmentName);
    }

    @Override
    public Treatment getTreatment(long id) {
        if (treatmentRepository.existsById(id)) {
            return treatmentRepository.findById(id).get();
        }
        else {
            throw new IdNotFoundException("No Treatment with id " + id);
        }
    }

    @Override
    public void save(Treatment treatment) {
        treatmentRepository.save(treatment);
    }

    @Override
    public void deleteById(long id) {
        treatmentRepository.deleteById(id);
    }
}

