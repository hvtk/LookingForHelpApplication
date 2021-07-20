package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.Page;

import java.util.List;

// hierin wordt gedefinieerd wat je met de "page" wil doen.
public interface PageService {

    List<Page> getAllPages();
    Page getPage(long id);
    List<Page> getPagesPageNameStartsWith(String pageName);
    void save(Page page);
    void deleteById(long id);
    void updatePage(long id, Page page);
}

