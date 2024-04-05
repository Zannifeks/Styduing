package lesson31;

import javax.swing.*;
import java.awt.*;

public class HelloSwing extends JFrame{
    public static void main(String[] args) {
        new HelloSwing();
    }

    public HelloSwing() {
        setTitle("Hello, Swing!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.white);

        JButton b1 = new JButton("Draw");
        JButton b2 = new JButton("Exit");

        //btnDraw.addActionListener();

        Panel btnPanel = new Panel();
        btnPanel.setLayout(new GridLayout());
        btnPanel.add(b1);
        btnPanel.add(b2);

        add(btnPanel,BorderLayout.SOUTH);

        setVisible(true);
    }

    private class Canvas extends JPanel {
        @Override
        public void print(Graphics g) {
            super.print(g);
        }
    }
}
