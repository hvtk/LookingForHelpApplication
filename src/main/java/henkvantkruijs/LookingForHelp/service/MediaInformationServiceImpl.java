package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.DatabaseErrorException;
import henkvantkruijs.LookingForHelp.exception.IdNotFoundException;
import henkvantkruijs.LookingForHelp.exception.RecordNotFoundException;
import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.MediaInformation;
import henkvantkruijs.LookingForHelp.repository.MediaInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaInformationServiceImpl implements MediaInformationService {

    @Autowired
    private MediaInformationRepository mediaInformationRepository;

    @Override
    public List<MediaInformation> getAllMediaInfo() {
        return mediaInformationRepository.findAll();
    }

    @Override
    public List<MediaInformation> getMediaInfoMediaInformationNameStartsWith(String mediaInformationName) {
        return mediaInformationRepository.findAllByMediaInformationNameStartsWith(mediaInformationName);
    }

    @Override
    public MediaInformation getMediaInformation(long id) {
        if (mediaInformationRepository.existsById(id)) {
            return mediaInformationRepository.findById(id).get();
        }
        else {
            throw new IdNotFoundException("No MediaInformation with id " + id);
        }
    }

    @Override
    public void save(MediaInformation mediaInformation) {
        mediaInformationRepository.save(mediaInformation);
    }

    @Override
    public void deleteById(long id) {
        mediaInformationRepository.deleteById(id);
    }

    @Override
    public void updateMediaInformation(long id, MediaInformation mediaInformation) {
        if (mediaInformationRepository.existsById(id)) {
            try {
                MediaInformation existingMediaInformation = mediaInformationRepository.findById(id).orElse(null);
                existingMediaInformation.setMediaInformationName(mediaInformation.getMediaInformationName());
                existingMediaInformation.setMediaInformationFoundAt(mediaInformation.getMediaInformationFoundAt());
                mediaInformationRepository.save(existingMediaInformation);
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

