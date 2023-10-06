package phastixtv.ch.aufgaben3;

import javax.swing.*;

public class Zahlenraten {

    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Gib eine Zahl zwischen 0 und 10 ein: ");
        switch (eingabe) {
            case "6" ->
                JOptionPane.showMessageDialog(null, "Treffer!");
            case "4", "5", "7", "8" ->
                JOptionPane.showMessageDialog(null, "Knapp daneben!");
            default ->
                JOptionPane.showMessageDialog(null, "Daneben!");
        }
    }
}
