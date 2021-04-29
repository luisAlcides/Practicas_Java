package Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class Arreglos {

    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
         }
    }

    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Kingston pendrive";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Solido SSD";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast";
        productos[6] = "Bicicleta Oxford";

       Arrays.sort(productos);

        for (String str: productos) {
            System.out.println("Producto = " + str);
        }

        Collections.reverse(Arrays.asList(productos));

        System.out.println();
        for (String str: productos) {
            System.out.println("Producto = " + str);
        }
    }
}
