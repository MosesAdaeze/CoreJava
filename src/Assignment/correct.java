package Assignment;

import javax.swing.*;
import java.awt.*;

public class correct extends JFrame {
    JPanel panel;
    JLabel label, label2;
    JTextArea textArea;
    JTextField textField;

    public correct() {
        JFrame frame = new JFrame();
        panel = new JPanel();

        label = new JLabel("Kloss",label.LEFT);
        label.setFont(new Font("Verdana", Font.PLAIN, 15));
        label2 = new JLabel("online",label2.CENTER);
        label2.setFont(new Font("Verdana", Font.PLAIN, 10));

        textArea = new JTextArea();
        textField = new JTextField("Type",16);

        panel.add(label);
        panel.add(label2);

        panel.add(textArea);
        textArea.setSize(400,420);
        textArea.setLocation(2,2);
        textArea.setBackground(Color.pink);

        panel.add(textField);

        frame.add(panel);
        frame.setSize(300,400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new correct();
    }
}
