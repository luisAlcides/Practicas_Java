package Viernes;

import java.awt.*;

public class CAWT {

    public static void main(String[] args) {

        //Creamos la ventana con propiedades
        Frame frmInicio = new Frame();
        frmInicio.setTitle("Sistema de Gestion de informacion");
        frmInicio.setLayout(null);
        frmInicio.setSize(450, 200);

        //Creamos componente etiqueta ubicacion
        Label lblUsuario = new Label();
        lblUsuario.setBounds(10, 50, 50, 20);
        lblUsuario.setText("Usuario");

        //Creamos componente campo de texto con ubicacion
        TextField txtUsuario = new TextField();
        txtUsuario.setBounds(70, 50, 150, 20);

        //Creamos componente boton de ubicacion
        Button btnAbrir = new Button("Aceptar");
        btnAbrir.setBounds(250, 50, 50, 20);
        btnAbrir.isEnabled();

        //Creamos componente texto area
        TextArea txtDescripcion = new TextArea();
        txtDescripcion.setBounds(70, 80, 200, 60);

        //Agregamos componente de la ventana
        frmInicio.add(lblUsuario);
        frmInicio.add(txtUsuario);
        frmInicio.add(btnAbrir);
        frmInicio.add(txtDescripcion);
        
        //Mostrar la ventana
        frmInicio.setVisible(true);
        //frmInicio.setResizable(false);
        
        
        //VGap
        //HGap

    }

}
