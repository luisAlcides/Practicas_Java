package Arreglos;

import java.util.Scanner;

public class ArreglosBuscarNumeros {
    public static void main(String[] args) {

        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        System.out.println("Cual es el numero a buscar: ");
        int num = sc.nextInt();

        int i = 0;
        while( i < a.length &&  a[i] != num ){
            i++;
        }

        if(i == a.length){
            System.out.println("Numero no encontrado");
        }else if(a[i] == num){
            System.out.println("Numero encontrado en el indice: " + i);
        }
        
    }
}
