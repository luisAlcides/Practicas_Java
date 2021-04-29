package Hilos;

import static Hilos.CPrincipal.objeto;
import static Hilos.CPrincipal.variable;

/**
 *
 * @author Alcides Blandon
 */
public class CP1 extends Thread {

    @Override
    public void run() {
        synchronized (objeto) {
            for (int i = 0; i < 10; i++) {
                variable += i;
                System.out.println("variable = " + variable);

            }
        }
    }
}
