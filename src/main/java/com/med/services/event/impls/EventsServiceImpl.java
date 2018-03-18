package com.med.services.event.impls;

import com.med.DataStorage;
import com.med.model.Event;
import com.med.services.event.interfaces.IEventsService;
import com.med.services.patient.Impls.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by george on 3/9/18.
 */
@Service
public class EventsServiceImpl implements IEventsService {

private List<Event> events = new ArrayList<>();
private int id=0;

    @Autowired
    DataStorage dataStorage;
    @Autowired
    PatientServiceImpl patientsService;

    @Override
    public Event addEvent(Event event) {
        this.events.add(event);
        return event;
    }

    @Override
    public List<Event> getAll() {

        return events;
    }


}
