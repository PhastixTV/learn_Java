package phastixtv.ch.aufgaben;

import javax.swing.*;

public class Kreisberechnung4 {

    /*
    Kreisberechnung: Der Radius für einen Kreis und die Einheit
    werden über die Tastatur eingegeben.
    Anschliessend werden der Umfang und der Flächeninhalt berechnet.
     */

    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie den Kreisradius ein:");
        var radius = Double.parseDouble(eingabe);
        eingabe = JOptionPane.showInputDialog("Geben sie die Einheit ein: ");
        var einheit = eingabe;
        var umfang = 2.0 * 3.1415926 * radius;
        var flaeche = 3.1415926 * radius * radius;
        System.out.println("Umfang: ");
        System.out.println(umfang + einheit );
        System.out.println("Fläche: ");
        System.out.println(flaeche + einheit + '\u00b2');
    }
}
