

package proyecto.uni.model;

import java.util.List;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import proyecto.uni.controller.DatosGenerales;

/**
 *
 * @author Alcides Blandon
 */
public class InteresCompuesto extends Interes{

    private List<JRadioButton> radioButtons;
    private List<String> tiempoTaza;
    private DatosGenerales datos;
    
    public InteresCompuesto() {
    }

    public InteresCompuesto(double monto, double capital, double tasa, double perido,
            List<JRadioButton> radioButtons,List<String> tiempoDeTaza) {
        super(monto, capital, tasa, perido, tiempoDeTaza);
        this.radioButtons = radioButtons;
        this.tiempoTaza = tiempoDeTaza;
        datos = new DatosGenerales();
    }

    //cIC -> calcular interes Compuesto
    public void cICMonto(double capital, double tasa, double periodo) {
        double resultado = 0;
        tasa = tasa / 100;
        resultado = capital*(Math.pow(1+tasa, periodo));
        setMonto(resultado);

    }

    public void cICCapital(double monto, double tasa, double periodo) {
        double resultado = 0;
        tasa = tasa / 100;
        resultado = monto / (1 + (tasa * periodo));
        setMonto(resultado);

    }

    public void cICTasa(double monto, double capital, double periodo) {
        double resultado = 0;
        resultado = ((monto / capital) - 1) / periodo;
        setTasa(resultado * 100);

    }

    public void cICPeriodo(double monto, double capital, double tasa) {
        double resultado = 0;
        tasa = tasa / 100;
        resultado = ((monto / capital) - 1) / tasa;
        setPerido(resultado);

    }

    public void limpiar(List<JTextField> textField) {
        System.out.println("Entro");
        for (int i = 0; i < textField.size(); i++) {
            textField.get(i).setText("");
        }
        setCapital(0);
        setMonto(0);
        setPerido(0);
        setTasa(0);

    }

    
    
}
