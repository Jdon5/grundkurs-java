package kunde;

/**
 * Aufgabe 12: Klasse Kunde aus Kapitel 15.2, erweitert um das
 * Interface Comparable. compareTo() vergleicht die Kundennamen,
 * sodass ein Array von Kunden mit Arrays.sort aufsteigend nach
 * dem Namen sortiert werden kann.
 */
public class Kunde implements Comparable {
    private String name;
    private String adresse; 

    public Kunde() {

    }

    public Kunde(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public Kunde(Kunde other) {
        this.name = other.name; 
        this.adresse = other.adresse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse; 
    }

    public String getAdresse() {
        return adresse;
    }

    @Override
    public int compareTo(Object obj) {
        return name.compareTo(((Kunde) obj).getName());
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}