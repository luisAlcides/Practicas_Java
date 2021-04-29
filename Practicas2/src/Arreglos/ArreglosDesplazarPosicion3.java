package Arreglos;

import java.util.Scanner;

public class ArreglosDesplazarPosicion3 {
    public static void main(String[] args) {

        int[] a = new int[7];
        int numero, posicion;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        System.out.println("Arreglo");
        for (int valores : a) {
            System.out.print(valores + " ");
        }

        System.out.println("Ingrese un numero a insertar");
        numero = sc.nextInt();

        posicion = 0;

        while (posicion < 6 && numero > a[posicion]) {
            posicion++;
        }

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        a[posicion] = numero;
        System.out.println();
        System.out.println("El nuevo arreglo ordenado");
        for (int valores : a) {
            System.out.print(valores + " ");
        }
    }
}
