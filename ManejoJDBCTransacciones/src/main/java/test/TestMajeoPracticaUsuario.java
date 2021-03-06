package test;

import static datos.Conexion.getConnection;
import datos.UsuarioJDBC;
import domain.Usuario;
import java.sql.*;


public class TestMajeoPracticaUsuario {

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            UsuarioJDBC usuarioJDBC = new UsuarioJDBC(conexion);
            
            Usuario cambioUsuario = new Usuario();
            cambioUsuario.setIdUsuario(1);
            cambioUsuario.setUser("Lud");
            cambioUsuario.setPassword("qwer");
            usuarioJDBC.update(cambioUsuario);
            
            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setUser("Carls12");
            nuevoUsuario.setPassword("qwer123");
            usuarioJDBC.insertar(nuevoUsuario);
            
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
