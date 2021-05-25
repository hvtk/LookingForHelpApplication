package henkvantkruijs.LookingForHelp.model;

import javax.persistence.*;

@Entity
public class MediaInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String mediaInformationName;

    @Column
    private String mediaInformationFoundAt;

    @Column
    @Enumerated(EnumType.STRING)
    private MediaTypes mediaTypes;

    @ManyToOne
    TakeAction takeAction;

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

    public String getMediaInformationName() {
        return mediaInformationName;
    }

    public void setMediaInformationName(String mediaInformationName) {
        this.mediaInformationName = mediaInformationName;
    }

    public String getMediaInformationFoundAt() {
        return mediaInformationFoundAt;
    }

    public void setMediaInformationFoundAt(String mediaInformationFoundAt) {
        this.mediaInformationFoundAt = mediaInformationFoundAt;
    }

    public MediaTypes getMediaTypes() {
        return mediaTypes;
    }

    public void setMediaTypes(MediaTypes mediaTypes) {
        this.mediaTypes = mediaTypes;
    }

    public TakeAction getTakeAction() {
        return takeAction;
    }

    public void setTakeAction(TakeAction takeAction) {
        this.takeAction = takeAction;
    }

    public AidWorker getAidWorker() {
        return aidWorker;
    }

    public void setAidWorker(AidWorker aidWorker) {
        this.aidWorker = aidWorker;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }
}
