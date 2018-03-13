package com.med.dao.event.impls;

import com.med.DataStorage;
import com.med.dao.event.interfaces.IEventDAO;
import com.med.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by george on 3/9/18.
 */
@Component
public class EventDAOImpl implements IEventDAO {


    private List<Event> events= new ArrayList<>();

    @Autowired
    DataStorage dataStorage;

    @PostConstruct
    void init() {
         events = dataStorage.getEvents();
    }


    @Override
    public Event createEvent(Event event) {
        return null;
    }

    @Override
    public Event getEvent(int id) {
        return null;
    }

    @Override
    public List<Event> getAll() {
        return null;
    }

    @Override
    public List<Event> getAllEventsForPatientFromDate() {
        return null;
    }


}
