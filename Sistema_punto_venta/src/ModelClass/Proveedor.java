package ModelClass;

import Connection.Consult;
import Model.Proveedores;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alcides Blandon
 */
public class Proveedor extends Consult {

    private DefaultTableModel modelo, modelo2;
    private List<Proveedores> proveedor, proveedor1, proveedor2, proveedorFilter;
    private String sql;
    private Object[] object;

    public List<Proveedores> insertProveedor(String Proveedor, String Email, String Telefono) {
        proveedor1 = proveedores().stream()
                .filter(P -> P.getTelefono().equals(Telefono) || P.getEmail().equals(Email))
                .collect(Collectors.toList());

        if (0 == proveedor1.size()) {
            sql = "INSERT INTO proveedores(Proveedor,Telefono,Email)"
                    + "VALUES(?,?,?)";

            object = new Object[]{Proveedor, Telefono, Email};
            insert(sql, object);
            sql = "INSERT INTO reportes_proveedores(IdProveedor, SaldoActual, FechaActual"
                    + "UltimoPago, FechaPago) VALUES(?,?,?,?,?)";
            proveedor = proveedores();
            int pos = proveedor.size();
            pos--;
            int idProveedor = proveedor.get(pos).getIdProveedor();
            object = new Object[]{idProveedor, "$0.00", "Sin fecha", "$0.00", "Sin fecha"};
            insert(sql, object);

        }
        return proveedor1;
    }

    public List<Proveedores> getProveedores() {
        return proveedores();
    }
    
    public void searchProveedores(JTable table, String campo, int num_registro, int reg_por_pagina){
        String[] registros = new String[4];
        String[] titulos = {"Id", "Proveedor", "Email", "Telefono"};
        modelo = new DefaultTableModel(null, titulos);
        proveedor = proveedores();
        if(campo.equals("")){
            proveedorFilter = proveedor.stream()
                    .skip(num_registro).limit(reg_por_pagina)
                    .collect(Collectors.toList());
        }else{
            proveedorFilter = proveedor.stream()
                    .filter(P -> P.getProveedor().startsWith(campo) || P.getEmail().startsWith(campo)
                    || P.getTelefono().startsWith(campo))
                    .skip(num_registro).limit(reg_por_pagina)
                    .collect(Collectors.toList());
        }
        
        proveedorFilter.forEach(item ->{
            registros[0] = String.valueOf(item.getIdProveedor());
            registros[1] = item.getProveedor();
            registros[2] = item.getEmail();
            registros[3] = item.getTelefono();
            modelo.addRow(registros);
        });
        
        table.setModel(modelo);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setMaxWidth(0);
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
}
