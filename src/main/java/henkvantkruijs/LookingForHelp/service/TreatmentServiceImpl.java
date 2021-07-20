package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.DatabaseErrorException;
import henkvantkruijs.LookingForHelp.exception.IdNotFoundException;
import henkvantkruijs.LookingForHelp.exception.RecordNotFoundException;
import henkvantkruijs.LookingForHelp.model.AidWorker;
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

    @Override
    public void updateTreatment(long id, Treatment treatment) {
        if (treatmentRepository.existsById(id)) {
            try {
                Treatment existingTreatment = treatmentRepository.findById(id).orElse(null);
                existingTreatment.setTreatmentName(treatment.getTreatmentName());
                existingTreatment.setTreatmentWebbAddress(treatment.getTreatmentWebbAddress());
                treatmentRepository.save(existingTreatment);
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

