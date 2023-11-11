import java.util.Arrays;
public class CocheArray{
    public static void main(String[] args) {

        Coche nissan = new Coche("Nisaan", "Navara", EnumColor.GREY, new Engine(70.00d,EnumTypeEngine.GASOLINE), new Tank(60), EnumType.COUPE);
        Coche mazda = new Coche("Mazda","BT-50", EnumColor.RED, new Engine(), new Tank(), EnumType.CONVERTIBLE);
        Person maria = new Person("Maria", "Martinez");
        nissan.setDriver(maria);
        Wheel[] nissanWheels= new Wheel[5];
        for (int i = 0; i < nissanWheels.length; i++) {
            nissan.addWheel(new Wheel("Yokohoma", 16, 7));
        }
        mazda.addWheel(new Wheel("Pirelli", 20, 11))
                .addWheel(new Wheel("Pirelli", 20, 11))
                .addWheel(new Wheel("Pirelli", 20, 11))
                .addWheel(new Wheel("Pirelli", 20, 11))
                .addWheel(new Wheel("Pirelli", 20, 11))
                .addWheel(new Wheel("Pirelli", 20, 11));
        Coche[] coches = new Coche[2];
        coches[0]=nissan;
        coches[1]=mazda;

        Arrays.sort(coches);

        for (Coche coche:
             coches) {
            System.out.println(coche);
            
        }


    }
}
