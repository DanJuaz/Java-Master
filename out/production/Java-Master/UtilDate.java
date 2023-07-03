import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        //Tue Jun 27 15:25:06 CEST 2023
        SimpleDateFormat df = new SimpleDateFormat("\n hh HH hhhh HHHH\n dd DD dddd DDDD \n mm MM mmmm MMMM \n yy dd yyyy YYYY");
        String newdate = df.format(date);
        System.out.println("Formato: "+newdate);
        long j=0;
        for (int i = 0; i < 100000000; i++) {
            j +=i;
        }
        System.out.println(j);

        Date date2 = new Date();
        long timefinal = date2.getTime() - date.getTime();
        System.out.println("Timpor transcurrido en el bucle: "+timefinal);
    }
}
