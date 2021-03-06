package Viernes;

import javax.swing.*;

public class CCompBasicos extends JFrame {

    public static void main(String[] args) {

        JFrame NV = new JFrame();

        NV.setTitle("SISTEMA DE CONTENEDORES Y COMPONENTES SWING V1.0");
        NV.setSize(600, 180);
        NV.setLocationRelativeTo(null);
        NV.setResizable(false);

        JPanel miPanel = new JPanel();
        miPanel.setLayout(null);

        JLabel labelTitulo = new JLabel();
        labelTitulo.setText("Bienvenidos al Sistema");
        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 20));
        labelTitulo.setBounds(180, 5, 380, 40);

        JLabel etiquetaLabel = new JLabel();
        etiquetaLabel.setText("JLabel: Esto es un Label o Etiqueta");
        etiquetaLabel.setBounds(20, 50, 280, 23);

        JLabel etiquetaBoton = new JLabel();
        etiquetaBoton.setText("JButton: ");
        etiquetaBoton.setBounds(20, 80, 80, 23);

        JButton boton = new JButton();
        boton.setText("Boton");
        boton.setBounds(80, 80, 80, 23);

        JLabel etiquetaCheckbox = new JLabel();
        etiquetaCheckbox.setText("JCheckBox: ");
        etiquetaCheckbox.setBounds(20, 110, 80, 23);

        JCheckBox checkbox1 = new JCheckBox();
        checkbox1.setText("check1");
        checkbox1.setBounds(100, 110, 80, 23);

        JLabel etiquetaCombo = new JLabel();
        etiquetaCombo.setText("JComboBox: ");
        etiquetaCombo.setBounds(350, 50, 100, 23);

        JComboBox combo = new JComboBox();
        combo.addItem("Opciones");
        combo.addItem("Opcion1");
        combo.addItem("Opcion2");
        combo.addItem("Opcion3");
        combo.addItem("Opcion4");
        combo.setBounds(430, 50, 100, 23);
        combo.setSelectedIndex(0);

            JSeparator separadorVertical = new JSeparator();
        separadorVertical.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separadorVertical.setBounds(300, 60, 10, 80);

        JLabel etiquetaSeparador = new JLabel();
        etiquetaSeparador.setText("JSeparator: ");
        etiquetaSeparador.setBounds(350, 80, 100, 23);

        JSeparator separadorHorizontal = new JSeparator();
        separadorHorizontal.setBounds(430, 92, 100, 5);

        JLabel etiquetaTextField = new JLabel();
        etiquetaTextField.setText("JTextField: ");
        etiquetaTextField.setBounds(350, 110, 280, 23);

        JTextField cajaDeTexto = new JTextField();
        cajaDeTexto.setBounds(430, 110, 90, 23);

        miPanel.add(labelTitulo);
        miPanel.add(etiquetaLabel);
        miPanel.add(etiquetaBoton);
        miPanel.add(etiquetaCheckbox);
        miPanel.add(checkbox1);
        miPanel.add(etiquetaCombo);
        miPanel.add(separadorVertical);
        miPanel.add(etiquetaSeparador);
        miPanel.add(separadorHorizontal);
        miPanel.add(combo);
        miPanel.add(boton);
        miPanel.add(etiquetaTextField);
        miPanel.add(cajaDeTexto);
        miPanel.setBorder(BorderFactory.createTitledBorder("Detalles de los componentes"));

        NV.add(miPanel);
        NV.setVisible(true);
    }

}
