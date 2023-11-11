package com.danzj.ejemplo;

import com.danzj.pooherencia.AlumnoInternacional;
import com.danzj.pooherencia.Persona;
import com.danzj.pooherencia.Alumno;
import com.danzj.pooherencia.Profesor;

public class Ejemplo {
    public static void main(String[] args) {
        Persona profesor = new Profesor();
        profesor.setName("Luis");
        profesor.setSurname("Mi");
        ((Profesor)profesor).setSubject("Lengua");

        Alumno alumno = new Alumno();
        alumno.setName("Julio");
        alumno.setSurname("Daniel");
        alumno.setSchoolname("Peña Florida");

        AlumnoInternacional aInter = new AlumnoInternacional();
        aInter.setName("Ivan");
        aInter.setSurname("Iturralde");
        double[] notas = {5, 6,25};
        aInter.setNotasIdiomas(notas);

        // API know the inheritance
        Class clase = aInter.getClass();
        while(clase.getSuperclass() != null){
            String hijo = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println("La clase "+hijo+" es hija de "+padre);
            clase = clase.getSuperclass();
        }
    }
}
