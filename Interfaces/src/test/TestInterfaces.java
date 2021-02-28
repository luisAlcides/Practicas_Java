
package test;

import accesodatos.*;


public class TestInterfaces {
    
    public static void main(String[] args) {
        
        
        AccesoDatos datos = new ImplementacionMySql();
        
        datos.actualizar();
        datos.eliminar();
        datos.listar();
        datos.insertar();
        
        imprimir(datos);
    }
    
    public static void imprimir(AccesoDatos datos){
        datos.listar();
    }
}
