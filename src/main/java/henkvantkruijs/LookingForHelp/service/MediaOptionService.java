package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.model.MediaOption;

import java.util.List;

public interface MediaOptionService {

    List<MediaOption> getAllMediaOptions();
    MediaOption getMediaOption(long id);
    List<MediaOption> getMediaOptionsMediaOptionNameStartsWith(String mediaOptionName);
    long createMediaOption(MediaOption mediaOption);
    //void save(MediaOption mediaOption);
    void deleteById(long id);
   // void updateMediaOption(long id, MediaOption mediaOption);  //toegevoegd
}
