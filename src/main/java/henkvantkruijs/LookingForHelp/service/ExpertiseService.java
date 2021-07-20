package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.Expertise;
import henkvantkruijs.LookingForHelp.model.TakeAction;

import java.util.List;

public interface ExpertiseService {

    List<Expertise> getAllExpertises();
    Expertise getExpertise(long id);
    List<Expertise> getExpertisesExpertiseNameStartsWith(String expertiseName);
    void save(Expertise expertise);
    void deleteById(long id);
    void updateExpertise(long id, Expertise expertise);

}
