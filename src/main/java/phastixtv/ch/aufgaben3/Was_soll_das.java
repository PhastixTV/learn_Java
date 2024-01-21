package phastixtv.ch.aufgaben3;

import javax.swing.*;

public class Was_soll_das { //Dieses Java-Programm implementiert den Algorithmus
                            // zum Finden des größten gemeinsamen Teilers (GCD) zweier Zahlen m und n.
    public static void main(String[] args) {
        var eingabeM = JOptionPane.showInputDialog("Geben sie M einen Wert: ");
        var eingabeN = JOptionPane.showInputDialog("Geben sie N einen Wert: ");

        int m = Integer.parseInt(eingabeM);
        int n = Integer.parseInt(eingabeN);

        while (m != n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }
            JOptionPane.showMessageDialog(null, m);
        }
    }
}
