package clases;

/**
 *
 * @author Alcides Blandon
 */
public class HiloProceso extends Thread {

    public HiloProceso(String nombre) {
        super(nombre);
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(this.getName() + ": " + i);
        }
    }

}
