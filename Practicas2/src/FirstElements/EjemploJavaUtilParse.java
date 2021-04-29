package FirstElements;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formata: yyyy-MM-dd");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha: " + fecha);
            System.out.println("format: " + format.format(fecha));

            Date fecha2 = new Date();
            if (fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues de la fecha2");
            }else if(fecha.before(fecha2)){
                System.out.println("La fecha es antes de la fecha2");
            }else if(fecha.equals(fecha2)){
                System.out.println("Las fechas son iguales");
            }

            if(fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha del usuario es despues de la fecha2");
            }else if(fecha.compareTo(fecha2) < 0){
                System.out.println("La fecha es antes de la fecha2");
            }else if(fecha.compareTo(fecha2) == 0){
                System.out.println("Las fechas son iguales");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
