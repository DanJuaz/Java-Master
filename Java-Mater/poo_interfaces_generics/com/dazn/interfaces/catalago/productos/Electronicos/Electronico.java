package com.dazn.interfaces.catalago.productos.Electronicos;
import com.dazn.interfaces.catalago.productos.Producto;

public abstract class Electronico extends Producto implements IElectronico{
    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }
}
