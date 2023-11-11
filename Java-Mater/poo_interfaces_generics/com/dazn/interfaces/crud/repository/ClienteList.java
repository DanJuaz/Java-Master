package com.dazn.interfaces.crud.repository;

import com.dazn.interfaces.crud.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteList implements IInterfacesMultiples{
    private List<Cliente> dataSource;

    public ClienteList() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return this.dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente result=null;
        for (Cliente c: dataSource) {
            if(c.getId().equals(id)){
                result=c;
                break;
            }
        }
        return result;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) ->{
            int resultado = 0;
            if(dir == Direccion.ASC){
                resultado = ordenar(campo, a, b);
            } else if (dir == Direccion.DESC) {
                resultado = ordenar(campo, a, b);
            }
            return resultado;
        });
        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return this.dataSource.subList(desde, hasta);
    }

    @Override
    public int total() {
        return dataSource.size();
    }
}
