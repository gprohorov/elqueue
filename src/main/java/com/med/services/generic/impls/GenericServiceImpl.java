package com.med.services.generic.impls;

import com.med.dao.generic.interfaces.IGenericDAO;
import com.med.dao.generic.impls.GenericDAOImpl;
import com.med.model.Generic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by george on 3/9/18.
 */
@Component
public class GenericServiceImpl implements IGenericDAO {


    private List<Generic> generics = new ArrayList<>();



    @Autowired
    GenericDAOImpl genericDAO;

    @PostConstruct
    void init(){
       // generics = dataStorage.getGenerics();
    }


    @Override
    public Generic createGeneric(Generic generic) {

        return null;
    }

    @Override
    public Generic updateGeneric(Generic generic) {
        return null;
    }

    @Override
    public Generic getGeneric(int id) {
        return null;
    }

    @Override
    public Generic deleteGeneric(int id) {
        return null;
    }

    @Override
    public List<Generic> getAll() {
        return null;
    }
}
