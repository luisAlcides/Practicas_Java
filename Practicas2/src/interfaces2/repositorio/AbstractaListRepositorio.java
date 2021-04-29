package interfaces2.repositorio;

import interfaces2.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class AbstractaListRepositorio<T> implements OrdenablePaginableCrudRepositorio<T>{


    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }


    @Override
    public List<T> listar() {
        return dataSource;
    }

    /*@Override
    public Cliente porId(Integer id) {

        Cliente resultado = null;
        for (Cliente cli : dataSource) {
            if (cli.getId() != null && cli.getId().equals(id)) {
                cli = resultado;
                break;
            }
        }
        return resultado;
    }
*/
     @Override
    public void crear(T t) {
        this.dataSource.add(t);

    }

    /*
    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }*/

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }


/*
    @Override
    public List<T> listar(String campo, Direccion dir) {

        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        //listaOrdenada.sort(new CompareTo);
        return listaOrdenada;
    }*/

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    /*
    public static int ordenar(String campo, Cliente a, Cliente b){
        int resultado = 0;
        switch (campo){
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());

        }
        return resultado;
    }*/

    @Override
    public int total() {
        return 0;
    }
}
