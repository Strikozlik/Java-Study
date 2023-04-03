package KatySira.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiSraka implements ActionListener {
    JButton knopka;
    JButton klacka;
    public void gogogo(){
        JFrame ramka = new JFrame();
        knopka = new JButton("нажми на мене");
        klacka = new JButton("і мене нажми");
        knopka.addActionListener(this);
        klacka.addActionListener(this);

        ramka.getContentPane().add(knopka);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setSize(300,300);
        ramka.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        knopka.setText("ай больно казліна");
        klacka.setText("опа круто");
    }

    public static void main(String[] args) {
        GuiSraka sraka = new GuiSraka();
        sraka.gogogo();
    }
}
