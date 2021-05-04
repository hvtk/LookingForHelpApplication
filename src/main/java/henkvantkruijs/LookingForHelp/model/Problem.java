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
        private String homePage;

        @Column
        private String ageGroup;

        @Column
        private String name;
//    Type: problemTypes;     verwijst naar enum. moet nog gemaakt worden.

        //getters en setters
        public String getHomePage() {
            return homePage;
        }

        public void setHomePage(String homePage) {
            this.homePage = homePage;
        }

        public String getAgeGroup() {
            return ageGroup;
        }

        public void setAgeGroup(String ageGroup) {
            this.ageGroup = ageGroup;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }
}
