package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.CostsAidWorkerTreatment;
import henkvantkruijs.LookingForHelp.model.MediaOption;

import java.util.List;

public interface CostsAidWorkerTreatmentService {

    List<CostsAidWorkerTreatment> getAllCostsAidWorkerTreatments();
    CostsAidWorkerTreatment getCostsAidWorkerTreatment(long id);
    List<CostsAidWorkerTreatment> getCostsAidWorkerTreatmentsCostsAidWorkerTreatmentPartStartsWith(String CostsAidWorkerTreatmentPart);
    void save(CostsAidWorkerTreatment costsAidWorkerTreatment);
    void deleteById(long id);
    void updateCostsAidWorkerTreatment(long id, CostsAidWorkerTreatment costsAidWorkerTreatment);
}
