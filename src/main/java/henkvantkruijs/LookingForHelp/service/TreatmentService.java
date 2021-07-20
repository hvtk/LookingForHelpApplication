package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.TakeAction;
import henkvantkruijs.LookingForHelp.model.Treatment;

import java.util.List;

public interface TreatmentService {

    List<Treatment> getAllTreatments();
    Treatment getTreatment(long id);
    List<Treatment> getTreatmentsTreatmentNameStartsWith(String treatmentName);
    void save(Treatment treatment);
    void deleteById(long id);
    void updateTreatment(long id, Treatment treatment);
}
