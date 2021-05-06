package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.model.SearchTopic;

import java.util.List;

public interface SearchTopicService {

    List<SearchTopic> getAllSearchTopics();
    SearchTopic getSearchTopic(long id);
    List<SearchTopic> getSearchTopicsAgeGroupStartsWith(String ageGroup);
    void save(SearchTopic searchTopic);
    void deleteById(long id);
}

