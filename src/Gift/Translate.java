package Gift;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Translate extends JFrame {
    JPanel panel;
    JButton button1, button2;
    JLabel label1, label2, label3;

    public Translate(){
        JFrame frame = new JFrame();

        label1 = new JLabel("Three");
        label2 = new JLabel("Four");
        label3 = new JLabel("Five");

        button1 = new JButton("Translate to Italian");
        button2 = new JButton("Translate to Korea");

        panel = new JPanel();
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(button1);
        panel.add(button2);

        frame.setResizable(false);
        frame.setTitle("Translator");
        frame.setVisible(true);
        frame.setSize(500,300);
        frame.add(panel);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }

    public static void main(String[] args) {
        Translate run = new Translate();
    }
}
