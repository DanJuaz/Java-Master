package com.danzj.pooherencia;

import java.util.Arrays;

public class AlumnoInternacional extends Alumno{
    private String pais;
    private double []notasIdiomas;

    public AlumnoInternacional() {
    }

    public AlumnoInternacional(String name, String apellido) {
        super(name, apellido);
    }
    public AlumnoInternacional(String name, String apellido, int edad) {
        super(name, apellido, edad);
    }

    public AlumnoInternacional(String name, String surname, int edad, String schoolname, int[] marks) {
        super(name, surname, edad, schoolname, marks);
    }
    public AlumnoInternacional(String name, String surname, int edad, String schoolname, int[] marks, String pais) {
        this(name, surname, edad, schoolname, marks);
        this.pais=pais;
    }
    public AlumnoInternacional(String name, String surname, int edad, String schoolname, int[] marks, String pais, double[] notasIdiomas) {
        this(name, surname, edad, schoolname, marks, pais);
        this.notasIdiomas=notasIdiomas;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double[] getNotasIdiomas() {
        return notasIdiomas;
    }

    public void setNotasIdiomas(double[] notasIdiomas) {
        this.notasIdiomas = notasIdiomas;
    }

    @Override
    public double notaMedia() {
        double result=0;
        double result2=0;

        for (int i = 0; i < super.getMarks().length; i++) {
            result +=super.getMarks()[i];
        }
        for (int i = 0; i < notasIdiomas.length; i++) {
            result2 += notasIdiomas[i];
        }
        result2=result2/notasIdiomas.length;
        result=result/super.getMarks().length;

        return (result2+result)/2;
    }

    @Override
    public String detail(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.detail());
        sb.append("\n\tPais: "+getPais());
        sb.append("\n\tNotas idiomas"+ Arrays.toString(getNotasIdiomas()));
        return sb.toString();
    }
    @Override
    public String toString() {
        return this.detail();
    }
}
