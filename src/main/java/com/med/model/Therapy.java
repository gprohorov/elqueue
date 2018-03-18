package com.med.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by george on 3/9/18.
 */
public class Therapy {
    int id;
    LocalDateTime dateTime;
    String diag;
    int codeDiag;
    Map<Procedure, Integer> assignments = new HashMap<>();

    public Therapy(int id, LocalDateTime dateTime, String diag, int codeDiag, Map<Procedure, Integer> assignments) {
        this.id = id;
        this.dateTime = dateTime;
        this.diag = diag;
        this.codeDiag = codeDiag;
        this.assignments = assignments;
    }

    public Therapy() {
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

    public int getCodeDiag() {
        return codeDiag;
    }

    public void setCodeDiag(int codeDiag) {
        this.codeDiag = codeDiag;
    }

    public Map<Procedure, Integer> getAssignments() {
        return assignments;
    }

    public void setAssignments(Map<Procedure, Integer> assignments) {
        this.assignments = assignments;
    }
}
