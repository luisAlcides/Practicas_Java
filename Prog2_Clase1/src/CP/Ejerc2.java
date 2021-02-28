package CP;

import java.awt.*;

public class Ejerc2 {

    public static void main(String[] args) {

        Frame ventana = new Frame();
        ventana.setLayout(null);
        ventana.setSize(650, 400);

        Label lblNombre = new Label();
        lblNombre.setText("Nombre");
        lblNombre.setBounds(30, 60, 50, 20);

        TextField txtNombre = new TextField();
        txtNombre.setBounds(100, 60, 200, 20);

        Label lblApellido = new Label();
        lblApellido.setText("Apellido");
        lblApellido.setBounds(320, 60, 50, 20);

        TextField txtApellido = new TextField();
        txtApellido.setBounds(340, 60, 200, 20);

        Label lblCorreo = new Label();
        lblCorreo.setText("Correo");
        lblCorreo.setBounds(30, 100, 50, 20);

        TextField txtCorreo = new TextField();
        txtCorreo.setBounds(100, 100, 320, 20);

        Label lblSexo = new Label();
        lblSexo.setText("Sexo");
        lblSexo.setBounds(440, 100, 30, 20);

        Choice chooserSexo = new Choice();
        chooserSexo.setBounds(490, 100, 120, 20);
        chooserSexo.add("Hombre");
        chooserSexo.add("Mujer");
        chooserSexo.add("Prefiero no decir");

        Label lblDireccion = new Label();
        lblDireccion.setText("Direccion");
        lblDireccion.setBounds(30, 160, 55, 20);

        TextArea txtDescDir = new TextArea();
        txtDescDir.setBounds(100, 140, 450, 80);

        Label lblPrivilegios = new Label();
        lblPrivilegios.setText("Privilegios");
        lblPrivilegios.setBounds(30, 275, 50, 20);

        Checkbox cbLectura = new Checkbox("Lectura", false);
        cbLectura.setBounds(130, 270, 50, 30);

        Checkbox cbEscritura = new Checkbox("Escritura", false);
        cbEscritura.setBounds(210, 270, 70, 30);

        Checkbox cbPropietario = new Checkbox("Propietario", false);
        cbPropietario.setBounds(290, 270, 70, 30);

        Label lblCargo = new Label();
        lblCargo.setText("Cargo");
        lblCargo.setBounds(390, 275, 50, 20);

        Choice chooserCargo = new Choice();
        chooserCargo.setBounds(440, 275, 160, 20);
        chooserCargo.add("Administrador");
        chooserCargo.add("Gerente");
        chooserCargo.add("Usuario");

        Button btnAgregar = new Button("Agregar");
        btnAgregar.setBounds(210, 340, 70, 25);

        Button btnLimpiar = new Button("Limpiar");
        btnLimpiar.setBounds(310, 340, 70, 25);

        ventana.add(lblNombre);
        ventana.add(txtNombre);
        ventana.add(lblApellido);
        ventana.add(txtApellido);
        ventana.add(lblCorreo);
        ventana.add(txtCorreo);
        ventana.add(lblSexo);
        ventana.add(chooserSexo);
        ventana.add(lblDireccion);
        ventana.add(txtDescDir);
        ventana.add(lblPrivilegios);
        ventana.add(cbLectura);
        ventana.add(cbEscritura);
        ventana.add(cbPropietario);
        ventana.add(lblCargo);
        ventana.add(chooserCargo);
        ventana.add(btnAgregar);
        ventana.add(btnLimpiar);
        ventana.setVisible(true);
    }
}
