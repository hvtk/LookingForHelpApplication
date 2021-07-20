package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.DatabaseErrorException;
import henkvantkruijs.LookingForHelp.exception.IdNotFoundException;
import henkvantkruijs.LookingForHelp.exception.RecordNotFoundException;
import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.TakeAction;
import henkvantkruijs.LookingForHelp.repository.TakeActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TakeActionServiceImpl implements TakeActionService {

    @Autowired
    private TakeActionRepository takeActionRepository;

    @Override
    public List<TakeAction> getAllTakeActions() {
        return takeActionRepository.findAll();
    }

    @Override
    public List<TakeAction> getTakeActionsTakeActionNameStartsWith(String takeActionName) {
        return takeActionRepository.findAllByTakeActionNameStartsWith(takeActionName);
    }

    @Override
    public TakeAction getTakeAction(long id) {
        if (takeActionRepository.existsById(id)) {
            return takeActionRepository.findById(id).get();
        }
        else {
            throw new IdNotFoundException("No TakeAction with id " + id);
        }
    }

    @Override
    public void save(TakeAction takeAction) {
        takeActionRepository.save(takeAction);
    }

    @Override
    public void deleteById(long id) {
        takeActionRepository.deleteById(id);
    }

    @Override
    public void updateTakeAction(long id, TakeAction takeAction) {
        if (takeActionRepository.existsById(id)) {
            try {
                TakeAction existingTakeAction = takeActionRepository.findById(id).orElse(null);
                existingTakeAction.setTakeActionName(takeAction.getTakeActionName());
                existingTakeAction.setTakeActionWebbAddress(takeAction.getTakeActionWebbAddress());
                takeActionRepository.save(existingTakeAction);
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

