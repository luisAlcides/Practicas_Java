package Viernes;

import java.awt.*;

public class CGridLayout {

    public static void main(String[] args) {

        Frame ventana = new Frame();
        ventana.setLayout(new GridLayout(2, 3, 10, 10));

        MenuBar menuP = new MenuBar();
        ventana.setMenuBar(menuP);

        Menu mArchivo = new Menu("Archivo");
        menuP.add(mArchivo);
        mArchivo.addSeparator();
        MenuItem abrirItem = new MenuItem("Abrir");
        mArchivo.add(abrirItem);

        MenuItem cerrarItem = new MenuItem("cerrar");
        mArchivo.add(cerrarItem);

        ventana.add(new Button("UNO"));
        ventana.add(new Button("DOS"));
        ventana.add(new Button("TRES"));
        ventana.add(new Button("CUATRO"));
        ventana.add(new Button("CINCO"));
        ventana.add(new Button("SEIS"));
        ventana.add(new Button("Siete"));

        ventana.setSize(200, 200);
        ventana.setVisible(true);

    }
}
