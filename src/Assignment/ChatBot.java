package Assignment;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ChatBot {
    HashMap<String, String> knowledge = new HashMap<String, String>();
    private JTextArea chatarea = new JTextArea();
    private JTextField chatfield = new JTextField();

    public ChatBot() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("CHATBOT");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(400,500);
        frame.add(chatarea);
        frame.add(chatfield);
        //For chatarea.
        chatarea.setSize(500,450);
        chatarea.setCaretColor(Color.pink);
        chatarea.setLocation(2,2);

        chatfield.setSize(500,30);
        chatfield.setLocation(2,400);

        knowledge.put("Hi", "Hello... Please to meet you!");
        knowledge.put("Hello", "Hi yo");
        knowledge.put("how are you?", "Great! And you?");
        knowledge.put("what time is it", "Look at your watch!");
    }

    public void answer(String question) {
        Set<String> keys = knowledge.keySet();
        for (String key : keys) {
            String lowerKey = key.toLowerCase();
            String lowerQuestion = question.toLowerCase();
            if (lowerKey.contains(lowerQuestion)) {
                System.out.println("Bot: " + knowledge.get(key));
                return;//break
            }
        }
    }

    public void trainMe(String question) {
        System.out.println("Bot: Sorry, Im dumb! How should I reply");
        System.out.print("User suggestion: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        knowledge.put(question, userInput);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = "";
        ChatBot chatbot = new ChatBot();
        while (!userInput.equalsIgnoreCase("stop it")) {
            System.out.print("User: ");
            userInput = sc.nextLine();
            chatbot.answer(userInput);
        }
        sc.close();
    }
}
