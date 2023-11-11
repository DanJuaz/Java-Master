package com.dazn.interfaces.catalago;

import com.dazn.interfaces.catalago.productos.Electronicos.IPhone;
import com.dazn.interfaces.catalago.productos.Electronicos.TvLcd;
import com.dazn.interfaces.catalago.productos.IProducto;
import com.dazn.interfaces.catalago.productos.Libros.Comics;
import com.dazn.interfaces.catalago.productos.Libros.Libro;
import com.dazn.interfaces.catalago.productos.Producto;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        IProducto[] productos = new Producto[3];
        productos[0] = new IPhone(1300, "Steve Jobs", "Rosa", "14");
        productos[1] = new Libro(15, new Date("1988/06/06"), "George Orwell","Propia", "Rusa");
        productos[2] = new Comics(new Date("1900/06/06"), "Francisco Ibáñez", "Mortadelo y Filemon", "T.I.A", "Mortadelo");
        productos[3] = new TvLcd(99, "LG", "15");

    }
}
