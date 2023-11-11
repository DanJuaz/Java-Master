package com.dazn.interfaces.crud.repository;

import com.dazn.interfaces.crud.model.Cliente;

import java.util.List;

public interface IOrdenable {
    List<Cliente> listar(String campo, Direccion dir);

    default int ordenar(String campo, Cliente a, Cliente b){
        int resultado = 0;
            switch (campo){
                case "id"->
                        resultado = a.getId().compareTo(b.getId());
                case "nombre"->
                        resultado = a.getNombre().compareTo(b.getNombre());
                case "apellido"->
                        resultado = a.getApellido().compareTo(b.getApellido());
            }
        return resultado;
    }
}
