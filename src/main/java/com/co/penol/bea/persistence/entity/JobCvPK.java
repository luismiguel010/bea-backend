package com.co.penol.bea.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class JobCvPK implements Serializable {

    @Column(name = "id_job")
    private Integer idJob;

    @Column(name = "id_cv")
    private Integer idCv;

    public Integer getIdJob() {
        return idJob;
    }

    public void setIdJob(Integer idJob) {
        this.idJob = idJob;
    }

    public Integer getIdCv() {
        return idCv;
    }

    public void setIdCv(Integer idCv) {
        this.idCv = idCv;
    }
}
