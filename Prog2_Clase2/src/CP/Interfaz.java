package CP;


import javax.swing.*;

public class Interfaz {

    public static void main(String[] args) {

        JFrame jfrmPrincipal = new JFrame();
        jfrmPrincipal.setTitle("Secretaria de Movilidad y Trasporte");
        jfrmPrincipal.setSize(805, 700);
        jfrmPrincipal.setLocationRelativeTo(null);
        jfrmPrincipal.setLayout(null);
        jfrmPrincipal.setResizable(false);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setSize(800, 200);
        panelPrincipal.setLayout(null);
        panelPrincipal.setBorder(BorderFactory.createTitledBorder("Secretaria de Movilidad y transporte"));

        JPanel panelSecundario = new JPanel();
        panelSecundario.setBounds(0, 200, 800, 130);
        panelSecundario.setLayout(null);
        panelSecundario.setBorder(BorderFactory.createTitledBorder("Datos generales del contribuyente"));

        JPanel panelTerciario = new JPanel();
        panelTerciario.setBounds(0, 330, 410, 255);
        panelTerciario.setLayout(null);
        panelTerciario.setBorder(BorderFactory.createTitledBorder("Datos del vehiculo"));

        JPanel panelCuarto = new JPanel();
        panelCuarto.setBounds(415, 330, 370, 110);
        panelCuarto.setLayout(null);
        panelCuarto.setBorder(BorderFactory.createTitledBorder("Poliza De Seguro"));

        JPanel panelQuinto = new JPanel();
        panelQuinto.setBounds(415, 440, 370, 110);
        panelQuinto.setLayout(null);
        panelQuinto.setBorder(BorderFactory.createTitledBorder("Factura"));

        JPanel panelSexto = new JPanel();
        panelSexto.setBounds(0, 580, 800, 100);
        panelSexto.setLayout(null);
        panelSexto.setBorder(BorderFactory.createTitledBorder("Baja Vehicular"));

      

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

        JLabel lblReaPlaca = new JLabel("Reasignacion de Placa");
        lblReaPlaca.setBounds(350, 80, 140, 20);
        panelPrincipal.add(lblReaPlaca);

        JCheckBox chbPlaca = new JCheckBox();
        chbPlaca.setBounds(490, 70, 40, 40);
        panelPrincipal.add(chbPlaca);

        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(chbAlta);
        btnGroup.add(chbBaja);
        btnGroup.add(chbCambioP);
        btnGroup.add(chbPlaca);

        JSeparator separadorHorizontal = new JSeparator();
        separadorHorizontal.setBounds(0, 110, 800, 10);
        panelPrincipal.add(separadorHorizontal);

        JLabel lblTipoVehiculo = new JLabel("Tipo de Vehiculo");
        lblTipoVehiculo.setBounds(40, 120, 110, 20);
        panelPrincipal.add(lblTipoVehiculo);

        JLabel lblvehiculoNuevo = new JLabel("Vehiculo Nuevo");
        lblvehiculoNuevo.setBounds(20, 150, 110, 20);
        panelPrincipal.add(lblvehiculoNuevo);

        JComboBox cbVehiculoNuevo = new JComboBox();
        cbVehiculoNuevo.setBounds(130, 150, 45, 20);
        cbVehiculoNuevo.addItem("Si");
        cbVehiculoNuevo.addItem("No");
        panelPrincipal.add(cbVehiculoNuevo);

        JLabel lblvehiculoUsado = new JLabel("Vehiculo Usado");
        lblvehiculoUsado.setBounds(20, 170, 110, 20);
        panelPrincipal.add(lblvehiculoUsado);

        JComboBox cbVehiculoViejo = new JComboBox();
        cbVehiculoViejo.setBounds(130, 170, 45, 20);
        cbVehiculoViejo.addItem("Si");
        cbVehiculoViejo.addItem("No");
        panelPrincipal.add(cbVehiculoViejo);

        JSeparator sv = new JSeparator();
        sv.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sv.setBounds(185, 125, 10, 65);
        panelPrincipal.add(sv);

        JLabel lblvehiculoEstado = new JLabel("Vehiculo de Estado");
        lblvehiculoEstado.setBounds(195, 150, 115, 20);
        panelPrincipal.add(lblvehiculoEstado);

        JComboBox cbVehiculoEstado = new JComboBox();
        cbVehiculoEstado.setBounds(320, 150, 45, 20);
        cbVehiculoEstado.addItem("Si");
        cbVehiculoEstado.addItem("No");
        panelPrincipal.add(cbVehiculoEstado);

        JLabel lblvehiculoOtro = new JLabel("Vehiculo Otro");
        lblvehiculoOtro.setBounds(195, 170, 110, 20);
        panelPrincipal.add(lblvehiculoOtro);

        JComboBox cbVehiculoOtro = new JComboBox();
        cbVehiculoOtro.setBounds(320, 170, 45, 20);
        cbVehiculoOtro.addItem("Si");
        cbVehiculoOtro.addItem("No");
        panelPrincipal.add(cbVehiculoOtro);

        JSeparator sv1 = new JSeparator();
        sv1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sv1.setBounds(375, 125, 10, 65);
        panelPrincipal.add(sv1);

        JLabel lblVehiculoExtranjero = new JLabel("Vehiculo Extranjero");
        lblVehiculoExtranjero.setBounds(385, 130, 135, 20);
        panelPrincipal.add(lblVehiculoExtranjero);

        JComboBox cbVehiculoExtranjero = new JComboBox();
        cbVehiculoExtranjero.setBounds(420, 155, 45, 20);
        cbVehiculoExtranjero.addItem("Si");
        cbVehiculoExtranjero.addItem("No");
        panelPrincipal.add(cbVehiculoExtranjero);

        JSeparator sv2 = new JSeparator();
        sv2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sv2.setBounds(510, 125, 10, 65);
        panelPrincipal.add(sv2);

        JLabel lblPersona = new JLabel("Persona");
        lblPersona.setBounds(520, 130, 100, 20);
        panelPrincipal.add(lblPersona);

        JComboBox cbPersona = new JComboBox();
        cbPersona.setBounds(520, 155, 60, 20);
        cbPersona.addItem("Fisica");
        cbPersona.addItem("Moral");
        panelPrincipal.add(cbPersona);

        JSeparator sv3 = new JSeparator();
        sv3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sv3.setBounds(600, 125, 10, 65);
        panelPrincipal.add(sv3);

        JLabel lblFecha = new JLabel("Fecha");
        lblFecha.setBounds(630, 130, 80, 20);
        panelPrincipal.add(lblFecha);

        JTextField jtfFecha = new JTextField();
        jtfFecha.setBounds(610, 150, 100, 20);
        panelPrincipal.add(jtfFecha);

        //Panel secundario
        JLabel lblNombreORazon = new JLabel("NOMBRE O RAZON SOCIAL");
        lblNombreORazon.setBounds(100, 30, 160, 20);
        panelSecundario.add(lblNombreORazon);

        JLabel lblFechaNacimiento = new JLabel("Fecha de Nacimiento:");
        lblFechaNacimiento.setBounds(20, 60, 130, 20);
        panelSecundario.add(lblFechaNacimiento);

        JTextField jtfFechaNacimiento = new JTextField();
        jtfFechaNacimiento.setBounds(160, 60, 200, 20);
        panelSecundario.add(jtfFechaNacimiento);

        JLabel lblLugarNacimiento = new JLabel("Lugar de Nacimiento:");
        lblLugarNacimiento.setBounds(20, 100, 130, 20);
        panelSecundario.add(lblLugarNacimiento);

        JTextField jtfLugarNacimiento = new JTextField();
        jtfLugarNacimiento.setBounds(160, 100, 200, 20);
        panelSecundario.add(jtfLugarNacimiento);

        JLabel lblNacionalidad = new JLabel("Nacionalidad:");
        lblNacionalidad.setBounds(440, 40, 100, 20);
        panelSecundario.add(lblNacionalidad);

        JTextField jtfNacionalidad = new JTextField();
        jtfNacionalidad.setBounds(540, 40, 200, 20);
        panelSecundario.add(jtfNacionalidad);

        JLabel lblTelefono = new JLabel("Telefono:");
        lblTelefono.setBounds(455, 70, 130, 20);
        panelSecundario.add(lblTelefono);

        JTextField jtfTelefono = new JTextField();
        jtfTelefono.setBounds(540, 70, 200, 20);
        panelSecundario.add(jtfTelefono);

        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setBounds(460, 100, 100, 20);
        panelSecundario.add(lblCorreo);

        JTextField jtfCorreo = new JTextField();
        jtfCorreo.setBounds(540, 100, 200, 20);
        panelSecundario.add(jtfCorreo);

        //Componentes del panel 3
        JLabel lblPlaca = new JLabel("Placa: ");
        lblPlaca.setBounds(20, 40, 50, 20);
        panelTerciario.add(lblPlaca);

        JTextField jtfPlaca = new JTextField();
        jtfPlaca.setBounds(60, 40, 100, 20);
        panelTerciario.add(jtfPlaca);

        JLabel lblNumMotor = new JLabel("N° de Motor: ");
        lblNumMotor.setBounds(205, 40, 100, 20);
        panelTerciario.add(lblNumMotor);

        JTextField jtfNumMotor = new JTextField();
        jtfNumMotor.setBounds(285, 40, 100, 20);
        panelTerciario.add(jtfNumMotor);

        JLabel lblNumSerie = new JLabel("N° de Serie: ");
        lblNumSerie.setBounds(20, 70, 100, 20);
        panelTerciario.add(lblNumSerie);

        JTextField jtfNumSerie = new JTextField();
        jtfNumSerie.setBounds(95, 70, 90, 20);
        panelTerciario.add(jtfNumSerie);

        JLabel lblClaveVehicular = new JLabel("Clave Vehicular: ");
        lblClaveVehicular.setBounds(200, 70, 100, 20);
        panelTerciario.add(lblClaveVehicular);

        JTextField jftClaveVehicular = new JTextField();
        jftClaveVehicular.setBounds(305, 70, 80, 20);
        panelTerciario.add(jftClaveVehicular);

        JLabel lblClase = new JLabel("Clase: ");
        lblClase.setBounds(20, 100, 50, 20);
        panelTerciario.add(lblClase);

        JTextField jtfClase = new JTextField();
        jtfClase.setBounds(60, 100, 70, 20);
        panelTerciario.add(jtfClase);

        JLabel lblTipo = new JLabel("Tipo: ");
        lblTipo.setBounds(140, 100, 50, 20);
        panelTerciario.add(lblTipo);

        JTextField jtfTipo = new JTextField();
        jtfTipo.setBounds(175, 100, 40, 20);
        panelTerciario.add(jtfTipo);

        JLabel lblCategoria = new JLabel("Categoria: ");
        lblCategoria.setBounds(245, 100, 70, 20);
        panelTerciario.add(lblCategoria);

        JTextField jtfCategoria = new JTextField();
        jtfCategoria.setBounds(315, 100, 70, 20);
        panelTerciario.add(jtfCategoria);

        JLabel lblMarca = new JLabel("Marca: ");
        lblMarca.setBounds(20, 130, 50, 20);
        panelTerciario.add(lblMarca);

        JTextField jtfMarca = new JTextField();
        jtfMarca.setBounds(60, 130, 70, 20);
        panelTerciario.add(jtfMarca);

        JLabel lblSubmarca = new JLabel("Submarca: ");
        lblSubmarca.setBounds(140, 130, 70, 20);
        panelTerciario.add(lblSubmarca);

        JTextField jtfSubmarca = new JTextField();
        jtfSubmarca.setBounds(210, 130, 60, 20);
        panelTerciario.add(jtfSubmarca);

        JLabel lblAnnio = new JLabel("Año: ");
        lblAnnio.setBounds(305, 130, 50, 20);
        panelTerciario.add(lblAnnio);

        JTextField jtfAnnio = new JTextField();
        jtfAnnio.setBounds(335, 130, 50, 20);
        panelTerciario.add(jtfAnnio);

        JLabel lblCilindros = new JLabel("Cilindros: ");
        lblCilindros.setBounds(15, 160, 70, 20);
        panelTerciario.add(lblCilindros);

        JTextField jtfCilindros = new JTextField();
        jtfCilindros.setBounds(75, 160, 60, 20);
        panelTerciario.add(jtfCilindros);

        JLabel lblToneladas = new JLabel("Toneladas: ");
        lblToneladas.setBounds(145, 160, 70, 20);
        panelTerciario.add(lblToneladas);

        JTextField jtfToneladas = new JTextField();
        jtfToneladas.setBounds(210, 160, 60, 20);
        panelTerciario.add(jtfToneladas);

        JLabel lblOrigen = new JLabel("Origen: ");
        lblOrigen.setBounds(290, 160, 50, 20);
        panelTerciario.add(lblOrigen);

        JTextField jtfOrigen = new JTextField();
        jtfOrigen.setBounds(335, 160, 50, 20);
        panelTerciario.add(jtfOrigen);

        JLabel lblNumPasajeros = new JLabel("Nº Pasajeros: ");
        lblNumPasajeros.setBounds(15, 190, 100, 20);
        panelTerciario.add(lblNumPasajeros);

        JTextField jtfNumPasajeros = new JTextField();
        jtfNumPasajeros.setBounds(95, 190, 60, 20);
        panelTerciario.add(jtfNumPasajeros);

        JLabel lblCombustible = new JLabel("Combustible: ");
        lblCombustible.setBounds(160, 190, 100, 20);
        panelTerciario.add(lblCombustible);

        JTextField jtfCombustible = new JTextField();
        jtfCombustible.setBounds(240, 190, 60, 20);
        panelTerciario.add(jtfCombustible);

        JLabel lblUso = new JLabel("Uso: ");
        lblUso.setBounds(305, 190, 50, 20);
        panelTerciario.add(lblUso);

        JTextField jtfUso = new JTextField();
        jtfUso.setBounds(335, 190, 50, 20);
        panelTerciario.add(jtfUso);

        JLabel lblCMCubico = new JLabel("CM Cubico: ");
        lblCMCubico.setBounds(20, 220, 100, 20);
        panelTerciario.add(lblCMCubico);

        JTextField jtfCubico = new JTextField();
        jtfCubico.setBounds(90, 220, 50, 20);
        panelTerciario.add(jtfCubico);

        JLabel lblColor = new JLabel("Color: ");
        lblColor.setBounds(145, 220, 80, 20);
        panelTerciario.add(lblColor);

        JTextField jtfColor = new JTextField();
        jtfColor.setBounds(185, 220, 60, 20);
        panelTerciario.add(jtfColor);

        JLabel lblNumPuertas = new JLabel("Nº de Puertas: ");
        lblNumPuertas.setBounds(250, 220, 100, 20);
        panelTerciario.add(lblNumPuertas);

        JTextField jtfNumPuertas = new JTextField();
        jtfNumPuertas.setBounds(335, 220, 50, 20);
        panelTerciario.add(jtfNumPuertas);

        //Componentes panel 4
        JLabel lblAseguradora = new JLabel("Aseguradora: ");
        lblAseguradora.setBounds(20, 40, 100, 20);
        panelCuarto.add(lblAseguradora);

        JTextField jtfAseguradora = new JTextField();
        jtfAseguradora.setBounds(105, 40, 80, 20);
        panelCuarto.add(jtfAseguradora);

        JLabel lblNumPoliza = new JLabel("N° de Poliza: ");
        lblNumPoliza.setBounds(200, 40, 100, 20);
        panelCuarto.add(lblNumPoliza);

        JTextField jtfNumPoliza = new JTextField();
        jtfNumPoliza.setBounds(280, 40, 80, 20);
        panelCuarto.add(jtfNumPoliza);

        JLabel lblVigencia = new JLabel("Vigencia: ");
        lblVigencia.setBounds(20, 70, 100, 20);
        panelCuarto.add(lblVigencia);

        JTextField jtfVigencia = new JTextField();
        jtfVigencia.setBounds(105, 70, 200, 20);
        panelCuarto.add(jtfVigencia);

        //Componentes de panel 5
        JLabel lblFacturaFecha = new JLabel("Fecha: ");
        lblFacturaFecha.setBounds(20, 40, 100, 20);
        panelQuinto.add(lblFacturaFecha);

        JTextField jtfFacturaFecha = new JTextField();
        jtfFacturaFecha.setBounds(70, 40, 80, 20);
        panelQuinto.add(jtfFacturaFecha);

        JLabel lblNumFactura = new JLabel("N° de Factura: ");
        lblNumFactura.setBounds(180, 40, 100, 20);
        panelQuinto.add(lblNumFactura);

        JTextField jtfNumFactura = new JTextField();
        jtfNumFactura.setBounds(280, 40, 80, 20);
        panelQuinto.add(jtfNumFactura);

        JLabel lblImporteFactura = new JLabel("Importe Factura: ");
        lblImporteFactura.setBounds(20, 70, 140, 20);
        panelQuinto.add(lblImporteFactura);

        JTextField jtfImporteFactura = new JTextField();
        jtfImporteFactura.setBounds(120, 70, 200, 20);
        panelQuinto.add(jtfImporteFactura);

        //Componentes panel 6
        JLabel lblMotivoBaja = new JLabel("Motivo de Baja: ");
        lblMotivoBaja.setBounds(20, 20, 140, 20);
        panelSexto.add(lblMotivoBaja);

        JTextField jtfMotivoBaja = new JTextField();
        jtfMotivoBaja.setBounds(120, 20, 280, 20);
        panelSexto.add(jtfMotivoBaja);

        JLabel lblEstado = new JLabel("Estado: ");
        lblEstado.setBounds(20, 45, 140, 20);
        panelSexto.add(lblEstado);

        JTextField jtfMotivoDBaja = new JTextField();
        jtfMotivoDBaja.setBounds(70, 45, 330, 20);
        panelSexto.add(jtfMotivoDBaja);

        JSeparator svPanel4 = new JSeparator();
        svPanel4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        svPanel4.setBounds(450, 15, 10, 60);
        panelSexto.add(svPanel4);

        JLabel lblDocumentacion = new JLabel("Documentacion que presenta");
        lblDocumentacion.setBounds(530, 10, 180, 20);
        panelSexto.add(lblDocumentacion);

        JLabel lblTarjetaCirculacion = new JLabel("Tarjeta Circulacion");
        lblTarjetaCirculacion.setBounds(460, 30, 180, 20);
        panelSexto.add(lblTarjetaCirculacion);

        JComboBox cbCirculacion = new JComboBox();
        cbCirculacion.setBounds(590, 30, 60, 20);
        cbCirculacion.addItem("Si");
        cbCirculacion.addItem("No");
        panelSexto.add(cbCirculacion);

        JLabel lblPlacas = new JLabel("Placas");
        lblPlacas.setBounds(460, 55, 70, 20);
        panelSexto.add(lblPlacas);

        JComboBox cbDocCirculacion = new JComboBox();
        cbDocCirculacion.setBounds(520, 55, 60, 20);
        cbDocCirculacion.addItem("Si");
        cbDocCirculacion.addItem("No");
        panelSexto.add(cbDocCirculacion);

        JTextField jtfDocCirculacion = new JTextField();
        jtfDocCirculacion.setBounds(590, 55, 100, 20);
        panelSexto.add(jtfDocCirculacion);

        jfrmPrincipal.add(panelPrincipal);
        jfrmPrincipal.add(panelSecundario);
        jfrmPrincipal.add(panelTerciario);
        jfrmPrincipal.add(panelCuarto);
        jfrmPrincipal.add(panelQuinto);
        jfrmPrincipal.add(panelSexto);
        jfrmPrincipal.setVisible(true);

    }
}
