package com.danzj.pooherencia;

import java.util.Arrays;

public class Alumno extends Persona{
    private String schoolname;
    private  int marks[];

    public Alumno() {
        //System.out.println("Iniciando Alumno");
    }

    public Alumno(String name, String apellido) {
        super(name, apellido);
    }
    public Alumno(String name, String apellido, int edad) {
        super(name, apellido, edad);
    }
    public Alumno(String name, String apellido, int edad, String schoolname) {
        this(name, apellido, edad);
        this.schoolname=schoolname;
    }

    public Alumno(String name, String surname, int edad, String schoolname, int[] marks) {
        this(name, surname, edad, schoolname);
        this.marks = marks;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double notaMedia(){
        double result = 0;
        for (int i = 0; i < marks.length; i++) {
            result += marks[i];
        }
        result=result/marks.length;
        return result;
    }
    @Override
    public String detail(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.detail());
        sb.append("\n\tColegio: "+getSchoolname());
        sb.append("\n\tNotas: "+ Arrays.toString(getMarks()));
        sb.append("\n\tNota media: "+notaMedia());

        return sb.toString();
    }
    @Override
    public String toString() {
        return this.detail();
    }
}
