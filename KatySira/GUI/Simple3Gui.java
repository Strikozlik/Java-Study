package KatySira.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* change button color*/

public class Simple3Gui implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        Simple3Gui gui = new Simple3Gui();
        gui.go();
    }
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("change color");
        JButton button1 = new JButton("change text");
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.getContentPane().add(BorderLayout.WEST,button1);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.setSize(400,400);
        frame.setVisible(true);
    }








    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}
