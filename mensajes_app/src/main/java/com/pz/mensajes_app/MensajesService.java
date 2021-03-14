package com.pz.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author Alcides Blandon
 */
public class MensajesService {

    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe Tu mensaje: ");
        String mensaje = sc.nextLine();

        System.out.println("Escribe tu nombre: ");
        String nombre = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(nombre);
        MensajesDAO.crearMensajeDB(registro);

    }

    public static void listarMensajes() {
        MensajesDAO.leerMensajeDB();
    }

    public static void borrarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el id de el mensaje a borrar");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);
    }

    public static void actualizarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Indica el id de el mensaje a editar: ");
        int id_mensaje = sc.nextInt();
        Mensajes actualizacion = new Mensajes();
        actualizacion.setMensaje(mensaje);
        actualizacion.setIdMensaje(id_mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion);
    }
}
