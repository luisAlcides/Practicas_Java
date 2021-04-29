package FirstElements;

public class Main {
    public static void main(String[] args) {

        String nombre = "Luis";
        String apellido = "Blandon";

        String nombre2 = nombre.transform(n -> {
            return n + " Este nombre es cool";
        });

        String remplazo = apellido.replace("a", "i");

        System.out.println(nombre2 + " " + remplazo);
    }
}
