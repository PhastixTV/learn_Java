package phastixtv.ch.kapitel5.aufgaben;

import javax.swing.*;

public class Rechtecktest {

    public static void main(String[] args) {
        double laenge = Double.parseDouble(JOptionPane.showInputDialog("Gib hier die länge an: "));
        double breite = Double.parseDouble(JOptionPane.showInputDialog("Gib hier die breite an: "));
        Rechteck rechteck = new Rechteck(laenge, breite);
        System.out.println("Fläche: " + rechteck.getFlaeche() + " " + "Umfang: " + rechteck.getUmfang());
        System.out.println("Diagonale: " + rechteck.getDiagonal());
        System.out.println("Kurze Seite: " + rechteck.getKurzeSeite());
        System.out.println("Lange Seite: " + rechteck.getLangeSeite());
        double newLaenge = Double.parseDouble(JOptionPane.showInputDialog("Gib hier die neue Länge an: "));
        double newBreite = Double.parseDouble(JOptionPane.showInputDialog("Gib hier die neue Breite an: "));
        rechteck.setSeiten(newLaenge, newBreite);
        System.out.println("----------------------");
        System.out.println("Länge: " + rechteck.getLaenge());
        System.out.println("Breite: " + rechteck.getBreite());
        rechteck.laengeAusgeben();
        rechteck.breiteAusgeben();

        double vergroesserteLaenger = Double.parseDouble(JOptionPane.showInputDialog("Gib hier den Wert an, der die Länge vergrössert: "));
        double verkleinerteBreite = Double.parseDouble(JOptionPane.showInputDialog("Gib hier den Wert an, der die Breite kürzt: "));
        rechteck.breiteVerkleinern(verkleinerteBreite);
        rechteck.laengeVergroessern(vergroesserteLaenger);
        System.out.println("----------------------");
        rechteck.seitenAusgeben();


    }
}
