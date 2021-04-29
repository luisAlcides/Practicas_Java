package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alcides Blandon
 */
public class Conexion {

    private String db = "sistema_punto_ventas";
    private String user = "root";
    private String password = "admin";
    private String urlMysql = "jdbc:mysql://localhost/" + db + "?SslMode=none";
    private Connection conn = null;

    public Conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(this.urlMysql, this.user, this.password);

            if (conn != null) {
                System.out.println("Conexion a la base de datos  " + this.db + "........ Listo");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error: " + ex);
        }
    }

    public Connection getConn() {
        return conn;
    }

}
