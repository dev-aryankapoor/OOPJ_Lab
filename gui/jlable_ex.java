package gui;

import javax.swing.*;

public class jlable_ex {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("JLabel Example");

        // Create a new JLabel with text
        JLabel label = new JLabel("Hello!");

        // Add the label to the frame
        frame.add(label);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
