package Viernes;

import java.awt.BorderLayout;
import java.awt.Panel;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Alcides Blandon
 */
public class CCompMedios {

    public static void main(String[] args) {

        
        JFrame Ventana = new JFrame();
        Ventana.setSize(600, 200);
        Ventana.setLayout(new BorderLayout(10, 10));
        
        
        JPanel PA = new JPanel();
        PA.setLayout(new BorderLayout(10, 10));
        
        JTabbedPane tabbedPane = new JTabbedPane();
        
        JPanel panel1 = new JPanel();
        tabbedPane.addTab("Ficha 1", null, panel1, "Primera ficha");
        tabbedPane.setSelectedIndex(0);
        
        JLabel labelTitulo = new JLabel();
        labelTitulo.setText("Impresion del reporte");
        
        JButton boton = new JButton();
        boton.setText("Imprimir");
        panel1.add(labelTitulo);
        panel1.add(boton);
        
        JPanel panel2 = new JPanel();
        tabbedPane.addTab("Ficha 2", null, panel2, "Segunda Ficha");
        
        JScrollPane spTexto = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
        ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        JTextArea taDescripcion = new JTextArea();
        taDescripcion.setColumns(10);
        taDescripcion.setRows(5);
        
        
        panel2.add(taDescripcion);
        spTexto.setViewportView(taDescripcion); 
        panel2.add(spTexto);
        
        JPanel panel3 = new JPanel();
        tabbedPane.addTab("Ficha 3", null, panel3, "Tercera Ficha");
        JPasswordField clave = new JPasswordField("Contraseña");
        clave.setSize(111, 20);
        
        
        try {
            MaskFormatter mascara = new MaskFormatter("##-##-####");
            JFormattedTextField fecha = new JFormattedTextField(mascara);
            fecha.setSize(120, 20);
            panel3.add(fecha);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        panel3.add(clave);
        
        JPanel PAb = new JPanel();
        PAb.setLayout(new BorderLayout(10, 10));
        
        JToolBar toolBar = new JToolBar();
        toolBar.setRollover(true);
        JLabel LblSistema = new JLabel();
        
        LblSistema.setText("Sistema de Gestion");
        toolBar.add(LblSistema);
        
        PA.add(tabbedPane);
        PAb.add(toolBar);
        
        Ventana.add(PA, BorderLayout.NORTH);
        Ventana.add(PAb, BorderLayout.SOUTH);
        Ventana.setVisible(true);
        Ventana.setResizable(false);
        
    }

}
