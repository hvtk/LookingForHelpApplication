package henkvantkruijs.LookingForHelp.model;

import javax.persistence.*;

@Entity
public class TakeAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String takeActionName;

    @Column
    private String takeActionWebbAddress;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTakeActionName() {
        return takeActionName;
    }

    public void setTakeActionName(String takeActionName) {
        this.takeActionName = takeActionName;
    }

    public String getTakeActionWebbAddress() {
        return takeActionWebbAddress;
    }

    public void setTakeActionWebbAddress(String takeActionWebbAddress) {
        this.takeActionWebbAddress = takeActionWebbAddress;
    }
}
