public class ClaseMath {
    public static void main(String[] args) {
        int absolute = Math.abs(-3);
        System.out.println("absolute = " + absolute);

        absolute = Math.abs(3);
        System.out.println("absolute = " + absolute);

        double max = Math.max(3.5, 1.02);
        System.out.println("max = " + max);

        int min = Math.min(3,5);
        System.out.println("min = " + min);
        // Techo
        double stretch = Math.ceil(3.5);
        System.out.println("stretch = " + stretch);

        double floor = Math.floor(3.5);
        System.out.println("floor = " + floor);
        // Round as Math >= x.5 UP
        long round = Math.round(Math.PI);
        System.out.println("round = " + round);

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double power = Math.pow(3,2);
        System.out.println("power = " + power);

        double square = Math.sqrt(5);
        System.out.println("square = " + square);

        double degrees = Math.toDegrees(1.57);
        degrees = Math.round(degrees);
        System.out.println("Convert to degrees = " + degrees);

        double radiants = Math.toRadians(150.00);
        System.out.println("Convert to radiants = " + radiants);

        System.out.println("Math.sin(radiants) = " + Math.sin(radiants));
        System.out.println("Math.cos(radiants) = " + Math.cos(radiants));
        
        radiants = Math.toRadians(180.00);
        System.out.println("Math.cos(radiants) = " + Math.cos(radiants));
        
        radiants = Math.toRadians(0.80);
        System.out.println("Math.cos(radiants) = " + Math.cos(radiants));





    }
}
