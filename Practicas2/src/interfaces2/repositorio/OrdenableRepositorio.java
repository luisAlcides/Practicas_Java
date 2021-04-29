package interfaces2.repositorio;

import interfaces2.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {

    List<T> listar(String campo, Direccion dir);

}
