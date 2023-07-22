package phastixtv.ch.aufgaben;

import javax.swing.*;
import java.awt.*;

public class GrussMitProgrammFenster extends JFrame {
    public GrussMitProgrammFenster() {
        super("Hallo");

        /*
        Für Intellij ist es wichtig, dass der Pfad genau ist,
        aber sonst muss das Bild einfach nur im gleichen
        Ordner sein.
        Dann heisst es beim code:
        var icon = new ImageIcon("java-logo.jpg");
         */

        var icon = new ImageIcon("D:\\Keine Games\\Dev\\Java.lernen\\src\\main\\java\\phastixtv\\ch\\aufgaben\\java-logo.jpg");
        var label1 = new JLabel("Viel Erfolg beim", JLabel.CENTER);
        var label2 = new JLabel("Programmieren mit Java!", JLabel.CENTER);
        var label3 = new JLabel(icon);
        var schrift = new Font("SansSerif", Font.BOLD, 24);

        label1.setFont(schrift);
        label1.setForeground(Color.red);
        label2.setFont(schrift);
        label2.setForeground(Color.red);

        var c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.white);
        c.add(label1);
        c.add(label2);
        c.add(label3);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GrussMitProgrammFenster();
    }
}
