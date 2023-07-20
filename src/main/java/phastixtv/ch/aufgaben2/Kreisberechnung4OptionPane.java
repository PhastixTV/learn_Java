package phastixtv.ch.aufgaben2;

import javax.swing.*;

public class Kreisberechnung4OptionPane {

    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein: ");
        var radius = Double.parseDouble(eingabe);
        eingabe = JOptionPane.showInputDialog("Geben sie die Einheit an: ");
        var einheit = eingabe;
        var umfang = 2.0 * 3.1415926 * radius;
        var flaeche = radius * radius * 3.1415926;
        JOptionPane.showMessageDialog(null, "Umfang: " + umfang + " " + einheit +
                                        "\nFläche: " + flaeche + " " + einheit + '\u00b2');
    }
}
