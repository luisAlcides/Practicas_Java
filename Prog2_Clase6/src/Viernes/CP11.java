package Viernes;

import Hilos.*;

/**
 *
 * @author Alcides Blandon
 */
public class CP11 extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);

        }
    }
}
