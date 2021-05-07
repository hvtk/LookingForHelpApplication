package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.model.Page;

import java.util.List;

public interface PageService {

    List<Page> getAllPages();
    Page getPage(long id);
    List<Page> getPagesPageNameStartsWith(String pageName);
    void save(Page page);
    void deleteById(long id);
}

