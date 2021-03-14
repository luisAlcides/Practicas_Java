package clases;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alcides Blandon
 */
public class ClasePrincipal {

    public static void main(String[] args) {
//
//        Proceso hilo1 = new Proceso("hilo1");
//        Proceso hilo2 = new Proceso("hilo2");
//        Proceso hilo3 = new Proceso("hilo3");
//
//        hilo1.valorDeCondicion(3);
//        hilo2.valorDeCondicion(10);
//        hilo3.valorDeCondicion(5);
//
//        hilo1.start();
//        hilo2.start();
//        hilo3.start();

        HiloProceso hiloProceso = new HiloProceso("Hilo1");
        HiloProceso hiloProceso2 = new HiloProceso("Hilo2");
        
        hiloProceso.start();
        try {
            hiloProceso.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("Error en el hilo uno"+ ex);
        }
        hiloProceso2.start();
    
    }
}
