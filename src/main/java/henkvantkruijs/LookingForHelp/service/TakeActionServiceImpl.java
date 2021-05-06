package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.RecordNotFoundException;
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
        return TakeActionRepository.findAll();
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
            throw new RecordNotFoundException("No problem with id " + id);
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
}

