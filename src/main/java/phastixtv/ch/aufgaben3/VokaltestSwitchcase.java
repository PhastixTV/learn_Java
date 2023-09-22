package phastixtv.ch.aufgaben3;

import javax.swing.*;

public class VokaltestSwitchcase {

    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben Sie einen Buchstaben ein: ");
        var c = eingabe.charAt(0);
        switch (c) {
            //Man könnte auch alle einzeln abfragen, aber das wäre unnötige Arbeit. Work smart and not hard |
            case 'a','e','i','o','u':                                                                // <----
                JOptionPane.showMessageDialog(null, c + "ist ein Vokal!");
                break;
            default:
                JOptionPane.showMessageDialog(null, c + " ist kein Vokal!");

                /* Eine Möglickeit wäre auch
                    switch(c) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        JOptionPane.showMessageDialog(null, c + "ist ein Vokal!");
                        break;
                     default:
                        JOptionPane.showMessageDialog(null, c + " ist kein Vokal!");
                 */
        }
    }
}
