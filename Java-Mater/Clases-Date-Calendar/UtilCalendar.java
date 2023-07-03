import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        //calendar.set(2002, Calendar.JUNE, 15, 19,5,06);
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.set(Calendar.YEAR,2023);
        calendar.set(Calendar.MONTH, Calendar.APRIL);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        calendar.set(Calendar.HOUR_OF_DAY, 21);
        calendar.set(Calendar.MINUTE, 15);
        calendar.set(Calendar.SECOND,59);

        Date date = calendar.getTime();
        System.out.println("Calendario: "+date);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd / HH:mm:ss:SSS a");
        String dateformat = format.format(date);
        System.out.println("Fecha con formato: "+dateformat);

    }
}
