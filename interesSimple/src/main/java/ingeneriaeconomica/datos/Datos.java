

package ingeneriaeconomica.datos;

/**
 *
 * @author Alcides Blandon
 */
public class Datos {
    
    private double monto;
    private double capital;
    private double interes;
    private double periodo;

    public Datos() {
    }

    public Datos(double monto, double capital, double interes, double periodo) {
        this.monto = monto;
        this.capital = capital;
        this.interes = interes;
        this.periodo = periodo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getPeriodo() {
        return periodo;
    }

    public void setPeriodo(double periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Datos{" + "monto=" + monto + ", capital=" + capital + ", interes=" + interes + ", periodo=" + periodo + '}';
    }
    
    
    

}
