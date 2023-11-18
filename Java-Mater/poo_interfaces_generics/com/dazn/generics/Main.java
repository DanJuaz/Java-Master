package com.dazn.generics;

import com.dazn.interfaces.crud.model.Cliente;
import com.dazn.interfaces.crud.model.ClientePremiun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Las clases genericas de java hacen mucho mas reustilizable le codigo
        // Tipo de variable
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Julio", "Azurduy"));

        Cliente julio = clientes.iterator().next();

        Cliente[] clientesArreglo = {new Cliente("Luci", "Martinez"), new Cliente("Ismael", "Azurduy")};
        Integer[] numerosArreglo = {1,24,2};
        List<Cliente> listaclientes = fromArrayToList(clientesArreglo);
        // Metodod sobrecarga Number
        List<Integer> listanumeros = fromArrayToList(numerosArreglo);

        listaclientes.forEach(System.out::println);
        listanumeros.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Julio", "Daniel", "Azurduy"}, numerosArreglo);
        nombres.forEach(System.out::println);
        // Limite para ClientePremiun
        List<ClientePremiun> listaCleintesPremiun = fromArrayToList(new ClientePremiun[]{
                new ClientePremiun("PremiunNombre", "PremiunApellido")});

        imprimirClientes(clientes);
        imprimirClientes(listaclientes);
        imprimirClientes(listaCleintesPremiun);
    }

    /*
    // Conertir arreglos a listas
    // Muy pcoco especifico, y solo acepta una lista de clientes
    public static List <Cliente> fromArraytoList(Cliente[] c){ return Arrays.asList(c);}
    // Metodo generico
    public static <T> List<T> fromArrayToList (T[] c){
        return Arrays.asList(c);
    }
    // Sobrecarga de el emtodo generico
    public static <T, G> List<T> fromArrayToList (T[] c, G[] x){
        for(G elemento : x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }
    */
    // Metodo generico
    public static <T> List<T> fromArrayToList (T[] c){
        return Arrays.asList(c);
    }

    // Bounded Generic method / Limitar metodos genericos

    // Number {Integer, Float, Long...}
    public static <T extends Number> List<T> fromArrayToList (T[] c){
        return Arrays.asList(c);
    }
    // ClientePremiun
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList (T[] c){
        return Arrays.asList(c);
    }
    // Sobrecarga de el emtodo generico
    public static <T, G> List<T> fromArrayToList (T[] c, G[] x){
        for(G elemento : x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }
}
