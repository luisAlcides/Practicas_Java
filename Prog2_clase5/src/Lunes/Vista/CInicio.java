

package Lunes.Vista;

import Lunes.Controlador.CCVendedor;
import Lunes.Modelo.CVendedor;

/**
 *
 * @author Alcides Blandon
 */
public class CInicio {

    public static void main(String[] args) {
        
        CVendedor mod = new CVendedor();
        FrmVendedor frm = new FrmVendedor();
        CCVendedor cv = new CCVendedor(frm, mod);
        
        cv.iniciar();
        frm.setVisible(true);
        
    }
}
