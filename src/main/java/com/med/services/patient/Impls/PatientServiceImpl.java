package com.med.services.patient.Impls;

import com.med.dao.patient.impls.PatientDAOImpl;
import com.med.model.Patient;
import com.med.model.Person;
import com.med.services.patient.interfaces.IPatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by george on 3/9/18.
 */

@Service
public class PatientServiceImpl implements IPatientsService {

    private List<Patient> patients = new ArrayList<>();

    @Autowired
    PatientDAOImpl patientDAO;

    @Override
    public Patient createPatient(Person person) {
        return patientDAO.createPatient(person);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientDAO.updatePatient(patient);
    }

    @Override
    public Patient getPatient(int id) {
        return patientDAO.getPatient(id);
    }

    @Override
    public Patient deletePatient(int id) {
        return patientDAO.deletePatient(id);
    }

    @Override
    public List<Patient> getAll() {
        return   patientDAO.getAll();

    }

    @Override
    public List<Patient> insertAppointedForToday() {
        return patientDAO.insertAppointedForToday();
    }



}
