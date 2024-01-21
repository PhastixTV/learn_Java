package phastixtv.ch.kapitel5.aufgaben;

public class Rechteck {

    private double laenge;
    private double breite;

    public Rechteck(double laenge, double breite) {
        this.breite = breite;
        this.laenge = laenge;
    }

    public void setLaenge(double l) {
        laenge = l;
    }

    public void setBreite(double b) {
        breite = b;
    }

    public void setSeiten(double l, double b) {
        laenge = l;
        breite = b;
    }

    public double getLaenge() {
        return laenge;
    }

    public double getBreite() {
        return breite;
    }

    public double getLangeSeite() {
        if (laenge < breite) {
            System.out.println("Die Breiteseite ist länger");
            return breite;
        } else
            System.out.println("Die Langeseite ist länger");
            return laenge;
    }

    public double getKurzeSeite() {
        if (laenge < breite) {
            System.out.println("Die Langeseite ist kürzer");
            return laenge;
        } else {
            System.out.println("Die Breiteseite ist kürzer");
            return breite;
        }
    }

    public double getDiagonal() {
        double resultat = Math.sqrt((laenge * laenge) + (breite * breite));
        return resultat;
    }

    public double getFlaeche() {
        double resultat = laenge * breite;
        return resultat;
    }

    public double getUmfang() {
        double resultat = laenge + laenge + breite + breite;
        return resultat;
    }

    public void laengeAusgeben() {
        System.out.println("Länge: " + laenge);
    }

    public void breiteAusgeben() {
        System.out.println("Breite: " + breite);
    }

    public void seitenAusgeben() {
        laengeAusgeben();
        breiteAusgeben();
    }

    public void laengeVergroessern(double l) {
        laenge += l;
    }

    public void breiteVergroessern(double b) {
        breite += b;
    }

    public void laengeVerkleinern(double l) {
        laenge -= l;
    }

    public void breiteVerkleinern(double b) {
        breite -= b;
    }
}
