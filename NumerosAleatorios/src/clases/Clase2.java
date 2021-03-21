package clases;

import java.util.Random;

/**
 *
 * @author Alcides Blandon
 */
public class Clase2 {
    public static void main(String[] args) {
        int aleatorio = 0;
        
        Random r = new Random();
        
        aleatorio = (int) (r.nextDouble() * 100);
        System.out.println(aleatorio);
    }

}
