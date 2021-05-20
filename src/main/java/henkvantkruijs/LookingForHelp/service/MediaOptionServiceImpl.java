package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.IdNotFoundException;
import henkvantkruijs.LookingForHelp.model.MediaOption;
import henkvantkruijs.LookingForHelp.repository.MediaOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaOptionServiceImpl implements MediaOptionService {

    @Autowired
    private MediaOptionRepository mediaOptionRepository;

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
            return mediaOptionRepository.findById(id).get();
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
}

