package com.dazn.mamiferos;

abstract public class Mamifero {
    protected String habitat;
    protected float altura;
    protected float largo;
    protected float peso;
    protected String nombreCientifico;

    public Mamifero(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public Mamifero(String habitat, float altura, float largo, float peso) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
    }

    public Mamifero(){};

    public String getHabitat() {
        return habitat;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargo() {
        return largo;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String comer() {
        return null;
    }
    public String dormir(){
        return null;
    }
    public String correr(){
        return null;
    };
    public String comunicarse(){
        return null;
    };
}
