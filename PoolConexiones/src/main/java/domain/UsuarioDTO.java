
package domain;


public class UsuarioDTO {

    private int idUsuario;
    private String user;
    private String password;

    public UsuarioDTO() {
    }

    public UsuarioDTO(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public UsuarioDTO(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public UsuarioDTO(int idUsuario, String user, String password) {
        this.idUsuario = idUsuario;
        this.user = user;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", user=" + user + ", password=" + password + '}';
    }
    
    
    
}
