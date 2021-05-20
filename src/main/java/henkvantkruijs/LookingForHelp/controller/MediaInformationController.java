package henkvantkruijs.LookingForHelp.controller;

import henkvantkruijs.LookingForHelp.model.MediaInformation;
import henkvantkruijs.LookingForHelp.service.MediaInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MediaInformationController {

    @Autowired
    private MediaInformationService mediaInformationService;

    @GetMapping(value = "/mediaInfo")
    public ResponseEntity<Object> getMediaInfo() {
        List<MediaInformation> mediaInformation = mediaInformationService.getAllMediaInfo();
        return new ResponseEntity<>(mediaInformation, HttpStatus.OK);
    }

    @GetMapping(value = "/mediaInfo/mediaInformation/{mediaInformationName}")
    public ResponseEntity<Object> getMediaInfo(@PathVariable("mediaInformationName") String mediaInformationName) {
        List<MediaInformation> mediaInformation = mediaInformationService.getMediaInfoMediaInformationNameStartsWith(mediaInformationName);
        return new ResponseEntity<>(mediaInformation, HttpStatus.OK);
    }

    @GetMapping(value = "/mediaInfo/{id}")
    public ResponseEntity<Object> getMediaInformation(@PathVariable("id") long id) {
        return new ResponseEntity<>(mediaInformationService.getMediaInformation(id), HttpStatus.OK);
    }

    @PostMapping(value = "/mediaInfo")
    public ResponseEntity<Object> createMediaInformation(@RequestBody MediaInformation mediaInformation) {
        mediaInformationService.save(mediaInformation);
        return new ResponseEntity<>("MediaInformation created", HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/mediaInformation/{id}")
    public ResponseEntity<Object> deleteMediaType(@PathVariable("id") long id) {
        mediaInformationService.deleteById(id);
        return new ResponseEntity<>("MediaInformation deleted", HttpStatus.OK);
    }
}

