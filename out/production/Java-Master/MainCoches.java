public class MainCoches {
    public static void main(String[] args) {
        //Coche subaru = new Coche("Subaru", "Impreza", Color.WHITE, 100.00);
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

        //System.out.println(nissan.getDriver());

        // Coche nissan2 = new Coche("Nisaan", "Navara", Color.GREY, 350.00,50, Tipo.ELECTRIC);
        // Coche nissan = new Coche();
        System.out.println(mazda.toString());
        System.out.println(nissan.toString());

        //System.out.println(mazda);
        //System.out.println(nissan2.toString());
        //System.out.println("nissan2==nissan -> " +(nissan2==nissan));
        //System.out.println("nissan2==nissan  con equals override->" + nissan.equals(nissan2));
        /*
        EnumType[] types= EnumType.values();
        for (EnumType type:types) {
            System.out.println(type.getNombre()+", "+type.getDescription()+", "+type.getDoors());
        }
         */
    }
}
