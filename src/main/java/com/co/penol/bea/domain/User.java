package com.co.penol.bea.domain;

public class User {

    private int idUser;
    private String names;
    private String lastnames;
    private Long phone;
    private String address;
    private String email;
    private String academicProfile;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastnames() {
        return lastnames;
    }

    public void setLastnames(String lastnames) {
        this.lastnames = lastnames;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAcademicProfile() {
        return academicProfile;
    }

    public void setAcademicProfile(String academicProfile) {
        this.academicProfile = academicProfile;
    }

}
