package ejemplos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author Alcides Blandon
 */
public class LimitarDecimales {

    public static void main(String[] args) {

        double num = 2;
        double raiz = Math.sqrt(num);

        //Utilizando la clase Decimal Format
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Utilizando Decimal Format");
        System.out.println("Raiz: " + df.format(raiz));
        System.out.println("");

        //Utilizando String Format
        System.out.println("Utilizando String Format");
        System.out.println("Raiz: " + String.format("%.3f", raiz));
        System.out.println("");

        //Utilizando la clase Math.round
        System.out.println("Utilizando la clase Math.round");
        System.out.println("Raiz: " + (double) Math.round(raiz * 100d) / 100);
        System.out.println("");

        //utilizando la clase BigDecimal
        BigDecimal db = new BigDecimal(raiz);
        db = db.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Utilizando la BigDecimal");
        System.out.println("Raiz: " + db.doubleValue());
    }

}
