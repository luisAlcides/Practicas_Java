package ModelClass;

import Connection.Consult;
import Model.Clientes;
import Model.Reportes_Clientes;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alcides Blandon
 */
public class Cliente extends Consult implements Printable {

    private DefaultTableModel modelo, modelo2;
    private List<Clientes> cliente, clienteFilter;
    private int IdCliente;
    private String Id;
    private String sql;
    private Object[] obect;
    private JPanel panel;

    public boolean insertCliente(String ID, String Nombre, String Apellido, String Direccion, String Telefono) {

        boolean valor = false;
        cliente = clientes();
        clienteFilter = cliente.stream()
                .filter(c -> c.getID().equals(ID))
                .collect(Collectors.toList());
        if (0 == clienteFilter.size()) {

            sql = "INSERT INTO clientes(ID,Nombre,Apellido,Direccion,Telefono)"
                    + "VALUES(?,?,?,?,?)";
            obect = new Object[]{ID, Nombre, Apellido, Direccion, Telefono};
            insert(sql, obect);
            cliente = clientes();
            cliente.forEach(item -> {
                IdCliente = item.getIdCliente();
                Id = item.getID();
            });
            sql = "INSERT INTO reportes_clientes(IdCliente,SaldoActual,FechaActual,"
                    + "UltimoPago,FechaPago,ID)"
                    + "VALUES(?,?,?,?,?,?)";
            obect = new Object[]{IdCliente, "$0.00", "Sin fecha", "$0.00", "Sin fecha", Id};
            insert(sql, obect);
            valor = true;
        }
        return valor;
    }

    public List<Clientes> getClientes() {
        return clientes();
    }

    public void searchCliente(JTable table, String campo, int num_registro, int reg_por_pagina) {
        String[] registros = new String[6];
        String[] titulos = {"Id", "ID", "Nombre", "Apellido", "Direccion", "Telefono"};
        modelo = new DefaultTableModel(null, titulos);
        cliente = clientes();
        if (campo.equals("")) {
            clienteFilter = cliente.stream()
                    .skip(num_registro).limit(reg_por_pagina)
                    .collect(Collectors.toList());
        } else {
            clienteFilter = cliente.stream()
                    .filter(C -> C.getID().startsWith(campo) || C.getNombre().startsWith(campo)
                    || C.getApellido().startsWith(campo))
                    .skip(num_registro).limit(reg_por_pagina)
                    .collect(Collectors.toList());
        }
        clienteFilter.forEach(item -> {
            registros[0] = String.valueOf(item.getIdCliente());
            registros[1] = item.getID();
            registros[2] = item.getNombre();
            registros[3] = item.getApellido();
            registros[4] = item.getDireccion();
            registros[5] = item.getTelefono();
            modelo.addRow(registros);

        });
        table.setModel(modelo);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setMaxWidth(0);
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getColumnModel().getColumn(0).setPreferredWidth(0);

    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public DefaultTableModel reportesClientes(JTable table, int idCliente) {
        String[] registros = new String[7];
        String[] titulos = {"Id", "Nombre", "Apellido", "Saldo Actual", "Fecha Actual", "Ultimo Pago", "Fecha Pago"};
        modelo2 = new DefaultTableModel(null, titulos);
        List<Reportes_Clientes> reportes = reportesClientes(idCliente);
        reportes.forEach(item -> {
            registros[0] = String.valueOf(item.getIdRegistro());
            registros[1] = item.getNombre();
            registros[2] = item.getApellido();
            registros[3] = item.getSaldoActual();
            registros[4] = item.getFechaActual();
            registros[5] = item.getUltimoPago();
            registros[6] = item.getFechaPago();
            modelo2.addRow(registros);
        });
        table.setModel(modelo2);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setMaxWidth(0);
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getColumnModel().getColumn(0).setPreferredWidth(0);

        return modelo2;
    }

    public boolean updateCliente(String id, String nombre, String apellido, String direccion, String telefono, int idCliente) {
        boolean valor = false;

        cliente = clientes();
        clienteFilter = cliente.stream()
                .filter(c -> c.getID().equals(id))
                .collect(Collectors.toList());
        int count = clienteFilter.size();
        clienteFilter = cliente.stream()
                .filter(c -> c.getIdCliente() == idCliente)
                .collect(Collectors.toList());
        if (0 == count || id.equals(clienteFilter.get(0).getID())) {

            sql = "UPDATE clientes SET ID = ?,Nombre = ?,Apellido = ?,"
                    + "Direccion = ?,Telefono = ? WHERE IdCliente =" + idCliente;
            Object[] cliente = new Object[]{id, nombre, apellido, direccion, telefono};
            update(sql, cliente);
            List<Reportes_Clientes> reportes = reportesClientes(idCliente);
            int idRegistro = reportes.get(0).getIdRegistro();
            int IdCliente = reportes.get(0).getIdCliente();
            String SaldoActual = reportes.get(0).getSaldoActual();
            String FechaActual = reportes.get(0).getFechaActual();
            String UltimoPago = reportes.get(0).getUltimoPago();
            String FechaPago = reportes.get(0).getFechaPago();
            String ID = id;
            sql = "UPDATE reportes_clientes SET IdCliente = ?,SaldoActual = ?,FechaActual = ?"
                    + ",UltimoPago = ?,FechaPago = ? ,ID = ? WHERE IdRegistro =" + idRegistro;
            Object[] reporte = new Object[]{IdCliente, SaldoActual, FechaActual, UltimoPago, FechaPago, ID};
            update(sql, reporte);
            valor = true;
        }
        return valor;
    }

    public void deleteCliente(int idCliente, int idRegistro) {
        sql = "DELETE FROM reportes_clientes WHERE IdRegistro LIKE ?";
        delete(sql, idRegistro);
        sql = "DELETE FROM clientes WHERE IdCliente LIKE ?";
        delete(sql, idCliente);
    }

    public void updateReportes(String saldoActual, String fecha, String pago, int idCliente) {
        List<Reportes_Clientes> resportes = reportesClientes(idCliente);
        int idRegistro = resportes.get(0).getIdRegistro();
        int IdCliente = resportes.get(0).getIdCliente();
        String ID = resportes.get(0).getID();
        sql = "UPDATE reportes_clientes SET IdCliente = ?,SaldoActual = ?,FechaActual = ?"
                + ",UltimoPago = ?,FechaPago = ? ,ID = ? WHERE IdRegistro =" + idRegistro;
        Object[] reporte = new Object[]{IdCliente, "$" + saldoActual, fecha, "$" + pago, fecha, ID};
        update(sql, reporte);
    }

    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) {
        if (pageIndex == 0) {
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            g2d.scale(0.70, 0.70); // Reduccion de la impresion al 70%
            this.panel.printAll(graphics);
            return PAGE_EXISTS;
        } else {
            return NO_SUCH_PAGE;
        }
    }

    public void imprimirRecibo(JPanel panel) {
        this.panel = panel;
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        // Se pasa la instancia del JFrame al PrinterJob
        printerJob.setPrintable(this);
        //Muestra ventana de dialogo para imprimir
        if (printerJob.printDialog()) {
            try {
                printerJob.print();
            } catch (PrinterException e) {
                JOptionPane.showMessageDialog(null, "Error Cliente.imprimirRecibo: " + e);
            }
        }
    }

}
