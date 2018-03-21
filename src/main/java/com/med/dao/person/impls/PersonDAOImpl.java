package com.med.dao.person.impls;

import com.med.DataStorage;
import com.med.dao.person.interfaces.IPersonDAO;
import com.med.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by george on 3/9/18.
 */
@Component
public class PersonDAOImpl implements IPersonDAO {


  //  private List<Person> gersons = new ArrayList<>();

    @Autowired
    DataStorage dataStorage;

    @PostConstruct
    void init(){
       // gersons = dataStorage.getPersons();
    }


    @Override
    public Person createPerson(Person person) {
        dataStorage.getPersons().add(person);
        return null;
    }

    @Override
    public Person updatePerson(Person person) {
       int index = dataStorage.getPersons().indexOf(person);
       dataStorage.getPersons().set(index,person);
        return null;
    }

    @Override
    public Person getPerson(int id) {

        return dataStorage.getPersons().stream()
                .filter(person -> person.getId()==id).findFirst().get();
    }

    @Override
    public Person deletePerson(int id) {
        Person person = this.getPerson(id);
        int index = dataStorage.getPersons().indexOf(person);
        dataStorage.getPersons().remove(index);
        return null;
    }

    @Override
    public List<Person> getAll() {
        return dataStorage.getPersons();
    }
}
