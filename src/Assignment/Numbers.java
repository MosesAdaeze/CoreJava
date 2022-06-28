package Assignment;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Numbers extends JFrame {
    Numbers()
    {
        setLayout(new FlowLayout());
        JTextField num = new JTextField("Enter: ", 20);
        add(num);

    }
    public static void main(String[] args) {
        int num;
        int temp;
        boolean isprime = true;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter any Number:  ");
        num = reader.nextInt();

        {
            Numbers frame = new Numbers();
            frame.setTitle("User");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300,400);
            frame.setVisible(true);
        }

        if (num % 2 == 0) {
            System.out.println(num + " This Number inputted is an even number. ");
            for (int i = 2; i <= num / 2; i++) {
                temp = num % i;
                if (temp == 0) {
                    isprime = false;
                }
                break;
            }
            if (isprime) System.out.println(num + " is a Prime Number");
            else System.out.println(num + " is not a Prime Number");
        }
        //If isPrime is true then the number is prime else not
        else {
            System.out.println(num  + " This number inputted is an odd number. ");
        }
    }
}

