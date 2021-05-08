package henkvantkruijs.LookingForHelp.controller;


import henkvantkruijs.LookingForHelp.model.SearchTopic;
import henkvantkruijs.LookingForHelp.service.SearchTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SearchTopicController {

    @Autowired
    private SearchTopicService searchTopicService;

    @GetMapping(value = "/searchTopics")
    public ResponseEntity<Object> getSearchTopics() {
        List<SearchTopic> searchTopics = searchTopicService.getAllSearchTopics();
        return new ResponseEntity<>(searchTopics, HttpStatus.OK);
    }

    @GetMapping(value = "/searchTopics/ageGroup/{ageGroup}")
    public ResponseEntity<Object> getSearchTopics(@PathVariable("ageGroup") String ageGroup) {
        List<SearchTopic> searchTopics = searchTopicService.getSearchTopicsAgeGroupStartsWith(ageGroup);
        return new ResponseEntity<>(searchTopics, HttpStatus.OK);
    }

    @GetMapping(value = "/searchTopics/{id}")
    public ResponseEntity<Object> getSearchTopic(@PathVariable("id") long id) {
        return new ResponseEntity<>(searchTopicService.getSearchTopic(id), HttpStatus.OK);
    }

    @PostMapping(value = "/searchTopics")
    public ResponseEntity<Object> createSearchTopic(@RequestBody SearchTopic searchTopic) {
        searchTopicService.save(searchTopic);
        return new ResponseEntity<>("SearchTopic created", HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/searchTopics/{id}")
    public ResponseEntity<Object> deleteSearchTopic(@PathVariable("id") long id) {
        searchTopicService.deleteById(id);
        return new ResponseEntity<>("SearchTopic deleted", HttpStatus.OK);
    }
}
