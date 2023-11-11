package com.danzj.pooherencia;

public class Persona {
    private String name;
    private String surname;
    private int edad;
    private String email="guadalupe@lksnext.com";

    public Persona() {
        //System.out.println("Iniciar Persona");
    }

    public Persona(String name) {
        this();
        this.name = name;
    }

    public Persona(String name, String surname) {
        this(name);
        this.surname = surname;
    }

    public Persona(String name, String surname, int edad) {
       this(name, surname);
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String detail(){
        StringBuilder sb = new StringBuilder(this.getClass().getTypeName()+": ");
        sb.append("\n\tNombre: "+getName());
        sb.append("\n\tApellido: "+getSurname());
        sb.append("\n\tEdad: "+getEdad());
        sb.append("\n\tEmail: "+getEmail());
        return sb.toString();
    }

    @Override
    public String toString() {
        return this.detail();
    }
}
