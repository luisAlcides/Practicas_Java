

package Lunes.Controlador;

import Lunes.Modelo.CVendedor;
import Lunes.Vista.FrmVendedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Alcides Blandon
 */
public class CCVendedor implements ActionListener{

    private FrmVendedor view = new  FrmVendedor();
    private CVendedor model = new CVendedor();
    
    public CCVendedor(FrmVendedor view, CVendedor model){
        this.view = view;
        this.model = model;
        this.view.jBImprimir.addActionListener(this);
        this.view.jBLimpiar.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("Gestion de vendedores");
        view.setLocationRelativeTo(null);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view.jBImprimir){
            
        
        model.setVendedor(view.jTFNombres.getText());
        model.setTipoVenta(view.jCBTipoVenta.getSelectedItem().toString());
        model.setTarifaComision(Double.parseDouble(view.jTFTarifaComison.getText()));
        model.setVentasBrutas(Double.parseDouble(view.jTFVentaBruto.getText()));
        model.CComision();
        model.CIngresos();
        view.jTFComisionPagar.setText(String.valueOf(model.getComision()));
        view.jTAVistaPreliminar.setText(String.valueOf(model.imprimir()));
        }
        
        if(e.getSource() == view.jBLimpiar){
            view.jTFNombres.setText("");
            view.jTFTarifaComison.setText("");
            view.jTFComisionPagar.setText("");
            view.jTFVentaBruto.setText("");
            view.jCBTipoVenta.setSelectedIndex(0);
            
        }
    }
}
