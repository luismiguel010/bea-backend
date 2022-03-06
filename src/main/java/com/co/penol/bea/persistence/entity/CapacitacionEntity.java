package com.co.penol.bea.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "capacitaciones")
public class CapacitacionEntity {
    @Id
    @Column(name = "id_capacitacion")
    private String idCapacitacion;
    private String name;
    private String description;
    private String objetivo;
    private String dirigido;
    private String contenido;
    private String requisitos;
    private String facilitador;
    private Boolean state;
    @Column(name = "date_init")
    private LocalDateTime dateInit;
    @Column(name = "date_finish")
    private LocalDateTime dateFinish;
    private String categoria;
    private String modalidad;
    private String contactos;
    private String lugar;
    private String cupos;

    public String getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(String idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
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

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getDirigido() {
        return dirigido;
    }

    public void setDirigido(String dirigido) {
        this.dirigido = dirigido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getFacilitador() {
        return facilitador;
    }

    public void setFacilitador(String facilitador) {
        this.facilitador = facilitador;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getContactos() {
        return contactos;
    }

    public void setContactos(String contactos) {
        this.contactos = contactos;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCupos() {
        return cupos;
    }

    public void setCupos(String cupos) {
        this.cupos = cupos;
    }
}
