package Hilos;

import Hilos.CP1;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alcides Blandon
 */
public class CPrincipal {

    static int variable = 0;
    static Object objeto = new Object();

    public void generarHilos() {

        CP1[] hilos = new CP1[10];

        for (int i = 0; i < 2; i++) {
            hilos[i] = new CP1();

        }

        for (int i = 0; i < 2; i++) {
            hilos[i].start();
            System.out.println("hilos[i] = " + hilos[i] + " = " + i);

        }

        for (int i = 0; i < 2; i++) {
            try {
                hilos[i].join();

            } catch (InterruptedException ex) {
                Logger.getLogger(CPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("");
        System.out.println("Variable = " + variable);
    }
}
