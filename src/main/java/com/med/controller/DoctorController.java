package com.med.controller;

import com.med.model.Doctor;
import com.med.services.doctor.impls.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by george on 3/9/18.
 */

@RestController
@RequestMapping("/api")
public class DoctorController {

    @Autowired
    DoctorServiceImpl service;


    @RequestMapping("/doctors")
   public List<Doctor> showDoctors(){
        return service.getAll();
    }
}
