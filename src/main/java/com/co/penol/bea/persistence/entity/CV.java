package com.co.penol.bea.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "cv")
public class CV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cv")
    private Integer idCv;

    @Column(name = "id_user")
    private Integer idUser;

    @Column(name = "directory_file")
    private String directoryFile;

    @Column(name = "date_received")
    private LocalDateTime dateReceived;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private User user;

    public Integer getIdCv() {
        return idCv;
    }

    public void setIdCv(Integer idCv) {
        this.idCv = idCv;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getDirectoryFile() {
        return directoryFile;
    }

    public void setDirectoryFile(String directoryFile) {
        this.directoryFile = directoryFile;
    }
}
