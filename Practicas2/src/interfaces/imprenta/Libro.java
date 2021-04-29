package interfaces.imprenta;

import interfaces.imprenta.modelo.Hoja;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

    List<Imprimible> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible pagina) {
        paginas.add(pagina);
        return this;
    }

    public String imprimir() {
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n")
                .append("Author: ").append(this.autor).append("\n")
                .append("Genero: ").append(genero).append("\n");
        for (Imprimible pag : this.paginas) {
            sb.append(pag.imprimir()).append("\n");
        }

        return sb.toString();
    }
}
