package com.dazn.mamiferos;
import com.dazn.mamiferos.canino.*;
import com.dazn.mamiferos.felino.*;

public class Main {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[6];

        Mamifero leon = new Leon("habitat", 85, 65, 32, 6,6,6,6);
        Mamifero tigre = new Tigre("Siberiano", 7.9f, 72, 72, 130, 330, "Rusa");
        Mamifero lobo = new Lobo("selva", 56, 2.5f, 70, "Europa", 80, 120, "Gris marrón y negro");
        Mamifero perro = new Perro("317", 2.5f, 43, 92, "Blanco",85, 14);
        Mamifero tigreBengala = new Tigre("India e Indonesia", 7.9f, 72,220 , 110, 270, "Bengala");
        Mamifero guepardo = new Guepardo("Africa", 130, 4.9f, 94, 140, 72);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = lobo;
        mamiferos[3] = perro;
        mamiferos[4] = tigreBengala;
        mamiferos[5] = guepardo;

        for (Mamifero animal : mamiferos) {

            System.out.println(" =============== " + animal.getClass().getSimpleName() + " =============== ");
            System.out.println("Habitat:" + animal.getHabitat());
            System.out.println("Altura:" + animal.getAltura());
            System.out.println("Largo:" + animal.getLargo());
            System.out.println("Peso:" + animal.getPeso());

            if (animal instanceof Canino) {
                System.out.println("Clomillos:" + ((Canino) animal).getTamanoColmillos());
                System.out.println("Color:" + ((Canino) animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie Lobo:" + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Número Integrantes:" + ((Lobo) animal).getNumCamada());
                }
                if (animal instanceof Perro) {
                    System.out.println("Fuerza mordida kg:" + ((Perro) animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Tamaño Garras:" + ((Felino) animal).getTamanoGarras());
                System.out.println("Velocidad:" + ((Felino) animal).getVelocidad());

                if (animal instanceof Leon) {
                    System.out.println("Potencia Rugido:" + ((Leon) animal).getPotenciaRugidoDecibel());
                    System.out.println("Número Integrantes:" + ((Leon) animal).getNumManada());
                }
                if (animal instanceof Tigre) {
                    System.out.println("especie Tigre:" + ((Tigre) animal).getEspecieTigre());
                }
            }

            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
        }

    }
}
