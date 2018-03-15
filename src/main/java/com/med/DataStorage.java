package com.med;

import com.med.model.*;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

/**
 * Created by george on 3/9/18.
 */
@Configuration
public class DataStorage {
    List<Person> persons = Arrays.asList(
            new Person(1,"Ivan",  "Ivanov"),
            new Person(2,"Petr",  "Petrov"),
            new Person(3,"Sidor", "Sidorov"),
            new Person(4,"Sasha", "Sashin"),
            new Person(5,"vasa",  "vasin"),
            new Person(6,"pasha", "pashin"),
            new Person(7,"ilia",  "illin")
    );

    List<Procedure> procedures = Arrays.asList(

            new Procedure(0, "Registration",0),
            new Procedure(1, "Diagnostics", 1),
            new Procedure(2, "Heating",     2),
            new Procedure(3, "Massage",     3)
    );

    List<Doctor> doctors = new LinkedList<>(Arrays.asList(
            new Doctor(0, "AUTO", procedures.get(0),0),
            new Doctor(1, "Irina", procedures.get(0),0),
            new Doctor(2, "Andriy",procedures.get(1),1),
            new Doctor(3, "Igor",  procedures.get(2),2),
            new Doctor(4, "Vasil",  procedures.get(2),3)
    ));



   private List<Event> logs = Arrays.asList(
          //  new Event(null, LocalDateTime.now(), null, doctors.get(0),procedures.get(0), Action.PRESENT),
         //   new Event(null, LocalDateTime.now(), patient.get(0), doctors.get(0),procedures.get(0), Action.REGISTRATED),
          //  new Event(null, LocalDateTime.now(), patient.get(0), doctors.get(0),procedures.get(0), Action.PUT_IN_QUEUE)

    );


   private List<Event> events = Arrays.asList(
          //  new Event(null, LocalDateTime.now(), null, doctors.get(0),procedures.get(0), Action.PRESENT),
         //   new Event(null, LocalDateTime.now(), patient.get(0), doctors.get(0),procedures.get(0), Action.REGISTRATED),
          //  new Event(null, LocalDateTime.now(), patient.get(0), doctors.get(0),procedures.get(0), Action.PUT_IN_QUEUE)
    );


   private List<Patient> patients = Arrays.asList(
        //   new Patient( persons.get(0)),
        //   new Patient( persons.get(2))
   );

    private List<Appointment> appointments = Arrays.asList(
            new Appointment(1, new Patient(persons.get(0)), LocalDate.now().plusDays(1), false),
            new Appointment(2, new Patient(persons.get(1)), LocalDate.now(), false),
            new Appointment(3, new Patient(persons.get(2)), LocalDate.now().plusDays(1), false),
            new Appointment(4, new Patient(persons.get(3)), LocalDate.now(), false)
    );

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Person> patients) {
        this.persons = patients;
    }

    public List<Procedure> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<Procedure> procedures) {
        this.procedures = procedures;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Event> getLogs() {
        return logs;
    }

    public List<Event> getEvents() { return events; }

    public void setLogs(List<Event> logs) {
        this.logs = logs;
    }


}
