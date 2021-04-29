package ModelClass;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author Alcides Blandon
 */
public class TextFieldEvent {

    public void textKeyPress(KeyEvent evt) {

        //Declaramos una variable y le asignamos un evento
        char car = evt.getKeyChar();

        //Condicion que nos permite ingresar datos de tipo texto
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();

        }
    }

    public void numberKeyPress(KeyEvent evt) {
        //Declaramos una variable y le asignamos un evento
        char car = evt.getKeyChar();

        //Condicion que nos permite ingresar datos numericos con su punto decimal
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();

        }
    }
    
    public void numberDecimalKeyPress(KeyEvent evt, JTextField textField){
        
        char car = evt.getKeyChar();
        
        if((car < '0' || car > '9') && textField.getText().contains(".")
                && (car != (char) KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }else if((car < '0' || car > '9') && (car != '.')
                && (car != (char) KeyEvent.VK_BACK_SPACE)){
            
        }
    }
    
    public boolean isEmail(String correo){
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        mat = pat.matcher(correo);
        if(mat.find()){
            return true;
        }else{
            return false;
        }
    }
    
}
