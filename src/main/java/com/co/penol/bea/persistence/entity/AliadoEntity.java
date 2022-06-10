package com.co.penol.bea.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aliados")
public class AliadoEntity {
    @Id
    @Column(name = "id_aliado")
    private String idAliado;
    private String name;
    private String logo;

    public String getIdAliado() {
        return idAliado;
    }

    public void setIdAliado(String idAliado) {
        this.idAliado = idAliado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
