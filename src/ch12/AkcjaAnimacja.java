package ch12;

import javax.swing.*;
import java.awt.*;

public class AkcjaAnimacja {

    private int x = 20;
    private int y = 50;

    public static void main (String[] args) {
        AkcjaAnimacja akcjaAnimacja = new AkcjaAnimacja();
        akcjaAnimacja.rysuj();
    }

    public void rysuj() {
        JFrame ramka = new JFrame();
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setSize(500, 500);
        ramka.setVisible(true);

        var punkt = new Punkt();
        ramka.getContentPane().add(punkt);

        for(int i = 0; i < 50; i++) {

            try {
                Thread.sleep(1000);
                x++;
                y++;
                ramka.getContentPane().add(new Punkt());
                punkt.repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class Punkt extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white); // brakowalo
            g.fillRect(0, 0, this.getWidth(), this.getHeight()); // brakowalo

            g.setColor(Color.black); // brakowalo
            g.fillOval(x, y, 100, 100);
        }
    }
}
