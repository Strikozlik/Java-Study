package KatySira.GUI;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDrawPanel  extends JPanel  {


    public void paintComponent(Graphics g){
       g.fillRect(0,0,this.getWidth(),this.getHeight());
       int red = (int)(Math.random()*235);
       int green = (int)(Math.random()*235);
       int blue = (int)(Math.random()*235);
       Color randomcolor= new Color(red,green,blue);
       g.setColor(randomcolor);
       g.fillOval(10,10,100,100);
       /* g.fillRect(0,0,this.getWidth(),this.getHeight());
        int red = (int)(Math.random()*255);
        int green = (int)(Math.random()*255);
        int blue = (int)(Math.random()*255);
        Color color = new Color(red,green,blue);
        g.setColor(color);
        g.fillOval(10,10,100,100);*/

       /* Graphics g2d= (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(10,10,Color.BLUE,150,150,Color.orange);
        ((Graphics2D) g2d).setPaint(gradient);
        g2d.fillOval(10,10,100,100);*/
    }
  /*  public void go(){
        JFrame ramka = new JFrame();
        panel = new JPanel();
        ramka.getContentPane().add(panel);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setSize(800,800);
        ramka.setVisible(true);
    }*/
   /* public static void main(String[] args) {
        MyDrawPanel panel1 = new MyDrawPanel();
        panel1.go();
    }
*/
   /* @Override
    public void actionPerformed(ActionEvent e) {

    }*/
}
