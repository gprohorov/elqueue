package com.med.dao.patient.impls;

import com.med.dao.patient.interfaces.IPatientDAO;
import com.med.model.*;
import com.med.services.appointment.impls.AppointmentServiceImpl;
import com.med.services.doctor.impls.DoctorServiceImpl;
import com.med.services.events.impls.EventsServiceImpl;
import com.med.services.procedure.impls.ProcedureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by george on 3/9/18.
 */
@Component
public class PatientDAOImpl implements IPatientDAO {


    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Procedure> procedures = new ArrayList<>();


    @Autowired
    AppointmentServiceImpl appointmentService;

    @Autowired
    DoctorServiceImpl doctorService;

    @Autowired
    ProcedureServiceImpl procedureService;

    @Autowired
    EventsServiceImpl eventsService;


    @PostConstruct
    void init(){

        doctors = doctorService.getAll();
        procedures = procedureService.getAll();

    }


    @Override
    public Patient createPatient(Person person) {
        Patient patient = new Patient(person);
        patients.add(patient);
        return patient;
    }

    @Override
    public Patient addPatient(Patient patient) {
        this.patients.add(patient);
        return patient;
    }

    @Override
    public Patient updatePatient(Patient patient) {
        int index = patients.indexOf(patient);
        patients.set(index, patient);
        return patient;
    }

    @Override
    public Patient getPatient(int id) {
        return patients.stream().filter(patient -> patient.getPerson().getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Patient deletePatient(int id) {
     Patient patient = patients.stream().filter(pat -> pat.getPerson().getId()==id)
             .findFirst().orElse(null);
     int index = patients.indexOf(patient);
     patients.remove(index);
        return null;
    }

    @Override
    public List<Patient> getAll() {
        return patients;
    }


    @Override
    public List<Patient> insertAppointedForToday() {

        for(Appointment appointment: appointmentService.getAppointmentsByDate(LocalDate.now())){

            Patient patient = appointment.getPatient();
            patients.add(patient);
        }

        return patients;
    }
}
