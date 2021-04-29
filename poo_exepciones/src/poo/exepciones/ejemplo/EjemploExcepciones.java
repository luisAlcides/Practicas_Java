package poo.exepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {


        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un valor");
        int divisor;

        try {
            divisor = Integer.parseInt(valor);
            double division = cal.dividir(10, divisor);
            System.out.println(division);
        } catch (NumberFormatException ex) {
            System.out.println("El campo debe ser un valor numerico: " + ex.getMessage());
        } catch (DivisionPorZeroException ae) {
            System.out.println("Capturamos la excepcion en tiempo de ejecucion ");
            System.out.println("NO se puede dividir: " + ae.getMessage());
        } finally {
            System.out.println("En el finally siempre ocurrira");
        }
        System.out.println("Continua el flujo de el programa");
    }
}
