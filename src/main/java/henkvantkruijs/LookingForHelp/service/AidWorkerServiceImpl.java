package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.IdNotFoundException;
import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.repository.AidWorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AidWorkerServiceImpl implements AidWorkerService {

    @Autowired
    private AidWorkerRepository aidWorkerRepository;

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

