package com.springexample.rentACar.entities.concretes;

public class Brand {
    private int ID;
    private String name;

    public Brand() {

    }

    public Brand(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
