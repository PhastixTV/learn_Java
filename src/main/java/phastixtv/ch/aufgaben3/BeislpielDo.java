package phastixtv.ch.aufgaben3;

public class BeislpielDo {

    /*
    Die Java-Syntax:
    do {
        Anweisung
    } while (Bedingung);
     */

    public static void main(String[] args) {
        var zahl = 0;
        do {
            System.out.println(zahl);
            zahl++;
        } while (zahl < 101);
    }
}
