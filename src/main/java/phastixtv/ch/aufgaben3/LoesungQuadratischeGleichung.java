package phastixtv.ch.aufgaben3;

import javax.swing.*;

public class LoesungQuadratischeGleichung {
    public static void main(String[] args) {
        // Koeffizienten a, b und c aus Benutzereingabe lesen
        double a = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie den Wert für a ein:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie den Wert für b ein:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie den Wert für c ein:"));

        // Berechnung der Diskriminante
        double discriminant = b * b - 4 * a * c;

        // Überprüfen der Anzahl der Lösungen und Ausgabe
        if (discriminant == 0) {
            JOptionPane.showMessageDialog(null, "Die Gleichung hat eine Lösung.");
        } else if (discriminant > 0) {
            JOptionPane.showMessageDialog(null, "Die Gleichung hat zwei Lösungen.");
        } else
            JOptionPane.showMessageDialog(null, "Die Gleichung hat keine Lösung.");
    }
}
