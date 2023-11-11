package com.dazn.interfaces.impress.model;

public class Person {
    private String name;
    private String surname;

    public Person() {
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name+" "+surname;
    }
}
