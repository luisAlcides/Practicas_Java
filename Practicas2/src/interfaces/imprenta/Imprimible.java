package interfaces.imprenta;

public interface Imprimible {

    String imprimir();

    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
