

package clases;

/**
 *
 * @author Alcides Blandon
 */
public class Proceso extends Thread{

    int num;
    
    
    public Proceso(){}
    
    public Proceso(String nombre){
        super(nombre);
    }
    
    public void run(){
        for (int i = 0; i <= num; i++) {
            System.out.println(i +" "+ this.getName());
        }
        System.out.println("");
    }
    
    public void valorDeCondicion(int num){
        this.num = num;
    }
}
