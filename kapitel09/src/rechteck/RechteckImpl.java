package rechteck;

/**
 * Aufgabe 5: Klasse RechteckImpl, implementiert das Interface
 * Rechteck. isQuadrat() wird als Default-Methode vom Interface
 * uebernommen.
 */

public class RechteckImpl implements Rechteck{
    private int hoehe;
    private int breite;

    public RechteckImpl(int hoehe, int breite){
        this.hoehe = hoehe;
        this.breite = breite;
    }

    public int getHoehe(){
        return hoehe;
    }

    public int getBreite(){
        return breite;
    }
    
}