package com.med;

import com.med.model.*;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by george on 3/9/18.
 */
@Configuration
public class DataStorage {


    @PostConstruct
            void init(){
         assigned.put(massage, 5);
         assigned.put(pulling, 3);


        executed.put(massage, 0);
        executed.put(pulling, 0);

    }

    List<Person> persons = Arrays.asList(
            new Person(1,"Ivan",  "Ivanov"),
            new Person(2,"Petr",  "Petrov"),
            new Person(3,"Sidor", "Sidorov"),
            new Person(4,"Sasha", "Sashin"),
            new Person(5,"vasa",  "vasin"),
            new Person(6,"pasha", "pashin"),
            new Person(7,"ilia",  "illin")
    );

    Procedure registration =   new Procedure(0, "Registration", 0);
    Procedure diagnostics =   new Procedure(1, "Diagnostics", 1);
    Procedure heating = new Procedure(2, "Heating",2);
    Procedure pulling = new Procedure(5, "Pulling",5);
    Procedure massage = new Procedure(3, "Massage",3);

    List<Procedure> procedures = Arrays.asList(

            registration,
            diagnostics,
            heating,
            massage,
            pulling
    );

    Doctor diagnost = new Doctor(2, "Andriy",procedures.get(1),1);

    List<Doctor> doctors = new LinkedList<>(Arrays.asList(
            new Doctor(0, "AUTO", procedures.get(0),0),
            new Doctor(1, "Irina", procedures.get(0),0),
            diagnost,
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


   Map<Procedure, Integer> assigned = new HashMap<Procedure, Integer>();
   Map<Procedure, Integer> executed = new HashMap<Procedure, Integer>();

   Therapy standard = new Therapy(1, LocalDateTime.now().minusDays(2)
           , "Ушиб", 1, assigned,executed);

    private Patient vasa = new Patient(7, persons.get(4), standard
            , Collections.emptyList(), Collections.emptyList()
            , Status.SOCIAL, null, 0, false) ;
    private List<Patient> patients = Arrays.asList(
            //   new Patient( persons.get(0)),
            //   new Patient( persons.get(2))
    );


    private List<Appointment> appointments = Arrays.asList(
            new Appointment(1, new Patient(persons.get(0)), LocalDate.now().plusDays(1), false),
            new Appointment(2, new Patient(persons.get(1)), LocalDate.now(), false),
            new Appointment(3, new Patient(persons.get(2)), LocalDate.now().plusDays(1), false),
            new Appointment(4, new Patient(persons.get(3)), LocalDate.now(), false),
            new Appointment(5, vasa,                        LocalDate.now(), true)
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

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
