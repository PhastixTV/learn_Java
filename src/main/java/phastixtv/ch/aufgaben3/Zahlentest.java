package phastixtv.ch.aufgaben3;

import javax.swing.*;

public class Zahlentest {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben Sie eine Zahl ein:"); // Eingabeaufforderung

        if (istDouble(eingabe)) { // Überprüfe, ob die Eingabe eine gültige Zahl ist
            double zahl = Double.parseDouble(eingabe); // Konvertiere die Eingabe in eine Double-Zahl
            if (zahl < 0) {
                JOptionPane.showMessageDialog(null, "Die eingegebene Zahl ist negativ.");
                // Wenn die Zahl negativ ist, zeige entsprechende Nachricht
            } else {
                JOptionPane.showMessageDialog(null, "Die eingegebene Zahl ist nicht negativ.");
                // Wenn die Zahl nicht negativ ist, zeige entsprechende Nachricht
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ungültige Eingabe. Bitte geben Sie eine gültige Zahl ein.");
            // Zeige Fehlermeldung, wenn die Eingabe keine gültige Zahl ist
        }
    }

    // Funktion zur Überprüfung, ob die Eingabe eine gültige Double-Zahl ist
    private static boolean istDouble(String eingabe) {
        try {
            Double.parseDouble(eingabe); // Versuche die Eingabe in Double umzuwandeln
            return true; // Wenn die Umwandlung erfolgreich ist, gebe true zurück
        } catch (NumberFormatException e) {
            return false; // Wenn die Umwandlung fehlschlägt, gebe false zurück
        }
    }
}



