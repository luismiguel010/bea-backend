package com.co.penol.bea.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "jobs")
public class JobEntity {

    @Id
    @Column(name = "id_job")
    private String idJob;
    private String name;
    private String description;
    private String requisito;
    private Boolean state;
    @Column(name = "date_init")
    private LocalDateTime dateInit;
    @Column(name = "date_finish")
    private LocalDateTime dateFinish;
    @Column(name = "salario")
    private String salary;
    private String address;
    @Column(name = "empresa")
    private String company;
    @Column(name = "categoria")
    private String category;

    public String getIdJob() {
        return idJob;
    }

    public void setIdJob(String idJob) {
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

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public LocalDateTime getDateInit() {
        return dateInit;
    }

    public void setDateInit(LocalDateTime dateInit) {
        this.dateInit = dateInit;
    }

    public LocalDateTime getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(LocalDateTime dateFinish) {
        this.dateFinish = dateFinish;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
