package ch12;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame ramka = new JFrame();
        KoloKomponent koloKomponent = new KoloKomponent();
        JButton przycisk = new JButton();
        przycisk.setText("przycisk");

        ramka.add(BorderLayout.CENTER, koloKomponent);
        ramka.add(BorderLayout.SOUTH, przycisk);

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setSize(500, 500);
        ramka.setVisible(true);
    }
}
