package test;

import static datos.Conexion.getConnection;
import datos.UsuarioDAO;
import datos.UsuarioDAOJDBC;
import domain.UsuarioDTO;
import java.sql.*;
import java.util.List;

public class TestMajeoPracticaUsuario {

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            UsuarioDAO usuarioDAO = new UsuarioDAOJDBC(conexion);

            List<UsuarioDTO> usuarios = usuarioDAO.select();

            usuarios.forEach(usuario -> {
                System.out.println("usuarios = " + usuario);});

            conexion.commit();
            System.out.println("Se ha hecho el commit");

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

    }
}
