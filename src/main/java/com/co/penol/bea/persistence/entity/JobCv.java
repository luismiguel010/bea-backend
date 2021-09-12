package com.co.penol.bea.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "jobs_cv")
public class JobCv {

    @EmbeddedId
    private JobCvPK id;

    @ManyToOne
    @JoinColumn(name = "id_job", insertable = false, updatable = false)
    private Job job;

    @ManyToOne
    @JoinColumn(name = "id_cv", insertable = false, updatable = false)
    private CV cv;

    public JobCvPK getId() {
        return id;
    }

    public void setId(JobCvPK id) {
        this.id = id;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public CV getCv() {
        return cv;
    }

    public void setCv(CV cv) {
        this.cv = cv;
    }
}
