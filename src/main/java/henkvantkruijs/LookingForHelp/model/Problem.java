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

        @OneToMany
        List<TakeAction> takeActions;
//    Type: problemTypes;     verwijst naar enum. moet nog gemaakt worden.

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
}
