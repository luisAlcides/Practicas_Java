package Viernes;

import Hilos.*;
import Hilos.CP1;


/**
 *
 * @author Alcides Blandon
 */
public class CPrincipal1 {

    static int variable = 0;
    static Object objeto = new Object();

    public void generarHilos() {

       CP11 cp1 = new CP11();
       Thread cp2 = new Thread(new CP2());
       
       cp1.start();
       cp2.start();
    }
}

class Cp2{
    int variable;
    
}