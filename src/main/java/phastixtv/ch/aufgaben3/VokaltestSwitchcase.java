package phastixtv.ch.aufgaben3;

import javax.swing.*;

public class VokaltestSwitchcase {

    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben Sie einen Buchstaben ein: ");
        var c = eingabe.charAt(0);
        switch (c) {
            case 'a','e','i','o','u':
                JOptionPane.showMessageDialog(null, c + "ist ein Vokal!");
                break;
            default:
                JOptionPane.showMessageDialog(null, c + " ist kein Vokal!");
        }
    }
}
