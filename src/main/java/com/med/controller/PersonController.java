package com.med.controller;

import com.med.model.Person;
import com.med.services.person.impls.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by george on 3/9/18.
 */

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    PersonServiceImpl service;

    // get all persons
    @RequestMapping("/persons")
   public List<Person> showPersons(){

        return service.getAll();
    }

    // create a new Person
    @PostMapping("/persons")
    public Person createPerson(@Valid @RequestBody Person person) {

       return service.createPerson(person);
    }

    // get the Person by id
    @GetMapping("/person/{id}")
   public Person showOnePerson(@PathVariable(value = "id")  int personId) {

        return service.getPerson(personId);
    }

    // get a Person list by lastName
    @GetMapping("/persons/{name}")
   public List<Person> getPersonsByLastName(@PathVariable(value = "name")  String lastName) {
        return service.getPersonListByName(lastName);

    }


    // delete the person by id
    @DeleteMapping("/person/{id}")
    public Person delPerson(@PathVariable(value = "id")  int personId)  {

        return service.deletePerson(personId);

   }

    // delete the person by id
    @PutMapping("/person/{id}")
    public Person updatePerson(@PathVariable(value = "id")  int personId,
                               @Valid @RequestBody Person updates)  {
        updates.setId(personId);

        return service.updatePerson(updates);

   }


}
