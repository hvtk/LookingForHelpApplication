package henkvantkruijs.LookingForHelp.model;

import javax.persistence.*;


//POJO plain old java object
@Entity
public class Problem {

        //attributen

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column
        private String page;

        @Column
        private String ageGroup;

        @Column
        private String problemName;
//    Type: problemTypes;     verwijst naar enum. moet nog gemaakt worden.

        //getters en setters
        public String getPage() {
            return page;
        }

        public void setPage(String homePage) {
            this.page = page;
        }

        public String getAgeGroup() {
            return ageGroup;
        }

        public void setAgeGroup(String ageGroup) {
            this.ageGroup = ageGroup;
        }

        public String getProblemName() {
            return problemName;
        }

        public void setProblemName(String name) {
            this.problemName = problemName;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }
}
