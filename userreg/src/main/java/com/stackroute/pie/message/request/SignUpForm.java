package com.stackroute.pie.message.request;

import com.stackroute.pie.Model.Policy;
import com.stackroute.pie.Model.Request;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class SignUpForm {
    @NotBlank
    @Size(min = 3, max = 50)

    private String fullName;

    @NotBlank
    @Size(min = 3, max = 50)
    private String username;

    @NotBlank
    @Size(max = 60)
    @Email
    private String email;

    private Set<String> role;



    private Set<Policy> policees;

    private List<Request> requests;


    @NotBlank
    @Size(min = 6, max = 40)
    private String password;


    @NotBlank
    private  String gender;



    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdDate = new Date();




    @NotBlank
    private String securityAnswer;


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

    public Set<String> getRole() {
        return this.role;
    }

    public void setRole(Set<String> role)
    {
        this.role = role;
    }


    public Set<Policy> getPolicees() {
        return policees;
    }

    public void setPolicees(Set<Policy> policees) {
        this.policees = policees;
    }


    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public List<Request> getRequests() {
        return requests;
    }

}

