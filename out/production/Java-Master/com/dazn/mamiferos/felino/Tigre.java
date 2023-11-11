package com.dazn.mamiferos.felino;

public class Tigre extends Felino{
    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }
    @Override
    public String comer() {
        return "El Tigre " + especieTigre + " caza solitario en los manglares y bosques monzónicos de " + habitat;
    }

    @Override
    public String dormir() {
        return "El Tigre " + especieTigre + " duerme en la selvas de " + habitat;
    }

    @Override
    public String correr() {
        return "El Tigre " + especieTigre + " corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Ruge Tigre y agacha sus orejas";
    }
}
