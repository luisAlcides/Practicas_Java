

package Models;

/**
 *
 * @author Alcides Blandon
 */
public class TReportesInteresCliente {

    private int id;
    private double intereses;
    private double pago;
    private double cambio;
    private int cuotas;
    private String interesFecha;
    private String ticketIntereses;
    private int idCliente;

    public TReportesInteresCliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public String getInteresFecha() {
        return interesFecha;
    }

    public void setInteresFecha(String interesFecha) {
        this.interesFecha = interesFecha;
    }

    public String getTicketIntereses() {
        return ticketIntereses;
    }

    public void setTicketIntereses(String ticketIntereses) {
        this.ticketIntereses = ticketIntereses;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
}
