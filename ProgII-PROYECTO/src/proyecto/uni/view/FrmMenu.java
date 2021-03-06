/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.uni.view;

/**
 *
 * @author pc
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Esquina1 = new javax.swing.JLabel();
        Esquina2 = new javax.swing.JLabel();
        Esquina3 = new javax.swing.JLabel();
        Esquina4 = new javax.swing.JLabel();
        BtnSimple = new javax.swing.JButton();
        BtnCompuesto = new javax.swing.JButton();
        BtnTasas = new javax.swing.JButton();
        BtnAtyuda = new javax.swing.JButton();
        LblSimple = new javax.swing.JLabel();
        LblCompuesto = new javax.swing.JLabel();
        LblTasas = new javax.swing.JLabel();
        LblAyuda = new javax.swing.JLabel();
        LblPresente = new javax.swing.JLabel();
        BtnVPresente = new javax.swing.JButton();
        LblFuturo = new javax.swing.JLabel();
        BtnVFuturo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(57, 62, 70));

        Titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 173, 181));
        Titulo.setText("Sistema de cálculos económicos.");

        Esquina1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/esquina.png"))); // NOI18N

        Esquina2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/esquina2.png"))); // NOI18N

        Esquina3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/esquina3.png"))); // NOI18N

        Esquina4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/esquina4.png"))); // NOI18N

        BtnSimple.setBackground(new java.awt.Color(255, 255, 255));
        BtnSimple.setForeground(new java.awt.Color(0, 0, 0));
        BtnSimple.setText("Interes Simple");
        BtnSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpleActionPerformed(evt);
            }
        });

        BtnCompuesto.setBackground(new java.awt.Color(255, 255, 255));
        BtnCompuesto.setForeground(new java.awt.Color(0, 0, 0));
        BtnCompuesto.setText("Interes Compuesto");
        BtnCompuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCompuestoActionPerformed(evt);
            }
        });

        BtnTasas.setBackground(new java.awt.Color(255, 255, 255));
        BtnTasas.setForeground(new java.awt.Color(0, 0, 0));
        BtnTasas.setText("Tasas");
        BtnTasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTasasActionPerformed(evt);
            }
        });

        BtnAtyuda.setBackground(new java.awt.Color(255, 255, 255));
        BtnAtyuda.setForeground(new java.awt.Color(0, 0, 0));
        BtnAtyuda.setText("Ayuda");
        BtnAtyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtyudaActionPerformed(evt);
            }
        });

        LblSimple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interes.png"))); // NOI18N

        LblCompuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tasa-de-interes.png"))); // NOI18N

        LblTasas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tasa-de-interes (1).png"))); // NOI18N

        LblAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ayudar.png"))); // NOI18N

        LblPresente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/presentacion.png"))); // NOI18N

        BtnVPresente.setBackground(new java.awt.Color(255, 255, 255));
        BtnVPresente.setForeground(new java.awt.Color(0, 0, 0));
        BtnVPresente.setText("Valor Presente");
        BtnVPresente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVPresenteActionPerformed(evt);
            }
        });

        LblFuturo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/futuro.png"))); // NOI18N

        BtnVFuturo.setBackground(new java.awt.Color(255, 255, 255));
        BtnVFuturo.setForeground(new java.awt.Color(0, 0, 0));
        BtnVFuturo.setText("Valor Futuro");
        BtnVFuturo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVFuturoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Esquina4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Esquina1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(Titulo)
                                .addGap(272, 272, 272))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(LblSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(BtnSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39))
                                            .addComponent(LblPresente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(BtnVPresente)))
                                .addGap(89, 89, 89)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnCompuesto)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(BtnVFuturo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LblFuturo)))
                                        .addGap(78, 78, 78)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(BtnTasas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LblAyuda)
                                            .addComponent(BtnAtyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(LblCompuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                        .addComponent(LblTasas, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Esquina3)
                                            .addComponent(Esquina2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Titulo)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LblCompuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblTasas))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnTasas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BtnCompuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtnSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(LblSimple)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Esquina2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Esquina1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblAyuda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblFuturo)
                            .addComponent(LblPresente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Esquina4)
                                .addGap(30, 30, 30))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Esquina3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnVPresente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnVFuturo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAtyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpleActionPerformed
              dispose();
        IntSimple h = new IntSimple();
        h.setVisible(true);
    }//GEN-LAST:event_BtnSimpleActionPerformed

    private void BtnCompuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCompuestoActionPerformed
        dispose();
        IntCompuesto h = new IntCompuesto();
        h.setVisible(true);
    }//GEN-LAST:event_BtnCompuestoActionPerformed

    private void BtnTasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTasasActionPerformed
        dispose();
        ConvTasa t = new ConvTasa();
        t.setVisible(true);

    }//GEN-LAST:event_BtnTasasActionPerformed

    private void BtnAtyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtyudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAtyudaActionPerformed

    private void BtnVPresenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVPresenteActionPerformed
        dispose();
        ValorPresente h = new ValorPresente();
        h.setVisible(true);
    }//GEN-LAST:event_BtnVPresenteActionPerformed

    private void BtnVFuturoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVFuturoActionPerformed
        dispose();
        ValorFuturo h = new ValorFuturo();
        h.setVisible(true);
    }//GEN-LAST:event_BtnVFuturoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtyuda;
    private javax.swing.JButton BtnCompuesto;
    private javax.swing.JButton BtnSimple;
    private javax.swing.JButton BtnTasas;
    private javax.swing.JButton BtnVFuturo;
    private javax.swing.JButton BtnVPresente;
    private javax.swing.JLabel Esquina1;
    private javax.swing.JLabel Esquina2;
    private javax.swing.JLabel Esquina3;
    private javax.swing.JLabel Esquina4;
    private javax.swing.JLabel LblAyuda;
    private javax.swing.JLabel LblCompuesto;
    private javax.swing.JLabel LblFuturo;
    private javax.swing.JLabel LblPresente;
    private javax.swing.JLabel LblSimple;
    private javax.swing.JLabel LblTasas;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
