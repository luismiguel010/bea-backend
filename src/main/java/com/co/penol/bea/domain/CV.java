package com.co.penol.bea.domain;

import java.time.LocalDateTime;
import java.util.List;

public class CV {

    private int idCv;
    private int idUser;
    private String directoryFile;
    private LocalDateTime dateReceived;
    private List<JobCv> jobCvList;

    public int getIdCv() {
        return idCv;
    }

    public void setIdCv(int idCv) {
        this.idCv = idCv;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getDirectoryFile() {
        return directoryFile;
    }

    public void setDirectoryFile(String directoryFile) {
        this.directoryFile = directoryFile;
    }

    public LocalDateTime getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(LocalDateTime dateReceived) {
        this.dateReceived = dateReceived;
    }

    public List<JobCv> getJobCvList() {
        return jobCvList;
    }

    public void setJobCvList(List<JobCv> jobCvList) {
        this.jobCvList = jobCvList;
    }
}
