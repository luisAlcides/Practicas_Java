

package Lunes.Modelo;

import java.util.Date;

/**
 *
 * @author Alcides Blandon
 */
public class CVendedor {
    private String vendedor, tipoVenta;
    private double ventasBrutas, tarifaComision, comision, totalSalarios;

    
    Date fecha = new Date();
    
    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getTotalSalarios() {
        return totalSalarios;
    }

    public void setTotalSalarios(double totalSalarios) {
        this.totalSalarios = totalSalarios;
    }
    
    public double CComision(){
        this.comision = this.tarifaComision * this.ventasBrutas;
        return this.comision;
    }
    
    
    public double CIngresos(){
        this.totalSalarios = this.comision + this.ventasBrutas;
        return this.totalSalarios;
    }
    
    
    public String imprimir(){
        String retorno = "";
        
        retorno =
                "\n==========LIQUIDACIÓN DE VENTAS=========="
                + "\nNombre: " + this.vendedor
                +"\nTipo de Ventas: " + this.tipoVenta
                +"\nTarifa Comision: " + this.tarifaComision
                +"\nVentas: " + this.ventasBrutas
                +"\nTotal Comisión: " + this.comision
                +"\nTotal Salario: " + this.totalSalarios
                +"\nFecha/Hora de Impresión: " + this.fecha
                +"\n==========ULTIMA LINEA==========";
        
        return retorno;
    }

}
