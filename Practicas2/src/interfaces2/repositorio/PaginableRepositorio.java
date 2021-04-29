package interfaces2.repositorio;

import interfaces2.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {

    List<T> listar(int desde, int hasta);
}
