import java.util.Random;

public class ClassRandom {
    public static void main(String[] args) {
        String[] colores = {"azul", "amarillo", "rojo", "verde", "morado"};
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;

        System.out.println("random = " + random);
        
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores[(int) random] = " + colores[(int) random]);

        // Java Util Random
        Random randomObj = new Random();
        int randomInt = 15 +randomObj.nextInt(25+15+1);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("color = " + colores[randomInt]);
        
    }
}
