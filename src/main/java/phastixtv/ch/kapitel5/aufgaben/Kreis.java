package phastixtv.ch.kapitel5.aufgaben;

public class Kreis {
    double radius;
    double umfang;
    double flaeche;

    public Kreis(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getUmfang() {
        umfang= radius * 2 * 3.1415926536;

        return umfang;
    }

    public double getFlaeche() {
        flaeche = radius * radius * 3.1415926536;
        return flaeche;
    }

    public void setUmfang(double u){
        umfang = u;
    }

    public void setFlaeche(double f) {
        flaeche = f;
    }


}
