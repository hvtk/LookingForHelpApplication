package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.IdNotFoundException;
import henkvantkruijs.LookingForHelp.model.MediaType;
import henkvantkruijs.LookingForHelp.model.TakeAction;
import henkvantkruijs.LookingForHelp.repository.MediaTypeRepository;
import henkvantkruijs.LookingForHelp.repository.TakeActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaTypeServiceImpl implements MediaTypeService {

    @Autowired
    private MediaTypeRepository mediaTypeRepository;

    @Override
    public List<MediaType> getAllMediaTypes() {
        return mediaTypeRepository.findAll();
    }

    @Override
    public List<MediaType> getMediaTypesMediaTypeNameStartsWith(String mediaTypeName) {
        return mediaTypeRepository.findAllByMediaTypeNameStartsWith(mediaTypeName);
    }

    @Override
    public MediaType getMediaType(long id) {
        if (mediaTypeRepository.existsById(id)) {
            return mediaTypeRepository.findById(id).get();
        }
        else {
            throw new IdNotFoundException("No MediaType with id " + id);
        }
    }

    @Override
    public void save(MediaType mediaType) {
        mediaTypeRepository.save(mediaType);
    }

    @Override
    public void deleteById(long id) {
        mediaTypeRepository.deleteById(id);
    }
}

