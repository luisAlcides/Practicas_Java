package datos;

import static datos.Conexion.close;
import static datos.Conexion.getConnection;
import domain.Usuario;

import java.sql.*;
import java.util.*;


public class UsuarioDAO {

    private static final String SELECT = "SELECT idusuario, user, password FROM test.usuario";
    private static final String INSERT = "INSERT INTO test.usuario(user, password) VALUES(?, ?)";
    private static final String UPDATE = "UPDATE test.usuario SET user=?, password=? WHERE idusuario =?";
    private static final String DELETE = "DELETE FROM test.usuario WHERE idusuario = ?";

    public List<Usuario> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareCall(SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idusuario = rs.getInt("idusuario");
                String user = rs.getString("user");
                String password = rs.getString("password");

                usuario = new Usuario(idusuario, user, password);
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        return usuarios;
    }

    public int insertar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(INSERT);
            stmt.setString(1, usuario.getUser());
            stmt.setString(2, usuario.getPassword());
          
            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        return registros;
    }

    public int update(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(UPDATE);
            stmt.setString(1, usuario.getUser());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getIdUsuario());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return registros;
    }

    public int delete(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(DELETE);
            stmt.setInt(1, usuario.getIdUsuario());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;

    }
}
