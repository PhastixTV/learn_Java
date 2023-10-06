package phastixtv.ch.aufgaben3;

public class BeispielWhile {

    /*
    Die Java-Syntax lautet:

    while(Bedingung) {
        Anweisung
    }
     */
    public static void main(String[] args) {
        var zahl = 0;

        while (zahl < 101) {
            System.out.println(zahl);
            zahl++;
        }
    }
}
