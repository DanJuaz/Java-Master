package com.dazn.generics;

import com.dazn.interfaces.crud.model.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Julio", "Azurduy"));

        Cliente julio = clientes.iterator().next();

        //Cliente clientesArreglo

        //Next step add Generic class
    }
    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
}
