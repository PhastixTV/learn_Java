package phastixtv.ch.aufgaben3;

public class ZahlendreieckDo {
    public static void main(String[] args) {
        var reihe = 0;
        do {
            int zahl = 0;
            do {
                System.out.print(zahl + " ");
                zahl++;
            }while (zahl <= reihe);
            System.out.println();
            reihe++;
        } while (reihe < 10);
    }
}
