package com.pz.mensajes_app;

import com.pz.mensajes_app.datos.Conexion;
import java.util.Scanner;

/**
 *
 * @author Alcides Blandon
 */
public class Inicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("---------------------");
            System.out.println(" Aplicacion de mensajes");
            System.out.println("1. Crear Mensajes");
            System.out.println("2. Listar Mensajes");
            System.out.println("3. Editar Mensajes");
            System.out.println("4. Eliminar Mensajes");
            System.out.println("5. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    MensajesService.crearMensaje();
                    break;

                case 2:
                    MensajesService.listarMensajes();
                    break;

                case 3:
                    MensajesService.actualizarMensaje();
                    break;

                case 4:
                    MensajesService.borrarMensaje();
                    break;

                default:
                    System.out.println("No entiendo :(");
            }

        } while (opcion != 5);
    }
}
