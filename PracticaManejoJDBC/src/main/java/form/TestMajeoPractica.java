package form;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.ArrayList;
import java.util.List;

public class TestMajeoPractica {

    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        //INSERT
        
       Usuario usuarioNew = new Usuario("Juan", "1234");
        usuarioDAO.insertar(usuarioNew);
        List<Usuario> usuarios = usuarioDAO.seleccionar();
        //usuarios.add(usuarioNew);
        
        //Update
//        Usuario update = new Usuario(3, "Pedro", "1234");
//        usuarioDAO.update(update);
//        usuarios.add(update);
//        
        //delete
        //Usuario delete = new Usuario(3);
       // usuarioDAO.delete(delete);
        //usuarios.add(delete);

        usuarios.remove(2);
        usuarios.forEach(usuario -> System.out.println("usuario = " + usuario.toString()));
    }

}
