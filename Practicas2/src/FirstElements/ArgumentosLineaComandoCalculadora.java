package FirstElements;

import javax.swing.*;

public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {


        if (args.length != 3) {
            System.out.println("Por favor ingresar una operacion (suma, resta, multi, div)" +
                    " y dos numeros enterso");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;

        switch (operacion) {
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multi":
                resultado = a * b;
                break;
            case "div":
                resultado = (double) a / b;
                break;
            default:
                JOptionPane.showMessageDialog(null, "No conozco esta operacion");
        }

        System.out.println("Resultado de la operacion " + operacion + "es: " + resultado);
        //En terminal javac ArgumentosLineaComandoCalculado.java -encoding utf8
    }
}
