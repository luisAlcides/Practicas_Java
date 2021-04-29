package Connection;

import Model.Clientes;
import Model.Proveedores;
import Model.Reportes_Clientes;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

/**
 *
 * @author Alcides Blandon
 */
public class Consult extends Conexion {

    private QueryRunner QR = new QueryRunner();
    private List<Clientes> cliente;
    private List<Reportes_Clientes> reportes_clientes;
    private List<Proveedores> proveedor;

    public List<Clientes> clientes() {
        try {
            cliente = (List<Clientes>) QR.query(getConn(), "SELECT * FROM clientes",
                    new BeanListHandler(Clientes.class));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return cliente;
    }

    public void insert(String sql, Object[] data) {
        try {
            final QueryRunner qr = new QueryRunner(true);
            qr.insert(getConn(), sql, new ColumnListHandler(), data);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

    public List<Reportes_Clientes> reportesClientes(int idCliente) {
        try {
            String condicion = " clientes.IdCliente = reportes_clientes.IdCliente ";
            String campos = " clientes.IdCliente,clientes.ID,clientes.Nombre,clientes.Apellido,"
                    + "reportes_clientes.IdRegistro,reportes_clientes.SaldoActual,"
                    + "reportes_clientes.FechaActual,reportes_clientes.UltimoPago,reportes_clientes.FechaPago ";
            reportes_clientes = (List<Reportes_Clientes>) QR.query(getConn(),
                    "SELECT " + campos + " FROM reportes_clientes INNER JOIN clientes ON "
                    + condicion + " WHERE reportes_clientes.IdCliente= " + idCliente, new BeanListHandler(Reportes_Clientes.class));
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return reportes_clientes;
    }

    public void update(String sql, Object[] data) {
        try {
            final QueryRunner qr = new QueryRunner(true);
            qr.update(getConn(), sql, data);
        } catch (SQLException ex) {
            System.out.println("Error Consult.update: " + ex);
        }
    }

    public void delete(String sql, int id) {
        try {
            final QueryRunner qr = new QueryRunner(true);
            qr.update(getConn(), sql, "%" + id + "%");
        } catch (SQLException ex) {
            System.out.println("Error Consult.delete : " + ex);
        }
    }

    public List<Proveedores> proveedores() {
        try {
            proveedor = (List<Proveedores>) QR.query(getConn(), "SELECT * FROM proveedores", new BeanListHandler(Proveedores.class));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return proveedor;
    }
}
