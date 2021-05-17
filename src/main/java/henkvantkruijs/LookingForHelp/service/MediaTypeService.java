package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.model.MediaType;
import henkvantkruijs.LookingForHelp.model.Treatment;

import java.util.List;

public interface MediaTypeService {

    List<MediaType> getAllMediaTypes();
    MediaType getMediaType(long id);
    List<MediaType> getMediaTypesMediaTypeNameStartsWith(String mediaTypeName);
    void save(MediaType mediaType);
    void deleteById(long id);
}
