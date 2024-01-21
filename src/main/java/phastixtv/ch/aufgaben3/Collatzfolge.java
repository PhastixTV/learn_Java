package phastixtv.ch.aufgaben3;

import javax.swing.*;

public class Collatzfolge {

    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Gib eine Zahl ein: ");
        int n = Integer.parseInt(eingabe);

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else
                n = 3 * n + 1;

            System.out.println(n);
        }
    }
}
