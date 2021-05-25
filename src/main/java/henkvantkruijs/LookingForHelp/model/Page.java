package henkvantkruijs.LookingForHelp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Page {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String pageName;

    @OneToOne
    SearchTopic searchTopic;

    //getters en setters

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SearchTopic getSearchTopic() {
        return searchTopic;
    }

    public void setSearchTopic(SearchTopic searchTopic) {
        this.searchTopic = searchTopic;
    }
}

