package gui;

import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;
// import java.util.*;

class text extends JFrame /* implements ActionListener */ {
    text() {

        super("textInput");

        setLayout(new FlowLayout());

        JLabel r = new JLabel("enter roll: ");
        JTextField tf1 = new JTextField(15);

        JLabel n = new JLabel("enter name: ");
        JTextField tf2 = new JTextField(15);

        JLabel m = new JLabel("enter marks: ");
        JTextField tf3 = new JTextField(15);

        JButton b1 = new JButton("insert");

        JTextArea a1 = new JTextArea(30, 30);

        add(r);
        add(tf1);
        add(n);
        add(tf2);
        add(m);
        add(tf3);
        add(b1);
        add(a1);

    }
}

public class textfield {
    public static void main(String[] args) {
        text f = new text();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
