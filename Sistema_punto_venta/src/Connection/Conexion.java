

package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Alcides Blandon
 */
public class Conexion {

    private String db = "system_ventas";
    private String user = "root";
    private String password = "admin";
    private String url = "jdbc:mysql://localhost/"+db+"?SslMode=none";
    Connection conn = null;
    
    public Conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(this.url, this.user, this.password);
            
            if(conn != null){
                System.out.println("Conexion exitosa ....");
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }

    public Connection getConn() {
        return conn;
    }
    
    
}
