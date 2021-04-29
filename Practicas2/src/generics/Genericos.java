package generics;

import interfaces2.modelo.Cliente;
import interfaces2.modelo.ClientePremiun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Genericos {
    public static void main(String[] args) {

        List<Cliente> clientes= new ArrayList<>();
        clientes.add(new Cliente("Andrez", "Guzman"));

//        Cliente andres = (Cliente)clientes.get(0);
        Cliente andres = clientes.iterator().next();
        Cliente[] clientesArreglo = {
                new Cliente("Marco", "Polo"),
                new Cliente("Mario", "Vespucio")
        };

        Integer[] enteroArreglo = {1,2,3};

        List<Cliente> clientes2 = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enteroArreglo);

        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(
                new String[] {"Andres", "Pepe", "Moises"},enteroArreglo);

        nombres.forEach(System.out::println);

        List<ClientePremiun> clientesPremiunList = fromArrayToList(new ClientePremiun[]{
                new ClientePremiun("Pago","Lux")});

        imprimirClientes(clientes);
        imprimirClientes(clientesPremiunList);

        System.out.println();
        System.out.println();

        System.out.println("Maximo de 1, 9 y 4 es: " + maximo(1,9,4));
        System.out.println("Maximo de 3.9, 11.6, 7.78 es: " + maximo(3.9,11.6,7.78));
        System.out.println("Maximo de zanahoria, arandanos, manzana es: " +
                maximo("zanahoria","arandanos","manzana"));
    }

    public static <T>List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Number>List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Cliente>List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T,G> List<T> fromArrayToList(T[] c,G[] g){
        for (G elemento: g){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }
    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }

        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
