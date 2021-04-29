package FirstElements;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2020, Calendar.JANUARY, 25);
        Date fecha = calendario.getTime();


        calendario.set(Calendar.YEAR, 2021);
        calendario.set(Calendar.MONTH, Calendar.APRIL);
        calendario.set(Calendar.DAY_OF_MONTH, 10);
        calendario.set(Calendar.HOUR, 3);
        calendario.set(Calendar.MINUTE, 31);
        calendario.set(Calendar.SECOND, 10);

        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");

        System.out.println("fecha = " + formato.format(fecha));

    }
}
