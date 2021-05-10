package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.IdNotFoundException;
import henkvantkruijs.LookingForHelp.exception.RecordNotFoundException;
import henkvantkruijs.LookingForHelp.model.SearchTopic;
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
}
