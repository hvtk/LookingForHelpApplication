package henkvantkruijs.LookingForHelp.model;

import javax.persistence.*;

@Entity
public class MediaOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String mediaOptionName;

    @Column
    private String mediaOptionAvailable;

   // @ManyToOne
   // TakeAction takeAction;

  //  @ManyToOne
 //   AidWorker aidWorker;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMediaOptionName() {
        return mediaOptionName;
    }

    public void setMediaOptionName(String mediaOptionName) {
        this.mediaOptionName = mediaOptionName;
    }

    public String getMediaOptionAvailable() {
        return mediaOptionAvailable;
    }

    public void setMediaOptionAvailable(String mediaOptionAvailable) {
        this.mediaOptionAvailable = mediaOptionAvailable;
    }

  /*  public TakeAction getTakeAction() {
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
    }*/
}
