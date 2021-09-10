package com.co.penol.bea.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "jobs_cv")
public class JobCv {

    @EmbeddedId
    private JobCvPK id;

}
