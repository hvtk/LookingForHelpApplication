package henkvantkruijs.LookingForHelp.model;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany
    List<Expertise> expertise;

    @OneToMany
    List<CostsAidWorkerTreatment> costsAidWorkerTreatment;

    @OneToMany
    List<MediaOption> mediaOption;

    @OneToMany
    List<MediaInformation> mediaInformation;

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

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    public List<Expertise> getExpertise() {
        return expertise;
    }

    public void setExpertise(List<Expertise> expertise) {
        this.expertise = expertise;
    }

    public List<CostsAidWorkerTreatment> getCostsAidWorkerTreatment() {
        return costsAidWorkerTreatment;
    }

    public void setCostsAidWorkerTreatment(List<CostsAidWorkerTreatment> costsAidWorkerTreatment) {
        this.costsAidWorkerTreatment = costsAidWorkerTreatment;
    }

    public List<MediaOption> getMediaOption() {
        return mediaOption;
    }

    public void setMediaOption(List<MediaOption> mediaOption) {
        this.mediaOption = mediaOption;
    }

    public List<MediaInformation> getMediaInformation() {
        return mediaInformation;
    }

    public void setMediaInformation(List<MediaInformation> mediaInformation) {
        this.mediaInformation = mediaInformation;
    }
}
