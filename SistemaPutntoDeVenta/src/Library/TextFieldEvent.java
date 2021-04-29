package Library;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Alcides Blandon
 */
public class TextFieldEvent {

    public void textKeyPresses(KeyEvent evt) {

        //Declaramos una variable y le asignamos un evento
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }

    public void numberKeyPress(KeyEvent evt) {
        //Declaramos una variable y le asignamos un evento

        char car = evt.getKeyChar();

        if ((car < '0' | car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }

    public boolean isEmail(String correo) {
        Pattern pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = pat.matcher(correo);
        
        return mat.find();
    }
}
