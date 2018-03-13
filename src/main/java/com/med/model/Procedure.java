package com.med.model;

/**
 * Created by george on 3/9/18.
 */
public class Procedure {
    int id;
    String name;
    int cabinet;


    public Procedure(int id, String name, int cabinet) {
        this.id = id;
        this.name = name;
        this.cabinet = cabinet;
           }

    public Procedure() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCabinet() {
        return cabinet;
    }

    public void setCabinet(int cabinet) {
        this.cabinet = cabinet;
    }
}
