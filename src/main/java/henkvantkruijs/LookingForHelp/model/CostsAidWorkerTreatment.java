package henkvantkruijs.LookingForHelp.model;

import javax.persistence.*;

@Entity
public class CostsAidWorkerTreatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String costsAidWorkerTreatmentPart;

    @Column
    private Boolean answerYesOrNo;

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

    public String getCostsAidWorkerTreatmentPart() {
        return costsAidWorkerTreatmentPart;
    }

    public void setCostsAidWorkerTreatmentPart(String costsAidWorkerTreatmentPart) {
        this.costsAidWorkerTreatmentPart = costsAidWorkerTreatmentPart;
    }

    public Boolean getAnswerYesOrNo() {
        return answerYesOrNo;
    }

    public void setAnswerYesOrNo(Boolean answerYesOrNo) {
        this.answerYesOrNo = answerYesOrNo;
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
