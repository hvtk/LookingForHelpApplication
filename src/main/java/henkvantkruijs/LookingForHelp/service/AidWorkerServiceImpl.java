package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.IdNotFoundException;
import henkvantkruijs.LookingForHelp.exception.RecordNotFoundException;
import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.TakeAction;
import henkvantkruijs.LookingForHelp.repository.AidWorkerRepository;
import henkvantkruijs.LookingForHelp.repository.TakeActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AidWorkerServiceImpl implements AidWorkerService {

    @Autowired
    private AidWorkerRepository aidWorkerRepository;

    // toegevoegd naar aanleiding van null in de colums na het aanmaken van een nieuwe aidworker
    @Override
    public long createAidWorker(AidWorker aidWorker) {
        AidWorker newAidWorker = AidWorkerRepository.save(aidWorker);
        return newAidWorker.getId();
    }

    @Override
    public void updateAidWorker(long id, AidWorker aidWorker) {
        if (!aidWorkerRepository.existsById(id)) throw new RecordNotFoundException();
        AidWorker existingAidWorker = aidWorkerRepository.findById(id).get();
        existingAidWorker.setAidWorkerName(aidWorker.getAidWorkerName());
        existingAidWorker.setAidWorkerWebbAddress(aidWorker.getAidWorkerWebbAddress());
        aidWorkerRepository.save(existingAidWorker);
    }

    @Override
    public List<AidWorker> getAllAidWorkers() {
        return aidWorkerRepository.findAll();
    }

    @Override
    public List<AidWorker> getAidWorkersAidWorkerNameStartsWith(String aidWorkerName) {
        return aidWorkerRepository.findAllByAidWorkerNameStartsWith(aidWorkerName);
    }

    @Override
    public AidWorker getAidWorker(long id) {
        if (aidWorkerRepository.existsById(id)) {
            return aidWorkerRepository.findById(id).get();
        }
        else {
            throw new IdNotFoundException("No AidWorker with id " + id);
        }
    }

    @Override
    public void save(AidWorker aidworker) {
        aidWorkerRepository.save(aidworker);
    }

    @Override
    public void deleteById(long id) {
        aidWorkerRepository.deleteById(id);
    }
}

