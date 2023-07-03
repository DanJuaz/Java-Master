import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UtilDateParse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Introduzca la fecha con este formato 'yyyy-MM-dd': ");
        try {
            Date date = format.parse(sc.next());
            System.out.println("date = " + date);
            System.out.println("format = " + format.format(date));
        } catch (ParseException e) {
            System.err.println("La fecha tiene un formato incorrecto : "+e.getMessage());
            System.err.println("El formato debe ser 'yyyy-MM-dd'");
            System.exit(1);
            main(args);
        }

    }
}
