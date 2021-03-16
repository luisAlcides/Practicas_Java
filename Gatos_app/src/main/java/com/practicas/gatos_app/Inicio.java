package com.practicas.gatos_app;

import javax.swing.JOptionPane;

/**
 *
 * @author Alcides Blandon
 */
public class Inicio {

    public static void main(String[] args) {

        int opcionMenu = -1;
        String[] botones = {
            "1. Ver gatos", "2. Salir"
        };

        do {
            String opcion = (String) JOptionPane.showInputDialog(null, "Gatitios Java", "Menu Principal", JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);

            //Validamos que opcion selecciona el usuario
            for (int i = 0; i < botones.length; i++) {
                if (opcion.equals(botones[i])) {
                    opcionMenu = i;
                }
            }

            switch (opcionMenu) {
                case 0:
                    GatosSevice.verGatitos();
                    break;
                default:
                    break;
            }
        } while (opcionMenu != 1);
    }

}
