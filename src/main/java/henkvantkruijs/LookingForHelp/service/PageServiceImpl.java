package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.RecordNotFoundException;
import henkvantkruijs.LookingForHelp.model.Page;
import henkvantkruijs.LookingForHelp.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PageServiceImpl implements PageService {

    @Autowired
    private PageRepository pageRepository;

    @Override
    public List<Page> getAllPages() {
        return pageRepository.findAll();
    }

    @Override
    public List<Page> getPagesPageNameStartsWith(String pageName) {
        return pageRepository.findAllByPageNameStartsWith(pageName);
    }

    @Override
    public Page getPage(long id) {
        if (pageRepository.existsById(id)) {
            return pageRepository.findById(id).get();
        }
        else {
            throw new RecordNotFoundException("No page with id " + id);
        }
    }

    @Override
    public void save(Page page) { pageRepository.save(page); }

    @Override
    public void deleteById(long id) {
        pageRepository.deleteById(id);
    }
}
