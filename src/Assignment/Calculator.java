package Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    JButton one, two, three, four, five, six, seven, eight, nine, num0,
            add, sub, div, mult, equalto, exit, point, reset;
    String s = "";
    JFrame f;
    JTextField textfield;

    public Calculator() {
//        Container container = getContentPane();
//        container.setLayout(new FlowLayout());

//        JLabel jl = new JLabel(" My Demo Calculator ");

        textfield = new JTextField(16);

        one = new JButton("1");
        one.setBackground(Color.white);

        two = new JButton("2");
        two.setBackground(Color.white);

        three = new JButton("3");
        three.setBackground(Color.white);

        four = new JButton("4");
        four.setBackground(Color.white);

        five = new JButton("5");
        five.setBackground(Color.white);

        six = new JButton("6");
        six.setBackground(Color.white);

        seven = new JButton("7");
        seven.setBackground(Color.white);

        eight = new JButton("8");
        eight.setBackground(Color.white);

        nine = new JButton("9");
        nine.setBackground(Color.white);

        num0 = new JButton(" 0 ");
        num0.setBackground(Color.white);

        //Symbols
        add = new JButton(" + ");
        add.setBackground(Color.ORANGE);

        sub = new JButton(" - ");
        sub.setBackground(Color.ORANGE);

        div = new JButton(" / ");
        div.setBackground(Color.orange);

        mult = new JButton(" * ");
        mult.setBackground(Color.orange);

        equalto = new JButton(" = ");
        equalto.setBackground(Color.orange);

        exit = new JButton(" Exit ");
        exit.setBackground(Color.orange);

        point = new JButton(" . ");
        point.setBackground(Color.orange);

        reset = new JButton("C");
        reset.setBackground(Color.orange);

//        container.add(jl);
//        container.add(textfield);

        JPanel p = new JPanel();
        p.add(textfield);
        p.add(one);
        p.add(two);
        p.add(three);
        p.add(four);
        p.add(five);
        p.add(six);
        p.add(seven);
        p.add(eight);
        p.add(nine);
        p.add(num0);
        p.add(equalto);
        p.add(mult);
        p.add(add);
        p.add(sub);
        p.add(div);
        p.add(point);
        p.add(reset);
        p.add(exit);
        p.setBackground(Color.pink);


        // listener
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        num0.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);
        equalto.addActionListener(this);
        exit.addActionListener(this);
        point.addActionListener(this);
        reset.addActionListener(this);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setTitle("Calculator");
        c.setVisible(true);
        c.setSize(200, 220);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o == one) {
            textfield.setText(s.concat("1"));
            s = textfield.getText();
        } else {
            System.out.println("Done");
        }
    }
}

