package Library;

import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author Alcides Blandon
 */
public class Paginador<T> {

    private List<T> dataList;
    private  JLabel label;
    private static int maxReg, regPorPagina, pageCount, numPagi = 1;

    public Paginador(List<T> dataList, JLabel label, int regPorPagina) {
        this.dataList = dataList;
        this.label = label;
        this.regPorPagina = regPorPagina;
        cargarDatos();
    }

    private void cargarDatos() {
        numPagi = 1;
        maxReg = dataList.size();
        pageCount = (maxReg / regPorPagina);

        if ((maxReg % regPorPagina) > 0) {
            pageCount += 1;
        }

        label.setText("Pagina 1/" + pageCount);

    }

    public int primero() {
        numPagi = 1;
        label.setText("Paginas " + numPagi + "/" + pageCount);
        return numPagi;
    }

    public int anterior() {
        if (numPagi > 1) {
            numPagi -= 1;
            label.setText("Paginas " + numPagi + "/" + pageCount);
        }

        return numPagi;
    }

    public int siguiente() {
        if (numPagi == pageCount) {
            numPagi -= 1;
        }
        if (numPagi < pageCount) {
            numPagi += 1;
            label.setText("Paginas " + numPagi + "/" + pageCount);
        }

        return numPagi;
    }

    public int ultimo() {
        numPagi = pageCount;
        label.setText("Paginas " + numPagi + "/" + pageCount);
        return numPagi;
    }
}
