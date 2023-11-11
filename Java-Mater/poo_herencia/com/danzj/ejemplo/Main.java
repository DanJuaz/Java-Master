package com.danzj.ejemplo;

import com.danzj.pooherencia.Alumno;
import com.danzj.pooherencia.AlumnoInternacional;
import com.danzj.pooherencia.Persona;
import com.danzj.pooherencia.Profesor;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("NPC","...",99);
        Persona profesor = new Profesor("Luis", "Mi", 52, "Lengua");

        int[] notas = {5, 6,6};
        Alumno alumno = new Alumno("Julio", "Daniel", 17, "Peña Florida", notas);

        double[] notasIdiomas={2.25, 8.36};
        AlumnoInternacional aInter = new AlumnoInternacional("Ivan",  "Iturralde", 23, "PeñaFlorida", notas, "Argentina", notasIdiomas );

        System.out.println(persona);
        System.out.println(profesor);
        System.out.println(aInter);
        System.out.println(alumno);


    }
}
