

package proyecto.uni.model;

import java.util.List;
import javax.swing.JRadioButton;

/**
 *
 * @author Alcides Blandon
 */
public class InteresSimple extends Interes{

    List<JRadioButton> radioButtons;
    
    
    public InteresSimple() {
    }

    public InteresSimple(double monto, double capital, double tasa, double perido, List<JRadioButton> radioButtons,List<String> tiempoDeTaza) {
        super(monto,capital, tasa, perido, tiempoDeTaza);
        this.radioButtons = radioButtons;
    }
    
  
    //cIS -> calcular interes simple
    public void cISMonto(double capital, double tasa, double periodo){
        double resultado = 0; 
        if(radioButtons.get(0).isSelected()){
            resultado = capital*(1 +(tasa*periodo));
            setMonto(resultado);
        }
    } 

}

