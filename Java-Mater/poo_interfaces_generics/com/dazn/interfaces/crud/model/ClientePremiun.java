package com.dazn.interfaces.crud.model;

public class ClientePremiun extends Cliente implements Comparable<ClientePremiun>{
    public ClientePremiun(String nombre, String apellido) {
        super(nombre, apellido);

    }
    // Lo dejaremos para despues
    @Override
    public int compareTo(ClientePremiun o) {
        return 0;
    }
}
