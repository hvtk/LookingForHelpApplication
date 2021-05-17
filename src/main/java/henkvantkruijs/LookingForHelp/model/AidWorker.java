package henkvantkruijs.LookingForHelp.model;

import javax.persistence.*;

@Entity
public class AidWorker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String aidWorkerName;

    @Column
    private String aidWorkerWebbAddress;

    @Column
    @Enumerated(EnumType.STRING)
    private AidWorkerTypes aidWorkerTypes;

    @ManyToOne
    Problem problem;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAidWorkerName() {
        return aidWorkerName;
    }

    public void setAidWorkerName(String aidWorkerName) {
        this.aidWorkerName = aidWorkerName;
    }

    public String getAidWorkerWebbAddress() {
        return aidWorkerWebbAddress;
    }

    public void setAidWorkerWebbAddress(String aidWorkerWebbAddress) {
        this.aidWorkerWebbAddress = aidWorkerWebbAddress;
    }

    public AidWorkerTypes getAidWorkerTypes() {
        return aidWorkerTypes;
    }

    public void setAidWorkerTypes(AidWorkerTypes aidWorkerTypes) {
        this.aidWorkerTypes = aidWorkerTypes;
    }
}
