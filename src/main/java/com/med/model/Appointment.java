package com.med.model;

import java.time.LocalDate;

/**
 * Created by george on 3/9/18.
 */
public class Appointment {
    private int id;
    private Patient patient;
    private LocalDate date;
    private boolean proceed;

    public Appointment(int id, Patient patient, LocalDate date, boolean proceed) {
        this.id = id;
        this.patient = patient;
        this.date = date;
        this.proceed = proceed;
    }

    public Appointment() {
    }

    public int getId() { return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isProceed() {
        return proceed;
    }

    public void setProceed(boolean proceed) {
        this.proceed = proceed;
    }
}
