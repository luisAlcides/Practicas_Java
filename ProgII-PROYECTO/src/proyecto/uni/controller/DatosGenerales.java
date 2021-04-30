

package proyecto.uni.controller;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import proyecto.uni.model.InteresSimple;


/**
 *
 * @author Alcides Blandon
 */
public class DatosGenerales{

    
    
    
    
    //Lista de elementos de botones de interesSimple
    //IS -> los elementos que terminan IS se refiere a interes simple
    private List<JButton> botonesIS = new ArrayList<>();
    private List<JFormattedTextField> textFieldsIS = new ArrayList<>();
    private List<JRadioButton> radioButtonsIS = new ArrayList<>();
    private List<JLabel> labels = new ArrayList<>();
    
    public void agregarDatos(List<JButton> botones, List<JFormattedTextField> textFields,
            List<JRadioButton> radioButtons,List<JLabel>labels){
        for (int i=0; i < botones.size(); i++) {
            this.botonesIS.add(botones.get(i));
            
        }
        
        for (int i=0; i< textFields.size(); i++) {
            this.textFieldsIS.add(textFields.get(i));
        }
        
        for (int i=0; i< radioButtons.size(); i++) {
            this.radioButtonsIS.add(radioButtons.get(i));
        }
        
        for (int i=0; i< labels.size(); i++) {
            this.labels.add(labels.get(i));
        }
        
    }



    public List<JButton> getBotonesIS() {
        return botonesIS;
    }

    public void setBotonesIS(List<JButton> botonesIS) {
        this.botonesIS = botonesIS;
    }

  
    public List<JRadioButton> getRadioButtonsIS() {
        return radioButtonsIS;
    }

    public void setRadioButtonsIS(List<JRadioButton> radioButtonsIS) {
        this.radioButtonsIS = radioButtonsIS;
    }

    public List<JLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<JLabel> labels) {
        this.labels = labels;
    }

    public List<JFormattedTextField> getTextFieldsIS() {
        return textFieldsIS;
    }

    public void setTextFieldsIS(List<JFormattedTextField> textFieldsIS) {
        this.textFieldsIS = textFieldsIS;
    }
    
    
    
    
            
}
