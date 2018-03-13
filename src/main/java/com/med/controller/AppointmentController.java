package com.med.controller;

import com.med.model.Appointment;
import com.med.services.appointment.impls.AppointmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by george on 3/9/18.
 */
@RequestMapping("/api")
@RestController
public class AppointmentController {

    @Autowired
    AppointmentServiceImpl service;


    @RequestMapping("/appointments")
   public List<Appointment> showAllAppointments(){
        return service.getAll();
    }
}
