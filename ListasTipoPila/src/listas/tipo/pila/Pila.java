

package listas.tipo.pila;

import javax.swing.JOptionPane;

/**
 *
 * @author Alcides Blandon
 */
public class Pila {
    
    private Nodo ultimoValorIngresado;
    int tamano = 0;
    String Lista = "";
    
    public Pila(){
        ultimoValorIngresado = null;
        tamano = 0;
    }
    
    //Metodo para saber cuando la pila esta vacia
    public boolean pilaVacia(){
        return ultimoValorIngresado == null;
    }
    
    //Metodo para insertar un nodo en la pila
    public void insertarNodo(int nodo){
        Nodo nuevoNodo = new Nodo(nodo);
        nuevoNodo.siguiente = ultimoValorIngresado;
        ultimoValorIngresado = nuevoNodo;
        tamano++;
    }
    
    //Metodo para eliminar Nodo de la lista
    public int eliminarNodo(){
        int auxiliar = ultimoValorIngresado.informacion;
        ultimoValorIngresado = ultimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }
    
    
    //Metodo para saber cual es el ultimo valor ingresado
    public int mostrarUltimoValorIngresado(){
        return ultimoValorIngresado.informacion;
    }
    
    
    //Metodo para conocer el tamano de la pila
    public int tamanoPila(){
        return tamano;
    }
    
    //Metodo para vaciar la pila
    public void vaciarPila(){
        while (!pilaVacia()) {            
            eliminarNodo();
        }
    }
    
    //Metodo para mostrar el contenido de la pila
    public void mostrarValores(){
        Nodo recorrido = ultimoValorIngresado;
        
        while (recorrido != null) {            
            Lista += recorrido.informacion +"\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
