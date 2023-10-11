package phastixtv.ch.aufgaben3;

public class ZahlendreieckWhile {
    public static void main(String[] args) {
        var reihe = 0;
        while (reihe < 10) {
            int zahl = 0;
            while (zahl <= reihe) {
                System.out.print(zahl + " ");
                zahl++;
            }
            System.out.println(); //Neue Reihe eröffnet
            reihe++;                                    // Von hier aus fängt der ganze Prozess von neu an!
                                                        // Die Variable "zahl" wird wieder zu 0!
        }
    }
}
