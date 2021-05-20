package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.model.MediaInformation;

import java.util.List;

public interface MediaInformationService {

    List<MediaInformation> getAllMediaInfo();
    MediaInformation getMediaInformation(long id);
    List<MediaInformation> getMediaInfoMediaInformationNameStartsWith(String mediaInformationName);
    void save(MediaInformation mediaInformation);
    void deleteById(long id);
}
