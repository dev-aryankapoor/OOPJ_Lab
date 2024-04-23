package gui;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myFrame extends JFrame implements ActionListener {
    JLabel l;
    JButton b;
    int count = 0;

    myFrame() {
        super("swing demo");

        setLayout(new FlowLayout());

        l = new JLabel("fucked " + count + " times.");
        b = new JButton("prakhar randi");

        add(l);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        count++;
        l.setText("fucked " + count + " times.");
    }

}

public class swing {
    public static void main(String[] args) {
        myFrame f = new myFrame();
        f.setSize(500, 500);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
