package kapitel06;

/**
 * Aufgabe 9: Klasse Artikel speichert Nummer (id) und Preis (preis)
 * eines Artikels, mit Konstruktor sowie Get-/Set-Methoden fuer
 * beide Attribute.
 */
public class Artikel {

    private int id;
    private double preis;
    
    public Artikel(int id, double preis){
        this.id = id;
        this.preis = preis;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getPreis(){
        return preis;
    }

    public void setPreis(double preis){
        this.preis = preis;
    }
}