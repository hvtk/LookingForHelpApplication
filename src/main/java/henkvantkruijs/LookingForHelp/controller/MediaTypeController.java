package henkvantkruijs.LookingForHelp.controller;

import henkvantkruijs.LookingForHelp.model.MediaType;
import henkvantkruijs.LookingForHelp.model.TakeAction;
import henkvantkruijs.LookingForHelp.service.MediaTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MediaTypeController {

    @Autowired
    private MediaTypeService mediaTypeService;

    @GetMapping(value = "/mediaTypes")
    public ResponseEntity<Object> getMediaTypes() {
        List<MediaType> mediaTypes = mediaTypeService.getAllMediaTypes();
        return new ResponseEntity<>(mediaTypes, HttpStatus.OK);
    }

    @GetMapping(value = "/mediaTypes/mediaTypeName/{mediaTypeName}")
    public ResponseEntity<Object> getMediaTypes(@PathVariable("mediaTypeName") String mediaTypeName) {
        List<MediaType> mediaTypes = mediaTypeService.getMediaTypesMediaTypeNameStartsWith(mediaTypeName);
        return new ResponseEntity<>(mediaTypes, HttpStatus.OK);
    }

    @GetMapping(value = "/mediaTypes/{id}")
    public ResponseEntity<Object> getMediaType(@PathVariable("id") long id) {
        return new ResponseEntity<>(mediaTypeService.getMediaType(id), HttpStatus.OK);
    }

    @PostMapping(value = "/mediaTypes")
    public ResponseEntity<Object> createMediaType(@RequestBody MediaType mediaType) {
        mediaTypeService.save(mediaType);
        return new ResponseEntity<>("MediaType created", HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/mediaType/{id}")
    public ResponseEntity<Object> deleteMediaType(@PathVariable("id") long id) {
        mediaTypeService.deleteById(id);
        return new ResponseEntity<>("MediaType deleted", HttpStatus.OK);
    }
}

