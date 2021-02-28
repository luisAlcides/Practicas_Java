
package Viernes;

import java.awt.*;

public class CFlowLayout {
    public static void main(String[] args) {
        
        Frame ventana = new Frame();
        ventana.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        ventana.setTitle("Sistema de Gestion");
        ventana.setSize(600, 200);
        ventana.setBackground(new Color(204, 222, 242));
        
        ventana.add(new Label("usuario"));
        ventana.add(new TextField("", 20));
        ventana.add(new Button("Ingresar"));
        
        TextField txtUsuario = new TextField("TextoPorDefecto", 20);
        ventana.add(txtUsuario);
        
        CheckboxGroup rbtn = new CheckboxGroup();
        ventana.add(new Checkbox("Seleccionar", rbtn, true));
        ventana.add(new Checkbox("Insertar", rbtn, true));
        ventana.add(new Checkbox("Actualizar", rbtn, false));
        ventana.add(new Checkbox("Eliminar", rbtn, false));
        ventana.add(new Checkbox("Nuevo", false));
        
        List list = new List(3, false);
        list.add("Principal");
        list.add("Secundario");
        ventana.add(list);
        
        Choice chooser = new Choice();
        chooser.add("Administrador");
        chooser.add("Invitado");
        chooser.add("Ninguno");
        ventana.add(chooser);
        
        ventana.add(new Scrollbar());
        ventana.setVisible(true);
//        ventana.setResizable(false);
    }
}
