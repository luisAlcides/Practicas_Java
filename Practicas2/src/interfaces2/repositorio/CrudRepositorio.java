package interfaces2.repositorio;

import interfaces2.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio<T> {

    List<T> listar();
    Cliente porId(Integer id);
    void crear(T cliente);
    void editar(T cliente);
    void eliminar(Integer id);
}
