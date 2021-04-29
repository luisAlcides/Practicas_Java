package Conexion;

import Models.TClientes;
import Models.TConfiguraciones;
import Models.TReportes_Clientes;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author Alcides Blandon
 */
public class Consult extends Conexion {

    private QueryRunner QR = new QueryRunner();

    public List<TClientes> clientes() {
        List<TClientes> cliente = new ArrayList();
        try {
            cliente = (List<TClientes>) QR.query(getConn(), "SELECT * FROM tclientes",
                    new BeanListHandler(TClientes.class));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }

        return cliente;
    }
    
    public List<TReportes_Clientes> reportesClientes(int idCliente){
        String where = " WHERE tclientes.id ="+ idCliente;
        List<TReportes_Clientes> reportes = new ArrayList();
        String condicion1 = " tclientes.id = treportes_clientes.idCliente ";
        String condicion2 = " tclientes.id = treportes_intereses_cliente.idCliente ";
        
        String campos = " tclientes.id, tclientes.Nid, tclientes.nombre, tclientes.apellido,"
                + "treportes_clientes.idReporte, treportes_clientes.deudaActual,"
                + "treportes_clientes.fechaDeuda, treportes_clientes.ultimoPago,"
                + "treportes_clientes.fechaPago, treportes_clientes.ticket,"
                + "treportes_clientes.deuda, treportes_clientes.mensual, treportes_clientes.cambio,"
                + "treportes_clientes.fechaLimite, treportes_intereses_cliente.intereses,"
                + "treportes_intereses_cliente.pago, treportes_intereses_cliente.cambio,"
                + "treportes_intereses_cliente.cuotas, treportes_intereses_cliente.interesFecha,"
                + "treportes_intereses_cliente.ticketInteres";
        
        try {
            reportes = (List<TReportes_Clientes>) QR.query(getConn(),
                    "SELECT" + campos + " FROM tclientes INNER JOIN treportes_clientes ON"
                    +condicion1 +"INNER JOIN treportes_intereses_cliente ON"+condicion2 +where, new BeanListHandler(TReportes_Clientes.class));
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return reportes;
    }
    
     
    public List<TConfiguraciones> config(){
        List<TConfiguraciones> config = new ArrayList();
        
        try{
            config = (List<TConfiguraciones>) QR.query(getConn(), "SELECT * FROM tconfiguraciones",
                    new BeanListHandler(TConfiguraciones.class));
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error: "+ ex);
        }
        return config;
    }

}
