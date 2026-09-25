package kapitel06;

/**
 * Aufgabe 10: Klasse Rechteck mit Instanzvariablen fuer Laenge und
 * Breite. Ein zweiter Konstruktor mit nur einem Parameter erzeugt
 * ein Quadrat. Bietet Methoden zur Berechnung von Flaeche und Umfang.
 */
public class Rechteck {
    private int laenge;
    private int breite;

    
    public Rechteck(int laenge, int breite){
        this.laenge = laenge;
        this.breite = breite;
    }

    // erzeugt ein Quadrat: Laenge und Breite werden auf denselben Wert gesetzt
    public Rechteck(int laenge){
        this(laenge, laenge);
    }

    // gibt die Laenge des Rechtecks zurück
    public int getLaenge(){
        return laenge;
    }

    // gibt die Breite des Rechtecks zurück
    public int getBreite(){
        return breite;
    }

    // berechnet die Flaeche eines Rechtecks
    public int berechneFlaeche(){
        return laenge * breite;
    }

    // berechnet den Umfang eines Rechtecks
    public int berechneUmfang(){
        return 2*laenge + 2*breite;
    }
}