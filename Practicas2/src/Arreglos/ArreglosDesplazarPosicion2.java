package Arreglos;

import java.util.Scanner;

public class ArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length-1; i++) {
            a[i] = (int) (Math.random() *100);
        }

        System.out.println("Original");
        for (int valor: a) {
            System.out.print(valor + " ");
        }

        System.out.println();
        System.out.println("Nuevo Elemento: ");
        elemento = sc.nextInt();

        System.out.println("Posicion donde agregar el elemento de 0-9");
        posicion = sc.nextInt();

        for (int i = a.length-2; i >= posicion; i--) {
            a[i+1] = a[i];
        }

        a[posicion] = elemento;

        System.out.println();
        System.out.println();
        System.out.println("Desplazado");
        for (int valor: a) {
            System.out.print(valor + " ");
        }

    }
}
