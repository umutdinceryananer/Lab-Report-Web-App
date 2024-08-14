package com.developer.LabReport.user;

import jakarta.persistence.*;

@Entity
@Table(name = "lab_user")
public class User {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue
    private Long userid;

    private String name;

    private String surname;

    private boolean isAdmin;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    // No-args constructor
    public User() {}
}