
package datos;

import domain.UsuarioDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alcides Blandon
 */
public interface UsuarioDAO {

    public List<UsuarioDTO> select() throws SQLException;
    
    public int select(UsuarioDTO usuario) throws SQLException;
    
    public int update(UsuarioDTO usuario) throws SQLException;
    
    public int delete(UsuarioDTO usuario) throws SQLException;
    
    
}
