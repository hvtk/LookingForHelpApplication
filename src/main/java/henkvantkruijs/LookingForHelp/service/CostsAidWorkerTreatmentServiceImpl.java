package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.IdNotFoundException;
import henkvantkruijs.LookingForHelp.model.CostsAidWorkerTreatment;
import henkvantkruijs.LookingForHelp.model.MediaOption;
import henkvantkruijs.LookingForHelp.repository.CostsAidWorkerTreatmentRepository;
import henkvantkruijs.LookingForHelp.repository.MediaOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostsAidWorkerTreatmentServiceImpl implements CostsAidWorkerTreatmentService {

    @Autowired
    private CostsAidWorkerTreatmentRepository costsAidWorkerTreatmentRepository;

    @Override
    public List<CostsAidWorkerTreatment> getAllCostsAidWorkerTreatments() {
        return costsAidWorkerTreatmentRepository.findAll();
    }

    @Override
    public List<CostsAidWorkerTreatment> getCostsAidWorkerTreatmentsCostsAidWorkerTreatmentPartStartsWith(String costsAidWorkerTreatmentPart) {
        return costsAidWorkerTreatmentRepository.findAllByCostsAidWorkerTreatmentPartStartsWith(costsAidWorkerTreatmentPart);
    }

    @Override
    public CostsAidWorkerTreatment getCostsAidWorkerTreatment(long id) {
        if (costsAidWorkerTreatmentRepository.existsById(id)) {
            return costsAidWorkerTreatmentRepository.findById(id).get();
        }
        else {
            throw new IdNotFoundException("No CostsAidWorkerTreatment with id " + id);
        }
    }

    @Override
    public void save(CostsAidWorkerTreatment costsAidWorkerTreatment) {
        costsAidWorkerTreatmentRepository.save(costsAidWorkerTreatment);
    }

    @Override
    public void deleteById(long id) {
        costsAidWorkerTreatmentRepository.deleteById(id);
    }
}

