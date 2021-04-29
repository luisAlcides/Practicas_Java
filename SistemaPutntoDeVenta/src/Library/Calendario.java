

package Library;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Alcides Blandon
 */
public class Calendario {

    private DateFormat dateFormat;
    private Date date = new Date();
    private Calendar c = new GregorianCalendar();
    private final String FECHA;
    private final String DIA;
    private final String MES;
    private final String ANNIO;
    private final String HORA;
    private String am_pm;
    
    public Calendario(){
        switch(c.get(Calendar.AM_PM)){
            case 0:
                am_pm = "am";
                break;
            case 1:
                am_pm = "pm";
                break;
        }
        dateFormat = new SimpleDateFormat("dd");
        DIA = dateFormat.format(date);
        dateFormat = new SimpleDateFormat("mm");
        MES = dateFormat.format(date);
        dateFormat = new SimpleDateFormat("yyyy");
        ANNIO = dateFormat.format(date);
        dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        FECHA = dateFormat.format(date);
        dateFormat = new SimpleDateFormat("hh:mm:ss");
        HORA = dateFormat.format(date) + " " + am_pm;
        
    }

    public String getFECHA() {
        return FECHA;
    }

    public String getDIA() {
        return DIA;
    }

    public String getMES() {
        return MES;
    }

    public String getANNIO() {
        return ANNIO;
    }

    public String getHORA() {
        return HORA;
    }
    
    
    
}
