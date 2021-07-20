package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.DatabaseErrorException;
import henkvantkruijs.LookingForHelp.exception.IdNotFoundException;
import henkvantkruijs.LookingForHelp.exception.RecordNotFoundException;
import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.SearchTopic;
import henkvantkruijs.LookingForHelp.model.TakeAction;
import henkvantkruijs.LookingForHelp.repository.SearchTopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchTopicServiceImpl implements SearchTopicService {

    @Autowired
    private SearchTopicRepository searchTopicRepository;

    @Override
    public List<SearchTopic> getAllSearchTopics() {
        return searchTopicRepository.findAll();
    }

    @Override
    public List<SearchTopic> getSearchTopicsAgeGroupStartsWith(String ageGroup) {
        return searchTopicRepository.findAllByAgeGroupStartsWith(ageGroup);
    }

    @Override
    public SearchTopic getSearchTopic(long id) {
        if (searchTopicRepository.existsById(id)) {
            return searchTopicRepository.findById(id).get();
        }
        else {
            throw new IdNotFoundException("No searchTopic with id " + id);
        }
    }

    @Override
    public void save(SearchTopic searchTopic) {
        searchTopicRepository.save(searchTopic);
    }

    @Override
    public void deleteById(long id) {
        searchTopicRepository.deleteById(id);
    }

    @Override
    public void updateSearchTopic(long id, SearchTopic searchTopic) {
        if (searchTopicRepository.existsById(id)) {
            try {
                SearchTopic existingSearchTopic = searchTopicRepository.findById(id).orElse(null);
                existingSearchTopic.setAgeGroup(searchTopic.getAgeGroup());
                searchTopicRepository.save(existingSearchTopic);
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

