package phastixtv.ch.aufgaben;

public class Kreisberechnung {

    /*
    Kreisberechnung: Für einen Kreis mit dem Radius 5 cm
    werden der Umfang und die Fläche berechnet.
     */

    public static void main (String[] args) {
        var radius = 5.0;
        var umfang = 2.0 * 3.1415926 * radius;
        var flaeche = 3.1415926 * radius * radius;
        System.out.println("Umfang:");
        System.out.println(umfang);
        System.out.println("Fläche:");
        System.out.println(flaeche);
    }
}
