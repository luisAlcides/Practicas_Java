package Arreglos;

import java.util.Scanner;

public class ArreglosEliminarPosicion {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        System.out.println();
        System.out.println("Arreglo");
        for (int elemento : a) {
            System.out.print(elemento + " ");
        }
        System.out.println();
        System.out.println("Ingrese posicion a elminar entre 0 y 9");
        int posicion = sc.nextInt();

        for(int i = posicion; i < a.length - 1; i++){
            a[i] = a[i+1];
        }

        System.out.println();
        System.out.println("Valores modificados: ");
        int i = 0;
        for (int valores: a) {
            System.out.print("a[" +(i++)+"] = " + valores +" , ");
        }

        int[] b = new int[a.length - 1];
        System.arraycopy(a, 0, b, 0, b.length);

        for (int j = 0; j < b.length ; j++) {
            System.out.println(j + "=> " + b[j]);
        }
    }
}
