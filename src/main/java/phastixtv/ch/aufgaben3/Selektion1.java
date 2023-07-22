package phastixtv.ch.aufgaben3;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/*
Java Program mit einer if-Abfrage
 */
public class Selektion1 {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben Sie Ihr Alter ein: ");
        var alter = Integer.parseInt(eingabe);
        var url = "https://de.pornhub.com";
        var icon = new ImageIcon("/Users/Philipp/IdeaProjects/learn_Java/src/main/java/phastixtv/ch/aufgaben3/Pornhub-logo.svg.png");
        if (alter < 18) {
            JOptionPane.showMessageDialog(null, "Sorry, noch nicht volljährig!");
        } else {
            JOptionPane.showMessageDialog(null, "Glückwunsch! Sie sind volljährig");
            JOptionPane.showMessageDialog(null, icon);
            openWebsite(url);
            JOptionPane.showMessageDialog(null, "Viel Spass! :)");
        }
    }
    public static void openWebsite(String url) {
        try {
            URI uri = new URI(url);
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }
}
