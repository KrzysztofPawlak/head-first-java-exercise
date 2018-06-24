package ch12;

import javax.swing.*;
import java.awt.*;

public class KoloKomponent extends JPanel {

    public void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        var randomKolor = (int) (Math.random() * 256);
        Color kolor = new Color(randomKolor);

        g2D.setColor(kolor);
        g2D.fillOval(50, 50, 100, 100);
    }
}
