package interfaces.imprenta;

import interfaces.imprenta.modelo.Curriculo;
import interfaces.imprenta.modelo.Hoja;
import interfaces.imprenta.modelo.Informe;

import static interfaces.imprenta.Genero.PROGRAMACION;
import static interfaces.imprenta.Imprimible.imprimir;

public class Imprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo(new Persona("Luis ALcides", "Blandon"),"Ingeniero Sistemas", "Resumen Laboral .......");
        cv.addExperiencia("Java")
        .addExperiencia("Mysql")
        .addExperiencia("Javascript");

        Libro libro = new Libro(new Persona("James", "Kotlin"), "Kotlin"
                , PROGRAMACION);
        libro.addPagina(new Pagina("Variables"))
                .addPagina(new Pagina("Ciclos"))
                .addPagina(new Pagina("Condicionales"));

        Informe informe = new Informe(new Persona("James", "Col"), "Marx Casas","Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Escribiendo un objeto generico de una clase anonima";
            }
        });
    }

}
