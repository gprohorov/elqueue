package com.med.dao.appointment.impls;

import com.med.DataStorage;
import com.med.dao.appointment.interfaces.IAppointmentDAO;
import com.med.model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by george on 3/11/18.
 */
@Component
public class AppointmentDAOImpl implements IAppointmentDAO {


    private List<Appointment> appointments = new ArrayList<>();

    @Autowired
    DataStorage dataStorage;

    @PostConstruct
    void init(){
        appointments = dataStorage.getAppointments();
    }

    @Override
    public Appointment createAppointment(Appointment appointment) {
        return null;
    }

    @Override
    public Appointment updateAppointment(Appointment appointment) {
        return null;
    }

    @Override
    public Appointment getAppointment(int id) {
        return appointments.stream().filter(el->el.getId()==id).findFirst().orElse(null);
    }

    @Override
    public List<Appointment> getAppointmentsByDate(LocalDate date) {

        return appointments.stream().filter(el->el.getDate().equals(date))
               .collect(Collectors.toList());

    }

    @Override
    public Appointment deleteAppointment(int id) {
        return null;
    }

    @Override
    public List<Appointment> getAll() {
        return appointments;
    }
}
