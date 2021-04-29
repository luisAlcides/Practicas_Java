package Arreglos;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ArreglosBuscarString {
    public static void main(String[] args) {

        String a[] = new String[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese un String");
            a[i] = sc.next();
        }

        System.out.println("Cual es su String: ");
        String buscando = "";

        int i = 0;
        while( i < a.length &&  !a[i].equalsIgnoreCase(buscando)){
            i++;
        }
        
        if(i == a.length){
            System.out.println("String  no encontrado");
        }else if(a[i].equalsIgnoreCase(buscando)){
            System.out.println("String encontrado en el indice: " + i);
        }
        
    }
}
