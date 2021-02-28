package testcolecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestColeccionesGenericas {

    public static void main(String[] args) {

        List<String> miLista = new ArrayList<>();

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

        System.out.println("");
        System.out.println("");

        Set<String> miSet = new HashSet<>();

        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");

        miSet.forEach(setElementos -> {
            System.out.println("miSet = " + setElementos);
        });

        System.out.println("");
        System.out.println("Desde un metodo de afuera");
        imprimir(miLista);
        System.out.println("");
        imprimir(miSet);

        System.out.println("");
        System.out.println("Utilizando Map");
        System.out.println("");
        
        
        Map<String, String> miMapa = new HashMap<>();

        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Fran");
        miMapa.put("valor3", "Ramiro");
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        
    }

    public static void imprimir(Collection<String> coleccion) {
        coleccion.forEach(dia -> {
            System.out.println("dia = " + dia);
        });
    }
}
