package warenkorb;
/**
 * Aufgabe 8: Artikel mit Nummer, Preis und Menge sowie Konstruktor
 * und get/set-Methoden fuer alle drei Attribute.
 */
public class Artikel {

    private int id;
    private double preis;
    private int menge;
    

    public Artikel (int id, double preis, int menge) {
        this.id = id;
        this.preis = preis;
        this.menge = menge;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id; 
    }
}