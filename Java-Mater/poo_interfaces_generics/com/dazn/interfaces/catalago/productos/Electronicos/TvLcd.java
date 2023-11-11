package com.dazn.interfaces.catalago.productos.Electronicos;

public class TvLcd extends Electronico{
    private String pulgada;

    public TvLcd(int precio, String fabricante, String pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio()*0.8;
    }

    public String getPulgada() {
        return pulgada;
    }
}
