package com.med.model;

/**
 * Created by george on 3/9/18.
 */
public class Doctor {
    int id;
    String firstName;
    Procedure procedure;
    int cabinet;

    public Doctor(int id, String firstName, Procedure procedure, int cabinet) {
        this.id = id;
        this.firstName = firstName;
        this.procedure = procedure;
        this.cabinet = cabinet;
    }

    public Doctor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Procedure getProcedure() {
        return procedure;
    }

    public void setProcedure(Procedure procedure) {
        this.procedure = procedure;
    }

    public int getCabinet() {
        return cabinet;
    }

    public void setCabinet(int cabinet) {
        this.cabinet = cabinet;
    }
}
