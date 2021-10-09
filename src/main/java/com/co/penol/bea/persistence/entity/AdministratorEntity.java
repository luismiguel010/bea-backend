package com.co.penol.bea.persistence.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "administrators")
public class AdministratorEntity {

    @Id
    @Column(name = "id_admin")
    private String idAdmin;
    private String names;
    private String lastnames;
    private String email;
    private String password;

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
