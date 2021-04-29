package Viernes.Modelo;

/**
 *
 * @author Alcides Blandon
 */
public class CReciboEnvio {

    private double tasaCambio;
    private double monto;
    private double totalPagar;
    private double importe;
    private double comision;

    public CReciboEnvio() {
    }

    public CReciboEnvio(double tasaCambio, double monto, double totalPagar, double importe, double comision) {
        this.tasaCambio = tasaCambio;
        this.monto = monto;
        this.totalPagar = totalPagar;
        this.importe = importe;
        this.comision = comision;
    }

    public void calcular(String moneda) {
        if (moneda.equals("Cordoba")) {
            tasaCambio =1;
            importe = tasaCambio * monto;
            comision = Math.abs(comision - (importe * 0.12));
            totalPagar = importe + comision;
        } else if (moneda.equals("Dolares")) {
            importe = tasaCambio * monto;
            comision = Math.abs(comision - (importe * 0.12));
            totalPagar = importe + comision;
        }
    }

    public double getTasaCambio() {
        return tasaCambio;
    }

    public void setTasaCambio(double tasaCambio) {
        this.tasaCambio = tasaCambio;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

}
