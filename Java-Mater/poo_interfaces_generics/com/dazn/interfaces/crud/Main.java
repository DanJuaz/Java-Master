package com.dazn.interfaces.crud;

import com.dazn.interfaces.crud.model.Cliente;
import com.dazn.interfaces.crud.repository.ClienteList;
import com.dazn.interfaces.crud.repository.Direccion;
import com.dazn.interfaces.crud.repository.IInterfacesMultiples;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IInterfacesMultiples repo = new ClienteList();
        repo.crear(new Cliente("Dan", "AZ"));
        repo.crear(new Cliente("Bea", "Gonzaléz"));
        repo.crear(new Cliente("Andres", "Gúzman"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("===== paginar ====");

        List<Cliente> paginable = repo.listar(1,2);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar =====");
        List<Cliente> clientesOrdenASC = repo.listar("nombre", Direccion.ASC);

        for (Cliente c:
             clientesOrdenASC) {
            System.out.println(c);
        }

        System.out.println("===== editar =====");
        Cliente julioActulizar = new Cliente("Julio", "Azurduy");
        julioActulizar.setId(2);
        repo.editar(julioActulizar);
        Cliente julio = repo.porId(2);
        System.out.println(julio);

        System.out.println("===== eliminar ======");
        repo.eliminar(1);
        repo.listar().forEach(System.out::println);

        System.out.println("==== total de registro ====");
        System.out.println(repo.total());


    }
}
