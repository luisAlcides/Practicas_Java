package interfaces.imprenta.modelo;

import interfaces.imprenta.Imprimible;

abstract public class Hoja implements Imprimible {
    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    abstract public String imprimir();
}
