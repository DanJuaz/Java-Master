package com.dazn.interfaces.crud.repository;

import com.dazn.interfaces.crud.model.Cliente;

import java.util.List;

public interface ICrudRepositorio {
    List<Cliente> listar();
    Cliente porId(Integer id);
     void crear(Cliente cliente);
     void editar(Cliente cliente);
     void eliminar(Integer id);

}
