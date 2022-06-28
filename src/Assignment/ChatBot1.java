package Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class ChatBot1 extends JFrame {
    private JPanel panel;
    private JPanel panel1, panel2;
    private JTextArea textArea;
    private JTextField textField;

    public ChatBot1 () {

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.pink);
        panel.setBounds(0,0,400,15);

        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(Color.lightGray);
        panel1.setBounds(0,15,400,30);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(Color.PINK);
        panel2.setBounds(0,45,400,500);

        JLabel label = new JLabel();
        label.setBounds(10,380,300,400);
        label.setBackground(Color.WHITE);

        textArea = new JTextArea();
        textArea.setBounds(0,0,400,420);
        textArea.setBackground(Color.WHITE);
        panel2.add(textArea);

        textField = new JTextField();
        textField.setBounds(10,420,300,30);
        textField.setBackground(Color.CYAN);
        panel2.add(textField);

        JButton bt1 = new JButton("Send");
        bt1.setBounds(310,420,100,25);
        bt1.setBackground(Color.WHITE);
        panel2.add(bt1);

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String messagetosend = textField.getText();
                if (messagetosend.isEmpty()) {
                    Box box = new Box(3);
                    JPanel panell = new JPanel();
                    panell.setAlignmentY(CENTER_ALIGNMENT);
                    panell.setAlignmentX(RIGHT_ALIGNMENT);

                    Label label = new Label(messagetosend);


                }
            }
        });

//        bt1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String gtext = textField.getText().toLowerCase();
//                textArea.append("YOU ->" + gtext + "\n");
//                textField.setText("");
//
//                if (gtext.contains("hi")) {
//                    ChatBot1("Hey");
//                }else if (gtext.contains("how")) {
//                    ChatBot1("Great");
//                }else if (gtext.contains("whats up")) {
//                    ChatBot1("I'm fine, and you?");
//                }else if (gtext.contains("whats your name")) {
//                    ChatBot1("I'm a bot, give me a name");
//                }else if (gtext.contains("kloss")) {
//                    ChatBot1("Good");
//                }else {
//                    ChatBot1("I don't get");
//                }
//
//            }
//        });

        JFrame frame = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine (1).png");
        frame.setIconImage(icon);

        frame.setSize(400, 500);
        frame.setTitle("Team Chat");
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.add(panel1);
        frame.add(panel2);

        // Set JFrame to center screen.
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 400;
        int height = 500;
        frame.setBounds(center.x + width / 4, center.y - height / 2, width, height);
        frame.setVisible(true);

    }
    private void ChatBot1(String string) {
        textArea.append("BOT -> " +string + "\n");
    }

    public static void main(String[] args) {

        new ChatBot1();
    }
}
