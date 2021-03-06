package CP;

import java.awt.Color;
import javax.swing.*;

public class Interfaz {

    public static void main(String[] args) {

        JFrame jfrmPrincipal = new JFrame();
        jfrmPrincipal.setTitle("Secretaria de Movilidad y Trasporte");
        jfrmPrincipal.setSize(800, 700);
        jfrmPrincipal.setLocationRelativeTo(null);
        jfrmPrincipal.setLayout(null);
        jfrmPrincipal.setResizable(false);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setSize(800, 180);
        panelPrincipal.setLayout(null);

        JPanel panelTerciario = new JPanel();
        panelTerciario.setBounds(0, 330, 400, 220);
        panelTerciario.setLayout(null);
        panelTerciario.setBackground(Color.pink);

        JPanel panelCuarto = new JPanel();
        panelCuarto.setBounds(350, 330, 450, 110);
        panelCuarto.setLayout(null);
        panelCuarto.setBackground(Color.orange);

        JPanel panelQuinto = new JPanel();
        panelQuinto.setBounds(350, 430, 450, 120);
        panelQuinto.setLayout(null);
        panelQuinto.setBackground(Color.green);

        JPanel panelSexto = new JPanel();
        panelSexto.setBounds(0, 550, 800, 120);
        panelSexto.setLayout(null);
        panelSexto.setBackground(Color.blue);

        //JPanel Principal
//        JSeparator separadorVertical = new JSeparator();
//        separadorVertical.setOrientation(javax.swing.SwingConstants.VERTICAL);
//        separadorVertical.setBounds(20, 10, 10, 20);
//        panelPrincipal.add(separadorVertical);
        panelPrincipal.setBorder(BorderFactory.createTitledBorder("Secretaria de Movilidad y transporte"));

        //lblText -> label de el texto
        JLabel lblFormato = new JLabel("FORMATO: FORMATO UNICO DE REGISTRO VEHICULAR");
        lblFormato.setBounds(230, 20, 335, 20);
        panelPrincipal.add(lblFormato);

        JLabel lblDGTPP = new JLabel("DGTPP-DGTP-STP-01");
        lblDGTPP.setBounds(330, 40, 150, 20);
        panelPrincipal.add(lblDGTPP);

        JLabel lblAlta = new JLabel("Alta");
        lblAlta.setBounds(20, 80, 50, 20);
        panelPrincipal.add(lblAlta);

        JCheckBox chbAlta = new JCheckBox();
        chbAlta.setBounds(50, 70, 40, 40);
        panelPrincipal.add(chbAlta);

        JLabel lblBaja = new JLabel("Baja");
        lblBaja.setBounds(90, 80, 50, 20);
        panelPrincipal.add(lblBaja);

        JCheckBox chbBaja = new JCheckBox();
        chbBaja.setBounds(130, 70, 40, 40);
        panelPrincipal.add(chbBaja);

        JLabel lblCambioP = new JLabel("Cambio Propietario");
        lblCambioP.setBounds(190, 80, 120, 20);
        panelPrincipal.add(lblCambioP);

        JCheckBox chbCambioP = new JCheckBox();
        chbCambioP.setBounds(310, 70, 40, 40);
        panelPrincipal.add(chbCambioP);

        JLabel lblPlaca = new JLabel("Reasignacion de Placa");
        lblPlaca.setBounds(350, 80, 140, 20);
        panelPrincipal.add(lblPlaca);

        JCheckBox chbPlaca = new JCheckBox();
        chbPlaca.setBounds(490, 70, 40, 40);
        panelPrincipal.add(chbPlaca);

        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(chbAlta);
        btnGroup.add(chbBaja);
        btnGroup.add(chbCambioP);
        btnGroup.add(chbPlaca);

        //Panel Secundario
        JPanel panelSecundario = new JPanel();
        panelSecundario.setBounds(0, 180, 800, 150);
        panelSecundario.setLayout(null);
        panelSecundario.setBorder(BorderFactory.createTitledBorder(""));
        
        JLabel lblTipoVehiculo = new JLabel("Tipo de Vehiculo");
        lblTipoVehiculo.setBounds(10, 30, 110, 20);
        panelSecundario.add(lblTipoVehiculo);
        

        jfrmPrincipal.add(panelPrincipal);
        jfrmPrincipal.add(panelSecundario);
        jfrmPrincipal.add(panelTerciario);
        jfrmPrincipal.add(panelCuarto);
        jfrmPrincipal.add(panelQuinto);
        jfrmPrincipal.add(panelSexto);

        jfrmPrincipal.setVisible(true);

    }
}
