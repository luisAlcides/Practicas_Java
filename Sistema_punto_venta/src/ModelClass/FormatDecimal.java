

package ModelClass;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alcides Blandon
 */
public class FormatDecimal {

    DecimalFormat formateador= new DecimalFormat("###,###,###.00");
    Number numero;
    
    public String decimal(double formato){
        return formateador.format(formato);
    }
    
    public double reconstruir(String formato){
        try {
            numero = formateador.parse(formato);
        } catch (ParseException ex) {
            System.out.println("Error en FormatDecimal.reconstruir() : " + ex);
        }
        
        return numero.doubleValue();
    }
}
