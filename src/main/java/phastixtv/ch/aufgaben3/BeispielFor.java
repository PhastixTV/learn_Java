package phastixtv.ch.aufgaben3;

public class BeispielFor {
    /*
    Die Java-Syntax:
    for (Initialisierung; Bedingung; Aktualisierung) {
        Anweisung
    }
     */

    public static void main(String[] args) {
        for (var zahl = 0; zahl < 101; zahl++) {
            System.out.println(zahl);
        }
    }
}
