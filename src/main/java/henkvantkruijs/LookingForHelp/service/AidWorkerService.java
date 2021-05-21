package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.TakeAction;

import java.util.List;

public interface AidWorkerService {

    long createAidWorker(AidWorker aidWorker);
    void updateAidWorker(long id, AidWorker aidWorker);
    List<AidWorker> getAllAidWorkers();
    AidWorker getAidWorker(long id);
    List<AidWorker> getAidWorkersAidWorkerNameStartsWith(String aidWorkerName);
    void save(AidWorker aidWorker);
    void deleteById(long id);
}
