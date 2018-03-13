package com.med.controller;

import com.med.model.Patient;
import com.med.services.patient.Impls.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by george on 3/9/18.
 */
@RequestMapping("/api")
@RestController
public class PatientController {

    @Autowired
    PatientServiceImpl service;


    @RequestMapping("/patients")
   public List<Patient> showPatients(){
        return service.getAll();
    }

     @RequestMapping("/patients/today")
   public List<Patient> showPatientsToday(){
        return service.insertAppointedForToday();
    }

}
