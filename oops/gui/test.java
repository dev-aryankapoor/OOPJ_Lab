package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class frame extends JFrame implements ActionListener {
    JLabel label1, label2;
    JButton button, button1;
    JTextField text, text1;

    frame() {
        JFrame frame = new JFrame();
        JButton button = new JButton("FACTORIAL");
        JButton button1 = new JButton("SQUARE");
        JLabel label = new JLabel();
        JLabel label1 = new JLabel();
        JTextField text = new JTextField();
        JTextField text1 = new JTextField();

        label.setText("ENTER A NUMBER : ");
        label.setBounds(40, 20, 500, 50);
        label1.setText("OUTPUT : ");
        label1.setBounds(40, 90, 500, 50);

        text.setBounds(600, 20, 150, 50);
        // text1.setText("Enter a Number : ");
        text1.setBounds(600, 90, 150, 50);
        // text2.setText("Enter a Number : ");

        button.setBounds(10, 500, 90, 50);
        button1.setBounds(120, 500, 90, 50);

        frame.add(label);
        frame.add(label1);
        frame.add(button);
        frame.add(button1);
        frame.add(text);
        frame.add(text1);

        button.addActionListener(this);
        button1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String t = text.getText();
        int a = Integer.parseInt(t);

        if (e.getSource() == button) {
            int res = 1, i;
            for (i = 1; i < a; i++) {
                res = res * i;
            }
            String fact = String.valueOf(res);
            text1.setText(fact);
        }

        if (e.getSource() == button1) {
            int res;
            res = a * a;
            String sq = String.valueOf(res);
            text1.setText(sq);
        }
    }
}

public class test {
    public static void main(String[] args) {

        frame fr = new frame();
        fr.setSize(900, 600);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
