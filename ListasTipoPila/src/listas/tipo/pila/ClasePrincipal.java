package listas.tipo.pila;

import javax.swing.JOptionPane;

/**
 *
 * @author Alcides Blandon
 */
public class ClasePrincipal {

    public static void main(String[] args) {

        int opcion = 0;
        int nodo = 0;
        Pila pila = new Pila();
        String menuOpciones = "Menu de opciones\n\n"
                + "1. Insertar un Nodo\n"
                + "2. Eliminar un Nodo\n"
                + "3. ¿La pila esta vacia?\n"
                + "4. ¿Cual es el ultimo valor agregado en la Pila?\n"
                + "5. ¿Cuantos nodos tiene la Pila?\n"
                + "6. Vaciar Pila\n"
                + "7. Mostrar contenido de la pila\n"
                + "8. Salir";

        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menuOpciones));

                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Por favor ingresa el valor a guardar en el nodo"));
                        pila.insertarNodo(nodo);
                        break;

                    case 2:
                        if (!pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "
                                    + pila.eliminarNodo());

                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");

                        }
                        break;
                    case 3:
                        if (pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");

                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no esta vacia");

                        }
                        break;
                    case 4:
                        if (!pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El ultimo valor ingresado en la pila es: "
                                    + pila.mostrarUltimoValorIngresado());

                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");

                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene: " + pila.tamanoPila() + " nodos");
                        break;
                    case 6:
                        if (!pila.pilaVacia()) {
                            pila.vaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");

                        }
                        break;
                    case 7:
                        pila.mostrarValores();
                        break;
                    case 8:
                        opcion = 8;
                        break;
                    default:
                        throw new AssertionError();
                }

            } catch (NumberFormatException e) {

            }
        } while (opcion != 0);
    }
}
