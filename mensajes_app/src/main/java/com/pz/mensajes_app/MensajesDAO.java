package com.pz.mensajes_app;

import com.pz.mensajes_app.datos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alcides Blandon
 */
public class MensajesDAO {

    public static void crearMensajeDB(Mensajes mensaje) {
        Conexion dbConexion = new Conexion();

        try (Connection conexion = dbConexion.get_connection()) {
            PreparedStatement ps = null;

            try {
                String query = "INSERT INTO `mensajes` (`mensaje`, `autor_mensaje`) VALUES (?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutorMensaje());
                ps.executeUpdate();
                System.out.println("Mensaje Creado");

            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void leerMensajeDB() {

        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection conexion = db_connect.get_connection()) {
            String query = "SELECT * FROM mensajes";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("id: " + rs.getInt("id_mensajes"));
                System.out.println("Mensaje: " + rs.getString("mensaje"));
                System.out.println("Autor: " + rs.getString("autor_mensaje"));
                System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                System.out.println("");

            }

        } catch (SQLException e) {
            System.out.println("No se pudieron recuperar los mensajes");
            System.out.println(e);
        }
    }

    public static void borrarMensajeDB(int idMensaje) {

        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;

        try (Connection conexion = db_connect.get_connection()) {
            String query = "DELETE FROM mensajes WHERE id_mensajes = ?";
            ps = conexion.prepareStatement(query);
            ps.setInt(1, idMensaje);
            ps.executeUpdate();
            System.out.println("El mensaje ha sido borrado");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void actualizarMensajeDB(Mensajes mensaje) {

        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;

        try (Connection conexion = db_connect.get_connection()) {
            String query = "UPDATE mensajes SET mensaje = ? WHERE id_mensajes = ?";
            ps = conexion.prepareStatement(query);
            ps.setString(1, mensaje.getMensaje());
            ps.setInt(2, mensaje.getIdMensaje());
            ps.executeUpdate();
            System.out.println("El mensaje se actualizo correctamente");
        } catch (SQLException e) {
            System.out.println("NO se pudo actualizar el mensaje");
            System.out.println(e);
        }

    }
}
