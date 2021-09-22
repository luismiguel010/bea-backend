package com.co.penol.bea.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "jobs_cv")
public class JobCvEntity {

    @EmbeddedId
    private JobCvPK id;

    @ManyToOne
    @JoinColumn(name = "id_job", insertable = false, updatable = false)
    private JobEntity jobEntity;

    @ManyToOne
    @MapsId("idCv")
    @JoinColumn(name = "id_cv", insertable = false, updatable = false)
    private CVEntity cvEntity;

    public JobCvPK getId() {
        return id;
    }

    public void setId(JobCvPK id) {
        this.id = id;
    }

    public JobEntity getJobEntity() {
        return jobEntity;
    }

    public void setJobEntity(JobEntity jobEntity) {
        this.jobEntity = jobEntity;
    }

    public CVEntity getCvEntity() {
        return cvEntity;
    }

    public void setCvEntity(CVEntity cvEntity) {
        this.cvEntity = cvEntity;
    }
}
