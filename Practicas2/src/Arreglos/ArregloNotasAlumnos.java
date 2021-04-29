package Arreglos;

import java.util.Scanner;

public class ArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] matematica, historia, quimica;
        int sumaMatematica = 0, sumaHistoria = 0, sumaQuimica = 0;

        matematica = new double[7];
        historia = new double[7];
        quimica = new double[7];

        for (int i = 0; i < matematica.length; i++) {
            matematica[i] = (int) (Math.random() * 100);
            historia[i] = (int) (Math.random() * 100);
            quimica[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < 7; i++) {
            sumaMatematica += matematica[i];
            sumaHistoria += historia[i];
            sumaQuimica += quimica[i];
        }


        System.out.println("Promedio de clase de Matematicas = " + (sumaMatematica / matematica.length));
        System.out.println("Promedio de clase de Historia = " + (sumaHistoria / historia.length));
        System.out.println("Promedio de clase de Quimica = " + (sumaQuimica / quimica.length));


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el identificador de el alumno de (1-7)");
        int alumno = sc.nextInt();
        alumno -= 1;
        int promedioAlumno = (int) ((matematica[alumno] + historia[alumno] + quimica[alumno]) / 3);
        System.out.println("Promedio de el Alumno id: " +(alumno+1) + " = "+ promedioAlumno);
    }
}
