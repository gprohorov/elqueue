package com.med.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by george on 3/9/18.
 */
public class Patient {
   private int id;
   private Person person;
   private Therapy diagnosis;
   private LocalDateTime diagnostics;
   private List<Procedure> assignedProcedures;
   private List<Procedure> doneProcedures;
   private Status status;
   private LocalDateTime minutesInQueue;
   private int balance;
   private boolean active;


    public Patient(int id, Person person, Therapy diagnosis, LocalDateTime diagnostics
            , List<Procedure> assignedProcedures, List<Procedure> doneProcedures
            , Status status, LocalDateTime minutesInQueue, int balance, boolean active) {
        this.id = id;
        this.person = person;
        this.diagnosis = diagnosis;
        this.diagnostics = diagnostics;
        this.assignedProcedures = assignedProcedures;
        this.doneProcedures = doneProcedures;
        this.status = status;
        this.minutesInQueue = minutesInQueue;
        this.balance = balance;
        this.active = active;
    }

    public Patient(Person person) {
        this.person = person;
        this.diagnosis = null;
        this.diagnostics = null;
        this.status = null;
        this.assignedProcedures = new ArrayList<>();
        this.doneProcedures = new ArrayList<>();
        this.balance = 0;
        this.active =false;

    }

    public Patient(int id,
                   Person person,
                   Therapy diagnosis,
                   List<Procedure> assigned,
                   List<Procedure> done,
                   Status status) {
        this.id = id;
        this.person = person;
        this.diagnosis = diagnosis;
        this.assignedProcedures = assigned;
        this.doneProcedures = done;
        this.status = Status.SOCIAL;
        this.balance = 0;
        this.active =false;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

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
        return diagnosis;
    }

    public void setDiagnosis(Therapy diagnosis) {
        this.diagnosis = diagnosis;
    }

    public List<Procedure> getAssignedProcedures() {
        return assignedProcedures;
    }

    public void setAssignedProcedures(List<Procedure> assignedProcedures) {
        this.assignedProcedures = assignedProcedures;
    }

    public List<Procedure> getDoneProcedures() {
        return doneProcedures;
    }

    public void setDoneProcedures(List<Procedure> doneProcedures) {
        this.doneProcedures = doneProcedures;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getMinutesInQueue() {
        return minutesInQueue;
    }

    public void setMinutesInQueue(LocalDateTime minutesInQueue) {
        this.minutesInQueue = minutesInQueue;
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
                ", diagnosis=" + diagnosis +
                ", assignedProcedures=" + assignedProcedures +
                ", doneProcedures=" + doneProcedures +
                ", status=" + status +
                ", minutesInQueue=" + minutesInQueue +
                ", balance=" + balance +
                '}';
    }
}
