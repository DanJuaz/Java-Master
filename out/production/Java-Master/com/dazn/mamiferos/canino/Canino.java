package com.dazn.mamiferos.canino;

import com.dazn.mamiferos.Mamifero;

abstract public class Canino extends Mamifero {
    protected String color;
    protected float tamanoColmillos;

    public Canino(String habitat, float altura, float largo, float peso, String color, float tamanoColmillos) {
        super(habitat, altura, largo, peso);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }
}
