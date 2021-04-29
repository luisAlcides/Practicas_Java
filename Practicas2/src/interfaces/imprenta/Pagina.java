package interfaces.imprenta;

import interfaces.imprenta.modelo.Hoja;

public class Pagina extends Hoja {


    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }
}
