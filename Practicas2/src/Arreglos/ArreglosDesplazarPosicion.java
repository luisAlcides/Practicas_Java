package Arreglos;

import java.util.Scanner;

public class ArreglosDesplazarPosicion {
    public static void main(String[] args) {

        int[] a = new int[10];
        int ultimo;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() *100);
        }

        System.out.println("Original");
        for (int valor: a) {
            System.out.print(valor + " ");
        }

        ultimo = a[a.length -1];
        for (int i = a.length-2; i >= 0; i--) {
            a[i+1] = a[i];
        }

        a[0] = ultimo;

        System.out.println();
        System.out.println();
        System.out.println("Desplazado");
        for (int valor: a) {
            System.out.print(valor + " ");
        }

    }
}
