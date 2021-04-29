package ViewModels;

import Conexion.Consult;
import Models.TConfiguraciones;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JRadioButton;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

/**
 *
 * @author Alcides Blandon
 */
public class ConfiguracionesVM extends Consult {

    public static String moneda;
    private static List<JRadioButton> radio;
    private String sqlConfig;

    public ConfiguracionesVM() {
        tipoMoneda();
    }

    public ConfiguracionesVM(List<JRadioButton> radio) {
        this.radio = radio;
        radioEvento();
        tipoMoneda();

    }

    private void radioEvento() {
        radio.get(0).addActionListener((ActionEvent e) -> {
            tipoMoneda("$.", radio.get(0).isSelected());
        });

        radio.get(1).addActionListener((ActionEvent e) -> {
            tipoMoneda("C$.", radio.get(1).isSelected());

        });
    }

    private void tipoMoneda() {
        this.sqlConfig = "INSERT INTO tconfiguraciones(tipoMoneda) VALUES(?)";
        List<TConfiguraciones> config = config();
        final QueryRunner QR = new QueryRunner(true);

        if (config.isEmpty()) {
            moneda = "$.";
            Object[] dataConfig = {moneda};
            try {
                QR.insert(getConn(), sqlConfig, new ColumnListHandler(), dataConfig);
            } catch (SQLException ex) {
                System.out.println("Error: " + ex);
            }
        } else {
            TConfiguraciones data = config.get(0);
            moneda = data.getTipoMoneda();
            switch (moneda) {
                case "$.":
                    radio.get(0).setSelected(true);
                    break;
                case "C$.":
                    radio.get(1).setSelected(true);
                    break;

            }
        }
    }

    private void tipoMoneda(String tipoMoneda, boolean valor) {

        final QueryRunner QR = new QueryRunner(true);
        if (valor) {
            try {
                List<TConfiguraciones> config = config();
                if (config.isEmpty()) {
                    this.sqlConfig = "INSERT INTO tconfiguraciones(tipoMoneda) VALUES(?)";
                    moneda = tipoMoneda;
                    Object[] dataConfig = {moneda};
                    QR.insert(getConn(), sqlConfig, new ColumnListHandler(), dataConfig);
                } else {
                    TConfiguraciones data = config.get(0);
                    this.sqlConfig = "UPDATE tconfiguraciones SET tipoMoneda=? WHERE id=" +data.getId();

                    if (data.getTipoMoneda().equals(tipoMoneda)) {
                        moneda = tipoMoneda;
                    } else {
                        moneda = tipoMoneda;
                        Object[] dataConfig = {moneda};
                        QR.update(getConn(), sqlConfig, dataConfig);
                    }
                }
            } catch (SQLException ex) {

            }

        }

    }
}
