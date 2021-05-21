package henkvantkruijs.LookingForHelp.model;

import javax.persistence.*;
import java.util.List;


//POJO plain old java object
@Entity
public class Problem {

        //attributen

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column
        private String problemName;

        @Column
        @Enumerated(EnumType.STRING)
        private ProblemTypes problemTypes;

        @OneToMany
        List<TakeAction> takeAction;

        @OneToMany
        List<AidWorker> aidWorker;

        @OneToMany
        List<Treatment> treatment;

        //getters en setters

        public String getProblemName() {
            return problemName;
        }

        public void setProblemName(String problemName) {
            this.problemName = problemName;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }

        public ProblemTypes getProblemTypes() {
                return problemTypes;
        }

        public void setProblemTypes(ProblemTypes problemTypes) {
                this.problemTypes = problemTypes;
        }

        public void setId(long id) {
                this.id = id;
        }

        public List<TakeAction> getTakeAction() {
                return takeAction;
        }

        public void setTakeAction(List<TakeAction> takeAction) {
                this.takeAction = takeAction;
        }

        public List<AidWorker> getAidWorker() {
                return aidWorker;
        }

        public void setAidWorker(List<AidWorker> aidWorker) {
                this.aidWorker = aidWorker;
        }

        public List<Treatment> getTreatment() {
                return treatment;
        }

        public void setTreatment(List<Treatment> treatment) {
                this.treatment = treatment;
        }
}
