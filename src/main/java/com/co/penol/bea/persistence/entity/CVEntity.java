package com.co.penol.bea.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "cv")
public class CVEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cv")
    private Integer idCv;

    @Column(name = "id_user")
    private Integer idUser;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private UserEntity userEntity;

    @Column(name = "directory_file")
    private String directoryFile;

    @Column(name = "date_received")
    private LocalDateTime dateReceived;

    @OneToMany(mappedBy = "jobEntity")
    private List<JobCvEntity> jobList;

    public Integer getIdCv() {
        return idCv;
    }

    public void setIdCv(Integer idCv) {
        this.idCv = idCv;
    }

    public UserEntity getUser() {
        return userEntity;
    }

    public void setUser(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public String getDirectoryFile() {
        return directoryFile;
    }

    public void setDirectoryFile(String directoryFile) {
        this.directoryFile = directoryFile;
    }

    public LocalDateTime getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(LocalDateTime dateReceived) {
        this.dateReceived = dateReceived;
    }

    public List<JobCvEntity> getJobList() {
        return jobList;
    }

    public void setJobList(List<JobCvEntity> jobList) {
        this.jobList = jobList;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
}
