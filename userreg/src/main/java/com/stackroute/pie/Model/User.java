package com.stackroute.pie.Model;


//import org.hibernate.annotations.NaturalId;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.transaction.annotation.Transactional;

//import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.*;

@Document(collection="usersname")

public class User {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

//    @Id
    private int insuredId;

    @NotBlank
    @Size(min=3, max = 50)
    private String fullName;

    @NotBlank
    @UniqueElements
    @Size(min=3, max = 50)
    private String username;

//    @NaturalId
    @UniqueElements
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;



    //    @Transactional
    @NotBlank
    @Size(min=6, max = 100)
    private String password;


    @NotBlank
    private  String gender;


    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdDate = new Date();



    private Set<Role> roles = new HashSet<>();



    private Set<Policy> policies =new HashSet<>();

    private List<Request> requests= new ArrayList<>();


    public User(int insuredId, List<Request> requests) {
        this.insuredId = insuredId;
        this.requests = requests;
    }

    public User() {
    }

    @NotBlank
    private String securityAnswer;



    public User(String fullName, String username, String email, String password, String gender, Date createdDate, String securityAnswer) {
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.gender= gender;
        this.createdDate=createdDate;
        this.securityAnswer=securityAnswer;
    }


    public int getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(int insuredId) {
        this.insuredId = insuredId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(Set<Policy> policies) {
        this.policies = policies;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }


    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }



}






