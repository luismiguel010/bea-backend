package com.co.penol.bea.domain;

public class UserWithJobs {
    private String idUser;
    private String identificationCard;
    private String names;
    private String lastnames;
    private Long phone;
    private String address;
    private String email;
    private String academicProfile;
    private String jobName;
    private String profession;

    public UserWithJobs(String idUser, String identificationCard, String names, String lastnames, Long phone, String address, String email, String academicProfile, String jobName, String profession) {
        this.idUser = idUser;
        this.identificationCard = identificationCard;
        this.names = names;
        this.lastnames = lastnames;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.academicProfile = academicProfile;
        this.jobName = jobName;
        this.profession = profession;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
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

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}