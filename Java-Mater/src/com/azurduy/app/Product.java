package com.azurduy.app;

public abstract class Product {
    private Integer cod;
    private static int index;
    private String name;
    private double price;

    public Product() {
        this.cod = ++index;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return cod +
                "\t"+name+
                "\t"+price;
    }

    public abstract double getPrecioVenta();
}
