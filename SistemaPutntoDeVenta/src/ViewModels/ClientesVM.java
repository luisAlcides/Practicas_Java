package ViewModels;

import Conexion.Consult;
import Library.*;
import Models.TClientes;
import Models.TReportes_Clientes;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

/**
 *
 * @author Alcides Blandon
 */
public class ClientesVM extends Consult {

    private String accion = "insert", mony;
    private final ArrayList<JLabel> label;
    private final ArrayList<JTextField> textField;
    private final JCheckBox checkBoxCredito;
    private final JTable tableCliente, tableReporte;
    private DefaultTableModel modelo1, modelo2;
    private JSpinner spinnerPaginas;
    private int idCliente = 0;
    private int regPorPagina = 10;
    private int numPagina = 1;
    public int seccion;
    private final FormatDecimal format;
    private Paginador<TClientes> paginadorClientes;
    private Paginador<TClientes> paginadorReportes;

    public ClientesVM(Object[] objects, ArrayList<JLabel> label, ArrayList<JTextField> textField) {
        this.label = label;
        this.textField = textField;
        this.checkBoxCredito = (JCheckBox) objects[0];
        this.tableCliente = (JTable) objects[1];
        this.spinnerPaginas = (JSpinner) objects[2];
        this.tableReporte = (JTable) objects[3];
        this.format = new FormatDecimal();
        this.mony = ConfiguracionesVM.moneda;
        restablecer();
        restablecerReport();
    }

//<editor-fold defaultstate="collapsed" desc="CODIGO DE REGISTAR CLIENTE">
    public void registrarCliente() {
        if (textField.get(0).getText().equals("")) {
            label.get(0).setText("Ingrese el ID");
            label.get(0).setForeground(Color.red);
            textField.get(0).requestFocus();
        } else {
            if (textField.get(1).getText().equals("")) {
                label.get(1).setText("Ingrese el Nombre");
                label.get(1).setForeground(Color.red);
                textField.get(1).requestFocus();
            } else {
                if (textField.get(2).getText().equals("")) {
                    label.get(2).setText("Ingrese el Apellido");
                    label.get(2).setForeground(Color.red);
                    textField.get(2).requestFocus();
                } else {
                    if (textField.get(3).getText().equals("")) {
                        label.get(3).setText("Ingrese el Email");
                        label.get(3).setForeground(Color.red);
                        textField.get(3).requestFocus();

                    } else {
                        if (!Objetos.eventos.isEmail(textField.get(3).getText())) {
                            label.get(3).setText("Ingrese un Email valido");
                            label.get(3).setForeground(Color.red);
                            textField.get(3).requestFocus();
                        } else {
                            if (textField.get(4).getText().equals("")) {
                                label.get(4).setText("Ingrese el Telefono");
                                label.get(4).setForeground(Color.red);
                                textField.get(4).requestFocus();
                            } else {
                                if (textField.get(5).getText().equals("")) {
                                    label.get(5).setText("Ingrese la Direccion");
                                    label.get(5).setForeground(Color.red);
                                    textField.get(5).requestFocus();
                                } else {
                                    int count;
                                    List<TClientes> listEmail = clientes().stream()
                                            .filter(u -> u.getEmail().equals(textField.get(3).getText()))
                                            .collect(Collectors.toList());
                                    count = listEmail.size();

                                    List<TClientes> listNid = clientes().stream()
                                            .filter(u -> u.getNid().equals(textField.get(0).getText()))
                                            .collect(Collectors.toList());
                                    count += listNid.size();
                                    System.out.println(count);

                                    try {
                                        switch (accion) {
                                            case "insert":
                                                System.out.println("HOla");
                                                if (count == 0) {
                                                    System.out.println("Entro al ifs");
                                                    guardarDatos();
                                                } else {
                                                    if (!listEmail.isEmpty()) {
                                                        label.get(3).setText("El email ya esta registrado");
                                                        label.get(3).setForeground(Color.red);
                                                        textField.get(3).requestFocus();
                                                    }

                                                    if (!listNid.isEmpty()) {
                                                        label.get(0).setText("El Nid ya esta registrado");
                                                        label.get(0).setForeground(Color.red);
                                                        textField.get(0).requestFocus();
                                                    }
                                                }

                                                break;

                                            case "update":
                                                if (count == 2) {
                                                    if (listEmail.get(0).getId() == idCliente
                                                            && listNid.get(0).getId() == idCliente) {
                                                        guardarDatos();
                                                    } else {
                                                        if (listNid.get(0).getId() != idCliente) {
                                                            label.get(count).setText("El Nid ya esta registrado");
                                                            label.get(0).setForeground(Color.red);
                                                            textField.get(0).requestFocus();
                                                        }
                                                        if (listEmail.get(0).getId() != idCliente) {
                                                            label.get(3).setText("El email ya esta registrado");
                                                            label.get(3).setForeground(Color.red);
                                                            textField.get(3).requestFocus();
                                                        }
                                                    }
                                                } else {
                                                    if (count == 0) {
                                                        guardarDatos();
                                                    } else {
                                                        if (!listNid.isEmpty()) {
                                                            if (listNid.get(0).getId() == idCliente) {
                                                                guardarDatos();
                                                            } else {
                                                                label.get(0).setText("El Nid ya esta registrado");
                                                                label.get(0).setForeground(Color.red);
                                                                textField.get(0).requestFocus();
                                                            }
                                                        }
                                                        if (!listEmail.isEmpty()) {
                                                            if (listEmail.get(0).getId() == idCliente) {
                                                                guardarDatos();
                                                            } else {
                                                                label.get(3).setText("El email ya esta registrado");
                                                                label.get(3).setForeground(Color.red);
                                                                textField.get(3).requestFocus();
                                                            }
                                                        }
                                                    }
                                                }
                                                break;
                                        }

                                    } catch (SQLException e) {
                                        JOptionPane.showMessageDialog(null, e);

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void guardarDatos() throws SQLException {
        try {
            final QueryRunner qr = new QueryRunner(true);
            getConn().setAutoCommit(false);
            byte[] image = Uploadimage.getImageByte();
            if (image == null) {
                image = Objetos.uploadimage.getTransFoto(label.get(6));
            }

            switch (accion) {
                case "insert":
                    String sqlClienteGuardar = "INSERT INTO tclientes(Nid, nombre, apellido, email,"
                            + "telefono,direccion,credito,fecha,imagen) VALUES(?,?,?,?,?,?,?,?,?)";

                    Object[] dataClienteGuardar = {
                        textField.get(0).getText(),
                        textField.get(1).getText(),
                        textField.get(2).getText(),
                        textField.get(3).getText(),
                        textField.get(4).getText(),
                        textField.get(5).getText(),
                        checkBoxCredito.isSelected(),
                        new Calendario().getFECHA(),
                        image
                    };
                    qr.insert(getConn(), sqlClienteGuardar, new ColumnListHandler(), dataClienteGuardar);
                    String sqlReport = "INSERT INTO treportes_clientes(deuda,mensual,cambio,"
                            + "deudaActual,fechaDeuda,ultimoPago,fechaPago,ticket,fechaLimite,idCliente)"
                            + "VALUES(?,?,?,?,?,?,?,?,?,?)";
                    List<TClientes> cliente = clientes();
                    Object[] dataReport = {
                        0,
                        0,
                        0,
                        0,
                        "--/--/--",
                        0,
                        "--/--/--",
                        "0000000000",
                        "--/--/--",
                        cliente.get(cliente.size() - 1).getId()
                    };
                    qr.insert(getConn(), sqlReport, new ColumnListHandler(), dataReport);
                    String sqlReportInteres = "INSERT INTO treportes_intereses_cliente "
                            + "(intereses,pago,cambio,cuotas,interesFecha,ticketIntereses,"
                            + "idCliente) VALUES(?,?,?,?,?,?,?)";

                    Object[] dataReportIntere = {
                        0,
                        0,
                        0,
                        0,
                        "--/--/--",
                        "0000000000",
                        cliente.get(cliente.size() - 1).getId()
                    };
                    qr.insert(getConn(), sqlReportInteres, new ColumnListHandler(), dataReportIntere);

                    break;

                case "update":
                    Object[] dataClienteUpdate = {
                        textField.get(0).getText(),
                        textField.get(1).getText(),
                        textField.get(2).getText(),
                        textField.get(3).getText(),
                        textField.get(4).getText(),
                        textField.get(5).getText(),
                        checkBoxCredito.isSelected(),
                        image
                    };

                    String sqlClienteUpdate = "UPDATE tclientes SET Nid =?, nombre=?, apellido=?, email=?,"
                            + "telefono=?, direccion=?, credito=?, imagen=? WHERE id =" + idCliente;
                    qr.update(getConn(), sqlClienteUpdate, dataClienteUpdate);
                    break;
            }

            getConn().commit();
            restablecer();

        } catch (SQLException e) {
            getConn().rollback();
            JOptionPane.showMessageDialog(null, e);
        }
    }


    public void buscarClientes(String campo) {
    List<TClientes> clienteFiltro;
        String[] titulos = {"ID", "Nid", "Nombre", "Apellido", "Email", "Direccion", "Telefono", "Credito", "Imagen"};
        modelo1 = new DefaultTableModel(null, titulos);
        int inicio = (numPagina - 1) * regPorPagina;
        if (campo.equals("")) {
            clienteFiltro = clientes().stream()
                    .skip(inicio).limit(regPorPagina)
                    .collect(Collectors.toList());
        } else {
            clienteFiltro = clientes().stream()
                    .filter(C -> C.getNid().startsWith(campo) || C.getNombre().startsWith(campo)
                    || C.getApellido().startsWith(campo))
                    .skip(inicio).limit(regPorPagina)
                    .collect(Collectors.toList());
        }

        if (!clienteFiltro.isEmpty()) {
            clienteFiltro.forEach(item -> {
                Object[] registros = {
                    item.getId(),
                    item.getNid(),
                    item.getNombre(),
                    item.getApellido(),
                    item.getEmail(),
                    item.getDireccion(),
                    item.getTelefono(),
                    item.isCredito(),
                    item.getImagen()

                };
                modelo1.addRow(registros);
            });
        }
        tableCliente.setModel(modelo1);
        tableCliente.setRowHeight(30);
        tableCliente.getColumnModel().getColumn(0).setMaxWidth(0);
        tableCliente.getColumnModel().getColumn(0).setMinWidth(0);
        tableCliente.getColumnModel().getColumn(0).setPreferredWidth(0);
        tableCliente.getColumnModel().getColumn(8).setMaxWidth(0);
        tableCliente.getColumnModel().getColumn(8).setMinWidth(0);
        tableCliente.getColumnModel().getColumn(8).setPreferredWidth(0);
        tableCliente.getColumnModel().getColumn(7).setCellRenderer(new RenderCheckBox());

    }

    public void obtenerCliente() {
        accion = "update";
        int filas = tableCliente.getSelectedRow();
        idCliente = (Integer) modelo1.getValueAt(filas, 0);
        textField.get(0).setText((String) modelo1.getValueAt(filas, 1));
        textField.get(1).setText((String) modelo1.getValueAt(filas, 2));
        textField.get(2).setText((String) modelo1.getValueAt(filas, 3));
        textField.get(3).setText((String) modelo1.getValueAt(filas, 4));
        textField.get(4).setText((String) modelo1.getValueAt(filas, 5));
        textField.get(5).setText((String) modelo1.getValueAt(filas, 6));
        checkBoxCredito.setSelected((Boolean) modelo1.getValueAt(filas, 7));
        Objetos.uploadimage.byteImage(label.get(6), (byte[]) modelo1.getValueAt(filas, 8));

    }

    public final void restablecer() {
        seccion = 1;
        accion = "insert";
        textField.get(0).setText("");
        textField.get(1).setText("");
        textField.get(2).setText("");
        textField.get(3).setText("");
        textField.get(4).setText("");
        textField.get(5).setText("");
        checkBoxCredito.setSelected(false);
        checkBoxCredito.setForeground(new Color(102, 102, 102));
        label.get(0).setText("Nid");
        label.get(0).setForeground(new Color(102, 102, 102));
        label.get(1).setText("Nombre");
        label.get(1).setForeground(new Color(102, 102, 102));
        label.get(2).setText("Apellido");
        label.get(2).setForeground(new Color(102, 102, 102));
        label.get(3).setText("Email");
        label.get(3).setForeground(new Color(102, 102, 102));
        label.get(4).setText("Telefono");
        label.get(4).setForeground(new Color(102, 102, 102));
        label.get(5).setText("Direccion");
        label.get(5).setForeground(new Color(102, 102, 102));
        label.get(6).setIcon(new ImageIcon(getClass().getClassLoader()
                .getResource("Resources/icons8-add-user-male-skin-type-7-48.png")));

        listClientes = clientes();
        if (!listClientes.isEmpty()) {
            paginadorClientes = new Paginador<TClientes>(listClientes, label.get(7), regPorPagina);
        }

        SpinnerNumberModel model = new SpinnerNumberModel(
                new Integer(10), //Dato visualizado al inicio de el spinner
                new Integer(1), //Limite Inferior
                new Integer(100), //Limite Superior
                new Integer(1) //Incremento decremento
        );

        spinnerPaginas.setModel(model);

        buscarClientes("");

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CODIGO DE PAgos Y REPORTE">
    public void buscarReportes(String valor) {
        List<TClientes> clienteFiltro;
        String[] titulos = {"ID", "Nid", "Nombre", "Apellido", "Email", "Direccion", "Telefono"};
        modelo2 = new DefaultTableModel(null, titulos);
        int inicio = (numPagina - 1) * regPorPagina;
        if (valor.equals("")) {
            clienteFiltro = clientes().stream()
                    .skip(inicio).limit(regPorPagina)
                    .collect(Collectors.toList());
        } else {
            clienteFiltro = clientes().stream()
                    .filter(C -> C.getNid().startsWith(valor) || C.getNombre().startsWith(valor)
                    || C.getApellido().startsWith(valor))
                    .skip(inicio).limit(regPorPagina)
                    .collect(Collectors.toList());
        }

        if (!clienteFiltro.isEmpty()) {
            clienteFiltro.forEach(item -> {
                Object[] registros = {
                    item.getId(),
                    item.getNid(),
                    item.getNombre(),
                    item.getApellido(),
                    item.getEmail(),
                    item.getDireccion(),
                    item.getTelefono()
                };
                modelo2.addRow(registros);
            });
        }
        tableReporte.setModel(modelo2);
        tableReporte.setRowHeight(30);
        tableReporte.getColumnModel().getColumn(0).setMaxWidth(0);
        tableReporte.getColumnModel().getColumn(0).setMinWidth(0);
        tableReporte.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    public void obtenerReporteCliente() {
        int filas = tableReporte.getSelectedRow();
        int idCliente = (Integer) modelo2.getValueAt(filas, 0);
        List<TReportes_Clientes> clienteFiltro = reportesClientes(idCliente);
        if (!clienteFiltro.isEmpty()) {
            TReportes_Clientes cliente = clienteFiltro.get(0);
            label.get(8).setText(cliente.getNombre() + " " + cliente.getApellido());
            label.get(9).setText(mony + format.decimal((Double) cliente.getDeudaActual()));
            label.get(10).setText(mony + format.decimal((Double) cliente.getUltimoPago()));
            label.get(11).setText(cliente.getTicket());
            label.get(12).setText(cliente.getFechaPago());
            label.get(13).setText(mony + format.decimal((Double) cliente.getMensual()));
        }

    }

    public final void restablecerReport() {
        listClientesReportes = clientes();
        if (!listClientesReportes.isEmpty()) {
            paginadorReportes = new Paginador<>(listClientesReportes,
                    label.get(7), regPorPagina);
        }

        buscarReportes("");

    }

    //</editor-fold>
    private List<TClientes> listClientes;
    private List<TClientes> listClientesReportes;
    private List<TReportes_Clientes> listReportes;

    public void paginador(String metodo) {
        switch (metodo) {
            case "Primero":
                switch (seccion) {
                    case 1:
                        if (!listClientes.isEmpty()) {
                            numPagina = paginadorClientes.primero();
                        }
                        break;
                    case 2:
                        if (!listClientesReportes.isEmpty()) {
                            numPagina = paginadorReportes.primero();
                        }
                        break;

                }
            case "Anterior":
                switch (seccion) {
                    case 1:
                        if (!listClientes.isEmpty()) {
                            numPagina = paginadorClientes.anterior();
                        }
                        break;

                    case 2:
                        if (!listClientesReportes.isEmpty()) {
                            numPagina = paginadorClientes.anterior();
                        }
                        break;
                }
                break;
            case "Siguiente":
                switch (seccion) {
                    case 1:
                        if (!listClientes.isEmpty()) {
                            numPagina = paginadorClientes.siguiente();
                        }
                        break;
                    case 2:
                        if (!listClientesReportes.isEmpty()) {
                            numPagina = paginadorClientes.siguiente();
                        }
                        break;
                }
                break;
            case "Ultimo":
                switch (seccion) {
                    case 1:
                        if (!listClientes.isEmpty()) {
                            numPagina = paginadorClientes.ultimo();
                        }
                        break;
                    case 2:
                        if (!listClientesReportes.isEmpty()) {
                            numPagina = paginadorClientes.ultimo();
                        }
                        break;
                }
                break;
        }

        switch (seccion) {
            case 1:
                buscarClientes("");
                break;
            case 2:
                buscarReportes("");
        }

    }

    public void registroPaginas() {
        numPagina = 1;
        Number caja = (Number) spinnerPaginas.getValue();
        regPorPagina = caja.intValue();
        switch (seccion) {
            case 1:
                if (!listClientes.isEmpty()) {
                    paginadorClientes = new Paginador<>(listClientes, label.get(7), regPorPagina);
                }
                buscarClientes("");
                break;
            case 2:
                if (!listClientesReportes.isEmpty()) {
                    paginadorReportes = new Paginador<>(listClientesReportes, label.get(7), regPorPagina);
                }
                buscarReportes("");
                break;
        }
    }
}
