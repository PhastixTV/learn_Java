package phastixtv.ch.aufgaben3;

public class Summation {

    public static void main (String[] args) {
        var n = 100;
        var summe = 0;
        var z = 0;
        while (z < n) {
            var quadrat = z * z;
            z++;
            summe += quadrat;
        }
        System.out.println(summe);
    }
}
