package com.dazn.interfaces.crud.repository;

import com.dazn.interfaces.crud.model.Cliente;

import java.util.List;

public interface IPaginable {
    List<Cliente> listar(int desde, int hasta);
}
