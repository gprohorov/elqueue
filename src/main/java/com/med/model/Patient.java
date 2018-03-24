package com.med.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by george on 3/9/18.
 */
public class Patient {
   private int id;
   private Person person;
   private LocalDate date;
   private Therapy therapy;
   private List<Procedure> assignedProcedures ; // for today
   private List<Procedure> executedProcedures ;     // for today
   private Status status;
   private LocalDateTime lastActivity;
   private int balance;
   private Activity active;

    public Patient( Person person, LocalDate date, Therapy therapy, List<Procedure> assignedProcedures, List<Procedure> executedProcedures, Status status, LocalDateTime lastActivity, int balance, Activity active) {
        this.id = person.getId();
        this.person = person;
        this.date = date;
        this.therapy = therapy;
        this.assignedProcedures = assignedProcedures;
        this.executedProcedures = executedProcedures;
        this.status = status;
        this.lastActivity = lastActivity;
        this.balance = balance;
        this.active = Activity.NON_ACTIVE;
    }

    public Patient(Person person, LocalDate date) {
        this.id = person.getId();
        this.person = person;
        this.date = date;
        this.active = Activity.NON_ACTIVE;
    }

    public Patient(Person person) {
        this.id = person.getId();
        this.person = person;
        this.active = Activity.NON_ACTIVE;
    }

    public Therapy getTherapy() {
        return therapy;
    }

    public void setTherapy(Therapy therapy) {
        this.therapy = therapy;
    }

    public LocalDateTime getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(LocalDateTime lastActivity) {
        this.lastActivity = lastActivity;
    }

    public Activity getActive() {return active;}

    public void setActive(Activity active) {this.active = active;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Therapy getDiagnosis() {
        return therapy;
    }

    public void setDiagnosis(Therapy therapy) {
        this.therapy = therapy;
    }

    public List<Procedure> getAssignedProcedures() {
        return assignedProcedures;
    }

    public void setAssignedProcedures(List<Procedure> assignedProcedures) {
        this.assignedProcedures = assignedProcedures;
    }

    public List<Procedure> getDoneProcedures() {
        return executedProcedures;
    }

    public void setDoneProcedures(List<Procedure> doneProcedures) {
        this.executedProcedures = doneProcedures;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", person=" + person +
                ", diagnosis=" + therapy +
                ", assignedProcedures=" + assignedProcedures +
                ", executed =" + executedProcedures +
                ", status=" + status +
                ", minutesInQueue=" + "" +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patient patient = (Patient) o;

        return getPerson().getId() == (patient.getPerson().getId());
    }

    @Override
    public int hashCode() {
        return getPerson().hashCode();
    }



}
