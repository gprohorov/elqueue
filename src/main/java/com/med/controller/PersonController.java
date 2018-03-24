package com.med.controller;

import com.med.model.Person;
import com.med.services.person.impls.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by george on 3/9/18.
 */

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    PersonServiceImpl service;


    @RequestMapping("/persons")
   public List<Person> showPersons(){
        return service.getAll();
    }
}
