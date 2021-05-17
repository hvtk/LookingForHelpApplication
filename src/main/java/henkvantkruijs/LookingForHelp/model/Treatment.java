package henkvantkruijs.LookingForHelp.model;

import javax.persistence.*;

@Entity
public class Treatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String treatmentName;

    @Column
    private String treatmentWebbAddress;

    @Column
    @Enumerated(EnumType.STRING)
    private TreatmentTypes treatmentTypes;

    @ManyToOne
    Problem problem;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    public String getTreatmentWebbAddress() {
        return treatmentWebbAddress;
    }

    public void setTreatmentWebbAddress(String treatmentWebbAddress) {
        this.treatmentWebbAddress = treatmentWebbAddress;
    }

    public TreatmentTypes getTreatmentTypes() {
        return treatmentTypes;
    }

    public void setTreatmentTypes(TreatmentTypes treatmentTypes) {
        this.treatmentTypes = treatmentTypes;
    }
}
