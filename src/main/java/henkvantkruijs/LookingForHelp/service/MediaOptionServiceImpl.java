package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.DatabaseErrorException;
import henkvantkruijs.LookingForHelp.exception.IdNotFoundException;
import henkvantkruijs.LookingForHelp.exception.RecordNotFoundException;
import henkvantkruijs.LookingForHelp.model.MediaOption;
import henkvantkruijs.LookingForHelp.model.User;
import henkvantkruijs.LookingForHelp.repository.MediaOptionRepository;
import henkvantkruijs.LookingForHelp.utils.RandomStringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaOptionServiceImpl implements MediaOptionService {

    @Autowired
    private MediaOptionRepository mediaOptionRepository;

   /* @Override
    public long createMediaOption(MediaOption mediaOption) {
        MediaOption newMediaOption = mediaOptionRepository.save(mediaOption);
        return newMediaOption.getId();
    } */


    @Override
    public List<MediaOption> getAllMediaOptions() {
        return mediaOptionRepository.findAll();
    }

    @Override
    public List<MediaOption> getMediaOptionsMediaOptionNameStartsWith(String mediaOptionName) {
        return mediaOptionRepository.findAllByMediaOptionNameStartsWith(mediaOptionName);
    }

    @Override
    public MediaOption getMediaOption(long id) {
        if (mediaOptionRepository.existsById(id)) {
            return mediaOptionRepository.findById(id).orElse(null);
        //    return mediaOptionRepository.findById(id).get();
        }
        else {
            throw new IdNotFoundException("No MediaOption with id " + id);
        }
    }

    @Override
    public void save(MediaOption mediaOption) {
        mediaOptionRepository.save(mediaOption);
    }

    @Override
    public void deleteById(long id) {
        mediaOptionRepository.deleteById(id);
    }

  /*  @Override
    public void updateMediaOption(long id, MediaOption mediaOption) {
        if (mediaOptionRepository.existsById(id)) {
            try {
                MediaOption existingMediaOption = mediaOptionRepository.findById(id).orElse(null);
                existingMediaOption.setMediaOptionName(mediaOption.getMediaOptionName());
                existingMediaOption.setMediaOptionAvailable(mediaOption.getMediaOptionAvailable());
                mediaOptionRepository.save(existingMediaOption);
            }
            catch (Exception ex) {
                throw new DatabaseErrorException();
            }
        }
        else {
            throw new RecordNotFoundException();
        }
    }*/

}

