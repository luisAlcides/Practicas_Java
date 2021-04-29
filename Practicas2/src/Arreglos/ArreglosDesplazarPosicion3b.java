package Arreglos;

import com.sun.security.auth.NTSidUserPrincipal;

import java.util.Scanner;

public class ArreglosDesplazarPosicion3b {
    public static void main(String[] args) {

        int[] a = new int[7];
        int numero, posicion, ultimo;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        System.out.println("Arreglo");
        for (int valores : a) {
            System.out.print(valores + " ");
        }

        System.out.println("Ingrese un numero a insertar");
        numero = sc.nextInt();

        ultimo = a[a.length - 1];
        posicion = 0;

        while (posicion < 6 && numero > a[posicion]) {
            posicion++;
        }

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);

        if (numero > ultimo) {
            b[b.length - 1] = numero;
        } else {
            b[b.length - 1] = ultimo;
            b[posicion] = numero;

        }


        System.out.println();
        System.out.println("El nuevo arreglo ordenado");
        for (int valores : b) {
            System.out.print(valores + " ");
        }
    }
}
