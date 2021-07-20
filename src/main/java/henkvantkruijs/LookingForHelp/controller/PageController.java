package henkvantkruijs.LookingForHelp.controller;

import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.Page;
import henkvantkruijs.LookingForHelp.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PageController {

    @Autowired
    private PageService pageService;

    @GetMapping(value = "/pages")
    public ResponseEntity<Object> getPages() {
        List<Page> pages = pageService.getAllPages();
        return new ResponseEntity<>(pages, HttpStatus.OK);
    }

    @GetMapping(value = "/pages/pageName/{pageName}")
    public ResponseEntity<Object> getPages(@PathVariable("pageName") String pageName) {
        List<Page> pages = pageService.getPagesPageNameStartsWith(pageName);
        return new ResponseEntity<>(pages, HttpStatus.OK);
    }

    @GetMapping(value = "/pages/{id}")
    public ResponseEntity<Object> getPage(@PathVariable("id") long id) {
        return new ResponseEntity<>(pageService.getPage(id), HttpStatus.OK);
    }

    @PostMapping(value = "/pages")
    public ResponseEntity<Object> createPage(@RequestBody Page page) {
        pageService.save(page);
        return new ResponseEntity<>("Page created", HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/pages/{id}")
    public ResponseEntity<Object> deletePage(@PathVariable("id") long id) {
        pageService.deleteById(id);
        return new ResponseEntity<>("Page deleted", HttpStatus.OK);
    }

    @PutMapping(value = "/pages/{id}")
    public ResponseEntity<Object> updatePage(@PathVariable("id") long id, @RequestBody Page page) {
        pageService.updatePage(id, page);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
