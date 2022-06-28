package Threads;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Race implements Runnable {
    String ThreadName;
    JLabel label;
    JPanel panel1, panel2, panel3;
    JFrame frame;

    public Race() {
        buildGUI();

    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Obstacle A")) {
            runObstacleA();
        }
        if (Thread.currentThread().getName().equals("Obstacle B")) {
            runObstacleB();
        }
        if (Thread.currentThread().getName().equals("Obstacle C")) {
            runObstacleC();
        }


    }

    //the Thread.sleep always throws and exceptions so we handle
    // it by putting it in a try and catch block
    public void runObstacleA() {
        Random ran = new Random();
        int s = ran.nextInt(10);
        for (int i = -10; i < 400; i++) {
            panel1.setBounds(i, s, 20, 20);
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
        runObstacleC();

    }

    public void runObstacleB() {
        Random ran = new Random();
        int r = ran.nextInt(180);
        for (int i = -10; i < 400; i++) {
            panel2.setBounds(i, r, 20, 20);

            try {
                Thread.sleep(11);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
        runObstacleA();

    }

    public void runObstacleC() {
        Random ran = new Random();
        int m = ran.nextInt(10);
        for (int i = -10; i < 400; i++) {
            panel3.setBounds(i, m, 20, 20);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        runObstacleB();

    }


    public void buildGUI() {
        frame = new JFrame("Moving Object");
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(400, 200);
        frame.setLayout(null);

        label = new JLabel("");
        label.setBounds(10, 10, 400, 20);
        frame.add(label);

        panel1 = new JPanel();
        panel1.setSize(20, 20);
        panel1.setBackground(Color.green);
        panel1.setBounds(10, 40, 20, 20);
        frame.add(panel1);

        panel2 = new JPanel();
        panel2.setSize(20, 20);
        panel2.setBackground(Color.RED);
        panel2.setBounds(10, 80, 20, 20);
        frame.add(panel2);

        panel3 = new JPanel();
        panel3.setSize(20, 20);
        panel3.setBackground(Color.yellow);
        panel3.setBounds(10, 120, 20, 20);
        frame.add(panel3);
    }

    public static void main(String[] args) {
        Race obj = new Race();
        Thread Obstacle1 = new Thread(obj);
        Thread Obstacle2 = new Thread(obj);
        Thread Obstacle3 = new Thread(obj);

        Obstacle1.setName("Obstacle A");
        Obstacle2.setName("Obstacle B");
        Obstacle3.setName("Obstacle C");

        Obstacle1.start();
        Obstacle2.start();
        Obstacle3.start();
    }
}
