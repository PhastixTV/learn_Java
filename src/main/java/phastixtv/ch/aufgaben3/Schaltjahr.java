package phastixtv.ch.aufgaben3;

import javax.swing.*;

public class Schaltjahr {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie ihr das Jahr ein: ");
        var jahr = Integer.parseInt(eingabe);

        if ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) {
            JOptionPane.showMessageDialog(null, "Das Jahr " + jahr + " ist ein Schaltjahr!");
        } else
            JOptionPane.showMessageDialog(null, "Das Jahr " + jahr + " ist kein Schaltjahr!");

    }
}
