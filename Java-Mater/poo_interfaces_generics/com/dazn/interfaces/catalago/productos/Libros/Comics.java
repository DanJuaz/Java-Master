package com.dazn.interfaces.catalago.productos.Libros;

import java.util.Date;

public class Comics extends Libro{
    private String personaje;

    public Comics(Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(0, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

}
