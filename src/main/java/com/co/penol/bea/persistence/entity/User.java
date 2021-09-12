package com.co.penol.bea.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer idUser;

    private String names;
    private String lastnames;
    private Long phone;
    private String address;
    private String email;

    @Column(name = "academic_profile")
    private String academicProfile;

    @OneToOne(mappedBy = "users")
    private CV cv;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
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

    public CV getCv() {
        return cv;
    }

    public void setCv(CV cv) {
        this.cv = cv;
    }
}
