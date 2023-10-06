package phastixtv.ch.aufgaben3;

import javax.swing.*;

public class SprunganweisungenWhile {

    public static void main(String[] args) {
        while (true) {
            var eingabe = JOptionPane.showInputDialog("Geben Sie eine Zahl ein: ");
            var x = Integer.parseInt(eingabe);
            if (x > 10) {
                break;
            } else
                System.out.println(x);
        }
    }
}