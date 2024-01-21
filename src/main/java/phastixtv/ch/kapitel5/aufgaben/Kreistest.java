package phastixtv.ch.kapitel5.aufgaben;

import javax.swing.*;

public class Kreistest {

    public static void main(String[] args) {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Gib hier den Radius an: "));
        Kreis kreis = new Kreis(radius);
        double umfang = kreis.getUmfang();
        double flaeche = kreis.getFlaeche();
        System.out.println("Umfang:" + umfang + " Fläche:" + flaeche);
        kreis.setRadius(2.9734);
        double getRadius = kreis.getRadius();
        System.out.println("neuer Radius: " + getRadius);

    }
}
