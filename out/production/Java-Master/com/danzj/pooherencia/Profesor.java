package com.danzj.pooherencia;

public class Profesor extends Persona{
    private String subject;
    public Profesor(){

    }
    public Profesor(String name, String surname) {
        super(name, surname);
    }
    public Profesor(String name, String surname, int edad) {
        super(name, surname, edad);
    }
    public Profesor(String name, String surname, int edad, String subject) {
        this(name, surname, edad);
        this.subject=subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public String detail(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.detail());
        sb.append("\n\tAsignatura: "+getSubject());
        return sb.toString();
    }
    @Override
    public String toString() {
        return this.detail();
    }
}
