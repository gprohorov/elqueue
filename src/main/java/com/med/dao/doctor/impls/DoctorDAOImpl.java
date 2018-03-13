package com.med.dao.doctor.impls;

import com.med.DataStorage;
import com.med.dao.doctor.interfaces.IDoctorDAO;
import com.med.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by george on 3/9/18.
 */
@Component
public class DoctorDAOImpl implements IDoctorDAO {


    private List<Doctor> doctors = new ArrayList<>();

    @Autowired
    DataStorage dataStorage;

    @PostConstruct
    void init(){
        doctors = dataStorage.getDoctors();
    }

    @Override
    public Doctor createDoctor(Doctor doctor) {
        return null;
    }

    @Override
    public Doctor updateDoctor(Doctor doctor) {
        return null;
    }



    @Override
    public Doctor deleteDoctor(int id) {
        return null;
    }

    @Override
    public Doctor getDoctor(int id) {
        return doctors.stream().filter(doctor -> doctor.getId() == id).findFirst().get();
    }

    @Override
    public List<Doctor> getAll() {
        return doctors;
    }
}
