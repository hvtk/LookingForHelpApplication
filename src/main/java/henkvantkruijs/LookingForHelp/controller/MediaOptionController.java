package henkvantkruijs.LookingForHelp.controller;

import henkvantkruijs.LookingForHelp.model.MediaOption;
import henkvantkruijs.LookingForHelp.service.MediaOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class MediaOptionController {

    @Autowired
    private MediaOptionService mediaOptionService;

    @GetMapping(value = "/mediaOptions")
    public ResponseEntity<Object> getMediaOptions() {
        List<MediaOption> mediaOption = mediaOptionService.getAllMediaOptions();
        return new ResponseEntity<>(mediaOption, HttpStatus.OK);
    }

    @GetMapping(value = "/mediaOptions/mediaOption/{mediaOptionName}")
    public ResponseEntity<Object> getMediaOptions(@PathVariable("mediaOptionName") String mediaOptionName) {
        List<MediaOption> mediaOption = mediaOptionService.getMediaOptionsMediaOptionNameStartsWith(mediaOptionName);
        return new ResponseEntity<>(mediaOption, HttpStatus.OK);
    }

    @GetMapping(value = "/mediaOptions/{id}")
    public ResponseEntity<Object> getMediaOption(@PathVariable("id") long id) {
        return new ResponseEntity<>(mediaOptionService.getMediaOption(id), HttpStatus.OK);
    }

    @PostMapping(value = "/mediaOptions")
    public ResponseEntity<Object> createMediaOption(@RequestBody MediaOption mediaOption) {
        mediaOptionService.save(mediaOption);
        return new ResponseEntity<>("MediaOption created", HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/mediaOption/{id}")
    public ResponseEntity<Object> deleteMediaOption(@PathVariable("id") long id) {
        mediaOptionService.deleteById(id);
        return new ResponseEntity<>("MediaOption deleted", HttpStatus.OK);
    }
}

