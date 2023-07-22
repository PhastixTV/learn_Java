package phastixtv.ch.aufgaben2;

import javax.swing.*;

public class Kreisberechnung4OptionPane {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein: ");
        var radius = Double.parseDouble(eingabe);
        eingabe = JOptionPane.showInputDialog("Geben Sie die Einheit ein: ");
        var einheit = eingabe;
        var umfang = 2.0 * 3.1415926 * radius;
        var flaeche = 3.1415926 * radius * radius;
        JOptionPane.showMessageDialog(null, "Umfang: " + umfang + " " + einheit + "\nFläche: " +
                flaeche + " " + einheit + " " + '\u00b2');
    }
}
