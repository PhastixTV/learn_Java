package phastixtv.ch.aufgaben3;

import javax.swing.*;

public class ggT_Euklid {

    public static void main(String[] args) {
        int eingabeM = Integer.parseInt(JOptionPane.showInputDialog("Definieren sie eine ganze Zahl für M:"));
        int eingabeN = Integer.parseInt(JOptionPane.showInputDialog("Definieren sie eine ganze Zahl für N:"));

        int rest = eingabeM % eingabeN;

        while (rest > 0) {
            eingabeM = eingabeN;
            eingabeN = rest;
            rest = eingabeM % eingabeN;
        }

        JOptionPane.showMessageDialog(null, eingabeN);
    }
}
