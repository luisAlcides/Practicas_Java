package clases;

/**
 *
 * @author Alcides Blandon
 */
public class ClasePrincipal {

    public static void main(String args[]) {
        Proceso1 proceso1 = new Proceso1();
        Thread proceso2 = new Thread(new Proceso2());
        
        proceso1.start();
        proceso2.start();
    }
}
