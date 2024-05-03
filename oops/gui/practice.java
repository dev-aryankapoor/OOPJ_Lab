package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class budgir extends JFrame implements ActionListener {
    JLabel l1;
    JLabel l2;
    JButton b;
    JTextField f1;
    JTextField f2;
    // int count = 0;

    budgir() {
        super("practice");

        // setLayout(new FlowLayout());
        setLayout(new FlowLayout());

        l1 = new JLabel("enter a number");
        l2 = new JLabel("output");
        b = new JButton("factorial");
        f1 = new JTextField(20);
        f2 = new JTextField(20);

        add(l1);
        add(l2);
        add(b);
        add(f1);
        add(f2);

        b.addActionListener(this);
        // f.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String in = f1.getText();
        int a = Integer.parseInt(in);

        if (ae.getSource() == b) {
            int res = 1, i;
            int ans = 1;
            for (i = 1; i <= a; i++) {
                ans = res * i;
            }
            String ansf = String.valueOf(ans);
            f2.setText(ansf);
        }
    }
}

public class practice {
    public static void main(String[] args) {
        budgir fr = new budgir();
        fr.setSize(500, 500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
