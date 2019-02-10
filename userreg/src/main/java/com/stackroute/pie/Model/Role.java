package com.stackroute.pie.Model;

//import org.hibernate.annotations.NaturalId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.*;



    public class Role {
        @Id

//        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

//        @Enumerated(EnumType.STRING)
//        @NaturalId



        private RoleName name;

        public Role() {}

        public Role(RoleName name) {
            this.name = name;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public RoleName getName() {
            return name;
        }

        public void setName(RoleName name) {
            this.name = name;
        }
    }
