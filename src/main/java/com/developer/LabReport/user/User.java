package com.developer.LabReport.user;

public class User {

    private String name;

    private String surname;

    private int userid;

    private boolean isAdmin;

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

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public User() {}

    public User(String name,
                String surname,
                int userid,
                boolean isAdmin) {

        this.name = name;
        this.surname = surname;
        this.userid = userid;
        this.isAdmin = isAdmin;
    }
}
