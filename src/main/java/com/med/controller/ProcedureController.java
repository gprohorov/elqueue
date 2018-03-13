package com.med.controller;

import com.med.model.Procedure;
import com.med.services.procedure.impls.ProcedureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by george on 3/9/18.
 */

@RestController
public class ProcedureController {

    @Autowired
    ProcedureServiceImpl service;


    @RequestMapping("/procedures")
   public List<Procedure> showProcedures(){
        return service.getAll();
    }
}
