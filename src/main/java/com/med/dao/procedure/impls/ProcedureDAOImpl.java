package com.med.dao.procedure.impls;

import com.med.DataStorage;
import com.med.dao.procedure.interfaces.IProcedureDAO;
import com.med.model.Procedure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by george on 3/9/18.
 */
@Component
public class ProcedureDAOImpl implements IProcedureDAO {


    private List<Procedure> procedures = new ArrayList<>();

    @Autowired
    DataStorage dataStorage;

    @PostConstruct
    void init(){
        procedures = dataStorage.getProcedures();
    }

    @Override
    public Procedure createProcedure(Procedure procedure) {
        return null;
    }

    @Override
    public Procedure updateProcedure(Procedure procedure) {
        return null;
    }



    @Override
    public Procedure deleteProcedure(int id) {
        return null;
    }

    @Override
    public Procedure getProcedure(int id) {
        return procedures.stream().filter(procedure -> procedure.getId() == id).findFirst().get();
    }

    @Override
    public List<Procedure> getAll() {
        return procedures;
    }
}
