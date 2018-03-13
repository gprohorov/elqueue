package com.med.model;

import java.time.LocalDateTime;

/**
 * Created by george on 3/9/18.
 */
public class Diagnosis {
    int id;
    LocalDateTime dateTime;
    String diag;

    public Diagnosis(int id, LocalDateTime dateTime, String diag) {
        this.id = id;
        this.dateTime = dateTime;
        this.diag = diag;
    }

    public Diagnosis() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDiag() {
        return diag;
    }

    public void setDiag(String diag) {
        this.diag = diag;
    }
}
