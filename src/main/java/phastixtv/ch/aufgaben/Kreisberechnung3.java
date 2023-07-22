package phastixtv.ch.aufgaben;

public class Kreisberechnung3 {

    /*
    Kreisberechnung: Für einen Kreis
    werden der Umfang und der Flächeninhalt berechnet.
    Der Radius wird beim Programmstart als erster Parameter und
    die Einheit wird als zweiter Parameter übergeben.
     */

    public static void main(String[] args) {
        var einheit = args[1];
        var radius = Double.parseDouble(args[0]);
        var umfang = 2.0 * 3.1415926 * radius;
        var flaeche = 3.1415926 * radius * radius;
        System.out.println("Umfang: ");
        System.out.println(umfang);
        System.out.println(" " +einheit);
        System.out.println("Fläche: ");
        System.out.println(flaeche);
        System.out.println(" " +einheit + '\u00b2');
    }
}
