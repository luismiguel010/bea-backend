package com.co.penol.bea.persistence.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @Column(name = "id_user")
    private String idUser;
    @Column(name = "identification_card")
    private String identificationCard;
    private String names;
    private String lastnames;
    private Long phone;
    private String address;
    private String email;
    private String profession;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Column(name = "academic_profile")
    private String academicProfile;

    @OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy = "userEntity")
    private CVEntity cvEntity;

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

    public CVEntity getCvEntity() {
        return cvEntity;
    }

    public void setCvEntity(CVEntity cvEntity) {
        this.cvEntity = cvEntity;
    }
}
