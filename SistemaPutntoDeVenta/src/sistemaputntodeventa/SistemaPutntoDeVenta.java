
package sistemaputntodeventa;

import Views.Sistema;
import java.awt.Frame;
import javax.swing.UIManager;


/**
 *
 * @author Alcides Blandon
 */
public class SistemaPutntoDeVenta {

    public static void main(String[] args) {
        
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
        }
        
       Sistema sistema =  new Sistema();
       sistema.setVisible(true);
       sistema.setExtendedState(Frame.MAXIMIZED_BOTH);
       
    }

}
