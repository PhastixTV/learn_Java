package phastixtv.ch.aufgaben3;

import javax.swing.*;

public class Guthabenentwicklung {

    public static void main(String[] args) {
        float guthaben = Float.parseFloat(JOptionPane.showInputDialog("Geben Sie Ihr Guthaben an:"));
        float zinssatz = Float.parseFloat(JOptionPane.showInputDialog("Geben Sie den aktuellen Zins an:"));

        for (int jahr = 1; jahr <= 10; jahr++) {
            float guthabenEndeJahr = guthaben + (1 + zinssatz / 100);
            System.out.println("Ihr Kontostand beträgt: " + guthabenEndeJahr + " CHF nach " + jahr + " Jahren");
            guthaben = guthabenEndeJahr;
        }
        JOptionPane.showMessageDialog(null, "Kontostand: " + guthaben + " CHF");
    }
}
