package FirstElements;

import java.util.Random;

public class ClaseMathRandom {
    public static void main(String[] args) {


        String[] colores = {"amarillo", "azul", "rojo", "verde","blanco"};
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;

        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int)random]);

        Random randomObj = new Random();
        // Si queremo un numero aleatorio entre 15 y 25
        int randomInt = 15 + randomObj.nextInt(25 -15+1);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);


    }
}
