package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.model.MediaOption;
import henkvantkruijs.LookingForHelp.model.Page;

import java.util.List;

public interface MediaOptionService {

    List<MediaOption> getAllMediaOptions();
    MediaOption getMediaOption(long id);
    List<MediaOption> getMediaOptionsMediaOptionNameStartsWith(String mediaOptionName);
    void save(MediaOption mediaOption);
    void deleteById(long id);
}

