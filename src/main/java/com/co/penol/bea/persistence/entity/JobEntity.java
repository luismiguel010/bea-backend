package com.co.penol.bea.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "jobs")
public class JobEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_job")
    private Integer idJob;

    private String name;
    private String description;
    private Boolean state;

    @OneToMany(mappedBy = "cv")
    private List<JobCvEntity> cvList;

    public Integer getIdJob() {
        return idJob;
    }

    public void setIdJob(Integer idJob) {
        this.idJob = idJob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public List<JobCvEntity> getCvList() {
        return cvList;
    }

    public void setCvList(List<JobCvEntity> cvList) {
        this.cvList = cvList;
    }
}
