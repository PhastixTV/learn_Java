package phastixtv.ch.kapitel5;

public class Bruchtest1 {

    public static void main(String[] args) {
        Bruch bruch = new Bruch();
        bruch.zaehler = 300000;
        bruch.nenner = 400;
        bruch.erweitern(9);
        bruch.ausgeben();
    }
}
