package ingeneriaeconomica.domain;
/**
 *
 * @author Alcides Blandon
 */
public class Calculos {

   

    public double calcularMonto(double capital, double interes, double periodo) {
        double result;

        result = capital * (1 + (interes * periodo));

        return result;
    }

    public double calcularCapital(double monto, double interes, double periodo) {
        double result;

        result = monto / (1 + (interes * periodo));

        return result;
    }

    public double calcularinteres(double capital, double monto, double periodo) {
        double result;

        result = ((monto / capital) - 1) / periodo;

        return result;
    }

    public double calcularPeriodo(double capital, double interes, double monto) {
        double result;

        result = ((monto / capital) - 1) / interes;

        return result;
    }

}
