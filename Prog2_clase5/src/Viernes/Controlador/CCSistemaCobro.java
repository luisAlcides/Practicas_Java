package Viernes.Controlador;

import Viernes.Modelo.CSistemaCobro;
import Viernes.Vista.JfrmSistemaCobro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Alcides Blandon
 */
public class CCSistemaCobro implements ActionListener {

    JfrmSistemaCobro view = new JfrmSistemaCobro();
    CSistemaCobro model = new CSistemaCobro();

    public CCSistemaCobro(JfrmSistemaCobro view, CSistemaCobro model) {
        this.view = view;
        this.model = model;
        this.view.btnSistemaCalcular.addActionListener(this);
    }

    public void iniciar(){
        view.setTitle("Sistema de Cobro");
        view.setLocationRelativeTo(null);
        view.tfIVA.setText("15%");
        view.tfIVA.setEditable(false);
        view.tfBillete500.setText("0");
        view.tfBillete200.setText("0");
        view.tfBillete100.setText("0");
        view.tfBillete50.setText("0");
        view.tfBillete20.setText("0");
        view.tfBillete10.setText("0");
        view.tfBillete5.setText("0");
        view.tfBillete1.setText("0");
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setValorPagar(Double.parseDouble(view.tfValorPagar.getText()));
        if (view.tfBillete500.getText() != null) {
            model.setBillete500((Double.parseDouble(view.tfBillete500.getText())) *500);

        }
        if (!"0".equals(view.tfBillete200.getText())) {

            model.setBillete200(Double.parseDouble(view.tfBillete200.getText()) *200);
        }

        if (!"0".equals(view.tfBillete100.getText())) {

            model.setBillete100(Double.parseDouble(view.tfBillete100.getText()) * 100);
        }
        if (!"0".equals(view.tfBillete50.getText())) {
            model.setBillete50(Double.parseDouble(view.tfBillete50.getText())*50);

        }
        if (!"0".equals(view.tfBillete20.getText())) {

            model.setBillete20(Double.parseDouble(view.tfBillete20.getText())*20);
        }

        if (!"0".equals(view.tfBillete10.getText())) {

            model.setBillete10(Double.parseDouble(view.tfBillete10.getText())*10);
        }
        if (!"0".equals(view.tfBillete5.getText())) {

            model.setBillete5(Double.parseDouble(view.tfBillete5.getText())*5);
        }
        if (!"0".equals(view.tfBillete1.getText())) {
            model.setBillete1(Double.parseDouble(view.tfBillete1.getText())*1);

        }
        String resultadoFinal = model.calcular();
        
        
        view.tfTotal.setEnabled(true);
        view.tfTotal.setText(String.valueOf(model.getTotalPagar()));
        JOptionPane.showMessageDialog(null, resultadoFinal);

    }

}
