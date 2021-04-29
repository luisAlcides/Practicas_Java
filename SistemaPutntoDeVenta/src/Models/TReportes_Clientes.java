package Models;

/**
 *
 * @author Alcides Blandon
 */
public class TReportes_Clientes extends TClientes{

    private int idReporte;
    private double deudaActual;
    private double deuda;
    private double mensual;
    private double cambio;
    private String fechaDeuda;
    private double ultimoPago;
    private String fechaPago;
    private String ticket;
    private String fechaLimite;
    private int idCliente;

    public TReportes_Clientes() {
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public double getMensual() {
        return mensual;
    }

    public void setMensual(double mensual) {
        this.mensual = mensual;
    }

    @Override
    public double getCambio() {
        return cambio;
    }

    @Override
    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    
    
    
    
    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public double getDeudaActual() {
        return deudaActual;
    }

    public void setDeudaActual(double deudaActual) {
        this.deudaActual = deudaActual;
    }

    public String getFechaDeuda() {
        return fechaDeuda;
    }

    public void setFechaDeuda(String fechaDeuda) {
        this.fechaDeuda = fechaDeuda;
    }

    public double getUltimoPago() {
        return ultimoPago;
    }

    public void setUltimoPago(double ultimoPago) {
        this.ultimoPago = ultimoPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    @Override
    public int getIdCliente() {
        return idCliente;
    }

    @Override
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
    
}
