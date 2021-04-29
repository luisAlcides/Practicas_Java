package Viernes.Vista;

import Viernes.Controlador.CCReciboEnvio;
import Viernes.Controlador.CCSistemaCobro;
import Viernes.Modelo.CReciboEnvio;
import Viernes.Modelo.CSistemaCobro;
import Viernes.Vista.JfrmReciboEnvio;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Alcides Blandon
 */
public class Inicio {

    public static void main(String args[]) {

//<editor-fold defaultstate="collapsed" desc="apariencia">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    try {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
//</editor-fold>


        //Descomentar el codigo para ver el otro frame

        //JFRAME ENVIO Y RECIBO DE DINERO
//        JfrmReciboEnvio view = new JfrmReciboEnvio();
//        CReciboEnvio mod = new CReciboEnvio();
//        CCReciboEnvio reciboEnvio = new CCReciboEnvio(view, mod);
//        reciboEnvio.iniciar();
//        view.setVisible(true);
        
        //JFRAME SISTEMA DE COBRO
        JfrmSistemaCobro viewSistemaCobro = new JfrmSistemaCobro();
        CSistemaCobro modSistemaCobro = new CSistemaCobro();
        CCSistemaCobro sistemaCobro = new CCSistemaCobro(viewSistemaCobro, modSistemaCobro);
        sistemaCobro.iniciar();
       viewSistemaCobro.setVisible(true);
    }
}
