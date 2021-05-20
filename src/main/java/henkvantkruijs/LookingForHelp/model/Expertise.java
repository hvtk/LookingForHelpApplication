package henkvantkruijs.LookingForHelp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Expertise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String expertiseName;

    @Column
    private String expertiseAvailable;

    @ManyToOne
    AidWorker aidWorker;

    @ManyToOne
    Treatment treatment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExpertiseName() {
        return expertiseName;
    }

    public void setExpertiseName(String expertiseName) {
        this.expertiseName = expertiseName;
    }

    public String getExpertiseAvailable() {
        return expertiseAvailable;
    }

    public void setExpertiseAvailable(String expertiseAvailable) {
        this.expertiseAvailable = expertiseAvailable;
    }
}
