package Viernes.Controlador;

import Viernes.Modelo.CReciboEnvio;
import Viernes.Vista.JfrmReciboEnvio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Alcides Blandon
 */
public class CCReciboEnvio implements ActionListener, ItemListener {

    JfrmReciboEnvio view = new JfrmReciboEnvio();
    CReciboEnvio model = new CReciboEnvio();

    public CCReciboEnvio(JfrmReciboEnvio view, CReciboEnvio model) {
        this.view = view;
        this.model = model;
        this.view.btnCalcular.addActionListener((ActionListener) this);
        this.view.cmbMoneda.addItemListener(this);

    }

    public void iniciar() {
        view.setTitle("Recibo y envio de dinero");
        view.cmbMoneda.setSelectedIndex(2);
        view.setLocationRelativeTo(null);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == view.cmbMoneda) {

            if (view.cmbMoneda.getSelectedItem().equals("Cordoba")) {
                view.tfTasaCambio.setEnabled(false);
                view.tfTasaCambio.setText("");
                view.tfMonto.setText("");
                view.tfImporte.setText("");
                view.tfComision.setText("");
                view.tfTotalPagar.setText("");
                view.tfComision.setEnabled(false);
                view.tfImporte.setEnabled(false);
                view.tfTotalPagar.setEnabled(false);
                view.tfImporte.setEditable(false);
                view.tfComision.setEditable(false);
                view.tfTotalPagar.setEditable(false);
            } else {
                view.tfTasaCambio.setEnabled(true);
                view.tfTasaCambio.setText("");
                view.tfMonto.setText("");
                view.tfImporte.setText("");
                view.tfComision.setText("");
                view.tfTotalPagar.setText("");
                view.tfComision.setEnabled(false);
                view.tfImporte.setEnabled(false);
                view.tfTotalPagar.setEnabled(false);
                view.tfImporte.setEditable(false);
                view.tfComision.setEditable(false);
                view.tfTotalPagar.setEditable(false);

            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == view.cmbMoneda.getSelectedItem()){
//                view.tfTasaCambio.disable();
        if (e.getSource() == view.btnCalcular) {
            if (!view.tfTasaCambio.isEnabled()) {

                model.setMonto(Double.parseDouble(view.tfMonto.getText()));
                model.calcular("Cordoba");
                view.tfImporte.setText(String.valueOf(model.getImporte()));
                view.tfComision.setText(String.valueOf(model.getComision()));
                view.tfTotalPagar.setText(String.valueOf(model.getTotalPagar()));
                view.tfComision.setEnabled(true);
                view.tfImporte.setEnabled(true);
                view.tfTotalPagar.setEnabled(true);
            } else {
                model.setMonto(Double.parseDouble(view.tfMonto.getText()));
                model.setTasaCambio(Double.parseDouble(view.tfTasaCambio.getText()));
                model.calcular("Dolares");
                view.tfImporte.setText(String.valueOf(model.getImporte()));
                view.tfComision.setText(String.valueOf(model.getComision()));
                view.tfTotalPagar.setText(String.valueOf(model.getTotalPagar()));
                view.tfComision.setEnabled(true);
                view.tfImporte.setEnabled(true);
                view.tfTotalPagar.setEditable(false);
                view.tfTotalPagar.setEnabled(true);
            }

//                view.tfMonto.setText("");
//                view.tfTasaCambio.setText("");
//                view.tfComision.setText("");
//                view.tfImporte.setText("");
//                view.tfTotalPagar.setText("");
//                view.cmbMoneda.setSelectedIndex(-1);
        }
    }

}

//}
