import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setVisible(true);

        JLabel label = new JLabel();
        frame.add(label);
        label.setText("Hola mundo");


    }
}
