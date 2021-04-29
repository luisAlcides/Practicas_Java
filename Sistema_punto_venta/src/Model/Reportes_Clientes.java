

package Model;

/**
 *
 * @author Alcides Blandon
 */
public class Reportes_Clientes extends Clientes{
    private int IdRegistro;
    private int IdCliente;
    private String SaldoActual;
    private String FechaActual;
    private String UltimoPago;
    private String FechaPago;
    private String ID;

    public Reportes_Clientes() {
    }

    public Reportes_Clientes(int IdCliente, String SaldoActual, String FechaActual, String UltimoPago, String FechaPago, String ID) {
        
        this.IdCliente = IdCliente;
        this.SaldoActual = SaldoActual;
        this.FechaActual = FechaActual;
        this.UltimoPago = UltimoPago;
        this.FechaPago = FechaPago;
        this.ID = ID;
    }

    public int getIdRegistro() {
        return IdRegistro;
    }

    public void setIdRegistro(int IdRegistro) {
        this.IdRegistro = IdRegistro;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(String SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public String getFechaActual() {
        return FechaActual;
    }

    public void setFechaActual(String FechaActual) {
        this.FechaActual = FechaActual;
    }

    public String getUltimoPago() {
        return UltimoPago;
    }

    public void setUltimoPago(String UltimoPago) {
        this.UltimoPago = UltimoPago;
    }

    public String getFechaPago() {
        return FechaPago;
    }

    public void setFechaPago(String FechaPago) {
        this.FechaPago = FechaPago;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    

}
