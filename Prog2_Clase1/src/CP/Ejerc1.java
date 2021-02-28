package CP;

import java.awt.*;

public class Ejerc1 {

    public static void main(String[] args) {

        Frame ventana = new Frame();
        ventana.setTitle("Pago de Empleados");
        ventana.setLayout(null);
        ventana.setSize(450, 350);

        Label lblPrincipal = new Label();
        lblPrincipal.setBounds(150, 50, 150, 20);
        lblPrincipal.setText("PAGO DE EMPLEADOS");
        
        Label lblEmpleado = new Label();
        lblEmpleado.setBounds(30, 70, 70, 20);
        lblEmpleado.setText("Empleado");
        
        TextField txtField = new TextField();
        txtField.setBounds(110, 70, 250, 20);
        
        Label lblHoras = new Label();
        lblHoras.setBounds(30, 130, 40, 20);
        lblHoras.setText("Horas");
        
        TextField txtFHoras = new TextField();
        txtFHoras.setBounds(110, 130, 70, 20);
        
        Label lblTarifa = new Label();
        lblTarifa.setBounds(240, 130, 40, 20);
        lblTarifa.setText("Tarifa");
        
        TextField txtFTarifa = new TextField();
        txtFTarifa.setBounds(290, 130, 70, 20);
        
        Button btnMostrar = new Button("Mostrar");
        btnMostrar.setBounds(160, 190, 60, 25);
        btnMostrar.setBackground(new Color(217,247,250));
        btnMostrar.isEnabled();
        
        Button btnLimpiar = new Button("Limpiar");
        btnLimpiar.setBounds(230, 190, 60, 25);
        btnLimpiar.setBackground(new Color(217,247,250));
        btnLimpiar.isEnabled();
        
        TextArea txtDesc = new TextArea();
        txtDesc.setBounds(80, 240, 300, 80);

        
        ventana.setBackground(new Color(216,221,222));
        ventana.add(lblPrincipal);
        ventana.add(lblEmpleado);
        ventana.add(txtField);
        ventana.add(lblHoras);
        ventana.add(txtFHoras);
        ventana.add(lblTarifa);
        ventana.add(txtFTarifa);
        ventana.add(btnMostrar);
        ventana.add(btnLimpiar);
        ventana.add(txtDesc);
        ventana.setVisible(true);

    }
}
