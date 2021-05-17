package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.model.TakeAction;

import java.util.List;

public interface TreatmentService {

    List<TakeAction> getAllTakeActions();
    TakeAction getTakeAction(long id);
    List<TakeAction> getTakeActionsTakeActionNameStartsWith(String takeActionName);
    void save(TakeAction takeAction);
    void deleteById(long id);

}
