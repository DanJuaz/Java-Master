package com.azurduy.app;

public class Customer {
    private String name="unknown";
    private String nif="999";
    // CONSTRUCTOR7
    public Customer(String name) {
        this.name=name;
        this.nif=nif;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

}
