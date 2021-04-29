package interfaces2;

import interfaces2.modelo.Cliente;
import interfaces2.repositorio.*;

import java.util.List;

public class Repositorio {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
        repo.crear(new Cliente("James", "Cameron"));
        repo.crear(new Cliente("Margarita", "Vazco"));
        repo.crear(new Cliente("Susan", "Vaz"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println();
        System.out.println("=== Paginable ===");
        List<Cliente> paginable = ((PaginableRepositorio) repo).listar(0, 3);
        paginable.forEach(System.out::println);

        System.out.println();
        System.out.println("=== Ordenar ===");
        List<Cliente> clientesOrdenAsc = ((OrdenableRepositorio) repo)
                .listar("nombre", Direccion.ASC);

        for (Cliente c : clientesOrdenAsc) {
            System.out.println(c);
        }

        System.out.println("=== editar ===");
        Cliente beaActualizar = new Cliente("Susan","Salado" );
        beaActualizar.setId(3);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(3);
        System.out.println(bea);

        System.out.println("=== eliminar ===");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

    }
}

