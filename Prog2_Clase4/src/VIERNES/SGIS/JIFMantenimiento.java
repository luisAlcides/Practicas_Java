/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIERNES.SGIS;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alcides Blandon
 */
public class JIFMantenimiento extends javax.swing.JInternalFrame {

    /**
     * Creates new form jIFMantenimiento
     */
    public JIFMantenimiento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPLabels = new javax.swing.JPanel();
        jPCodigo = new javax.swing.JPanel();
        jTFCodigo = new javax.swing.JTextField();
        jPEmpleado = new javax.swing.JPanel();
        jTFEmpleado = new javax.swing.JTextField();
        jPHoras = new javax.swing.JPanel();
        jTFHoras = new javax.swing.JTextField();
        jPTarifa = new javax.swing.JPanel();
        jTFTarifa = new javax.swing.JTextField();
        jBListar = new javax.swing.JButton();
        jPTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPBotones = new javax.swing.JPanel();
        jBConsultar = new javax.swing.JButton();
        jBRegistrar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jLbMantenimientoEmpleado = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();

        jPCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo"));
        jPCodigo.setToolTipText("hfbsf");

        javax.swing.GroupLayout jPCodigoLayout = new javax.swing.GroupLayout(jPCodigo);
        jPCodigo.setLayout(jPCodigoLayout);
        jPCodigoLayout.setHorizontalGroup(
            jPCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCodigoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPCodigoLayout.setVerticalGroup(
            jPCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCodigoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado"));

        javax.swing.GroupLayout jPEmpleadoLayout = new javax.swing.GroupLayout(jPEmpleado);
        jPEmpleado.setLayout(jPEmpleadoLayout);
        jPEmpleadoLayout.setHorizontalGroup(
            jPEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPEmpleadoLayout.setVerticalGroup(
            jPEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPEmpleadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTFEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPHoras.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas"));

        javax.swing.GroupLayout jPHorasLayout = new javax.swing.GroupLayout(jPHoras);
        jPHoras.setLayout(jPHorasLayout);
        jPHorasLayout.setHorizontalGroup(
            jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPHorasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFHoras)
                .addContainerGap())
        );
        jPHorasLayout.setVerticalGroup(
            jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPHorasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTFHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPTarifa.setBorder(javax.swing.BorderFactory.createTitledBorder("Tarifa"));

        javax.swing.GroupLayout jPTarifaLayout = new javax.swing.GroupLayout(jPTarifa);
        jPTarifa.setLayout(jPTarifaLayout);
        jPTarifaLayout.setHorizontalGroup(
            jPTarifaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTarifaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFTarifa, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPTarifaLayout.setVerticalGroup(
            jPTarifaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTarifaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTFTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jBListar.setText("Listar");

        javax.swing.GroupLayout jPLabelsLayout = new javax.swing.GroupLayout(jPLabels);
        jPLabels.setLayout(jPLabelsLayout);
        jPLabelsLayout.setHorizontalGroup(
            jPLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLabelsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPHoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPLabelsLayout.createSequentialGroup()
                        .addComponent(jPTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(jBListar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPLabelsLayout.setVerticalGroup(
            jPLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLabelsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPLabelsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPHoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPTarifa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPLabelsLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jBListar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Empleado", "Horas", "Tarifa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPTablaLayout = new javax.swing.GroupLayout(jPTabla);
        jPTabla.setLayout(jPTablaLayout);
        jPTablaLayout.setHorizontalGroup(
            jPTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );
        jPTablaLayout.setVerticalGroup(
            jPTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        jPBotones.setBorder(javax.swing.BorderFactory.createTitledBorder("Mantenimiento"));

        jBConsultar.setText("Consultar");
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });

        jBRegistrar.setText("Registar");
        jBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBotonesLayout = new javax.swing.GroupLayout(jPBotones);
        jPBotones.setLayout(jPBotonesLayout);
        jPBotonesLayout.setHorizontalGroup(
            jPBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotonesLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jBRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jBConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPBotonesLayout.setVerticalGroup(
            jPBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotonesLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConsultar)
                    .addComponent(jBEliminar)
                    .addComponent(jBRegistrar)
                    .addComponent(jBModificar))
                .addGap(22, 22, 22))
        );

        jLbMantenimientoEmpleado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLbMantenimientoEmpleado.setText("Mantenimiento Empleados");

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jPTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(201, 201, 201)
                            .addComponent(jLbMantenimientoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jPLabels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbMantenimientoEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPLabels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jPTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSalir)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();

        int a = jTable.getSelectedRow();

        if (a < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla");
        } else {
            int confirmar = JOptionPane.showConfirmDialog(null, "¿Eliminar Registro?");
            if (JOptionPane.OK_OPTION == confirmar) {
                model.removeRow(a);
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarActionPerformed
        // TODO add your handling code here:
        if (jTFCodigo.getText().equals("") && jTFEmpleado.getText().equals("")
                && jTFHoras.getText().equals("") && jTFTarifa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Correctamente \n"
                    + "Los campos con * son obligatorios", "Campos obligatorios", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();

            Object[] fila = new Object[4];
            fila[0] = jTFCodigo.getText();
            fila[1] = jTFEmpleado.getText();
            fila[2] = jTFHoras.getText();
            fila[3] = jTFTarifa.getText();

            modelo.addRow(fila);
            jTable.setModel(modelo);
            JOptionPane.showMessageDialog(null, "Registrado Correctamente");

            jTFCodigo.setText("");
            jTFEmpleado.setText("");
            jTFHoras.setText("");
            jTFTarifa.setText("");

        }

    }//GEN-LAST:event_jBRegistrarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();

        int a = jTable.getSelectedRow();

        if (a < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla");
        } else {
            int confirmar = JOptionPane.showConfirmDialog(null, "¿Modificar?");
            if (JOptionPane.OK_OPTION == confirmar) {              
                String menu =JOptionPane.showInputDialog("Elija la columna a modificar\n"
                        + "1. Codigo\n"
                        + "2. Empleado\n"
                        + "3. Horas\n"
                        + "4. Tarifa");
                switch (menu) {
                    case "1":
                            int codigoColumn = 0; 
                            String codigo = JOptionPane.showInputDialog("Nuevo Codigo");
                            model.setValueAt(codigo, a, codigoColumn);
                        break;
                    case "2":
                        int empleadoColumn = 1; 
                            String empleado = JOptionPane.showInputDialog("Nuevo Empleado");
                            model.setValueAt(empleado, a, empleadoColumn);
                            break;
                    case "3":
                        int horasColumn = 2; 
                            String horas = JOptionPane.showInputDialog("Nueva Hora");
                            model.setValueAt(horas, a, horasColumn);
                            break;
                    case "4":
                        int tarifaColumn = 3; 
                            String tarifa = JOptionPane.showInputDialog("Nueva Tarifa");
                            model.setValueAt(tarifa, a, tarifaColumn);
                            break;

                    default:
                        JOptionPane.showMessageDialog(null, "No entiendo que quieres decir","Algo no esta bien", JOptionPane.ERROR_MESSAGE);
                        break;
                }
                
                JOptionPane.showMessageDialog(null, "Registro Modificado");
            }
        }
        
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed
         
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        
         int a = jTable.getSelectedRow();

        if (a < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla");
        } else {
//            String[] datos = new String[3];
//            for (int i = 0; i <= 3; i++) {
//                datos[i]= (String)model.getColumnName(i);
//                
//            }
             
            JOptionPane.showMessageDialog(null,
                    model.getColumnName(0) + ": "+ model.getValueAt(a, 0)+"\n"+
                    model.getColumnName(1) + ": "+ model.getValueAt(a, 1)+"\n"+
                    model.getColumnName(2) + ": "+ model.getValueAt(a, 2)+"\n"+
                    model.getColumnName(3) + ": "+ model.getValueAt(a, 3)+"\n");
        
        }
    }//GEN-LAST:event_jBConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBListar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLbMantenimientoEmpleado;
    private javax.swing.JPanel jPBotones;
    private javax.swing.JPanel jPCodigo;
    private javax.swing.JPanel jPEmpleado;
    private javax.swing.JPanel jPHoras;
    private javax.swing.JPanel jPLabels;
    private javax.swing.JPanel jPTabla;
    private javax.swing.JPanel jPTarifa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFEmpleado;
    private javax.swing.JTextField jTFHoras;
    private javax.swing.JTextField jTFTarifa;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
