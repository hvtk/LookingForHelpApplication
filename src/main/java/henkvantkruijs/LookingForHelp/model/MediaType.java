package henkvantkruijs.LookingForHelp.model;

import javax.persistence.*;

@Entity
public class MediaType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String mediaTypeName;

    @Column
    private String mediaTypeFoundAt;

    @ManyToOne
    TakeAction takeAction;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMediaTypeName() {
        return mediaTypeName;
    }

    public void setMediaTypeName(String mediaTypeName) {
        this.mediaTypeName = mediaTypeName;
    }

    public String getMediaTypeFoundAt() {
        return mediaTypeFoundAt;
    }

    public void setMediaTypeFoundAt(String mediaTypeFoundAt) {
        this.mediaTypeFoundAt = mediaTypeFoundAt;
    }
}
