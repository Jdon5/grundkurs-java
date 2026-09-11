package kapitel06;

/**
 * Aufgabe 4: Klasse Zaehler mit einer Instanzvariable, die mit
 * hochzaehlen() um 1 erhoeht, mit zuruecksetzen() auf 0 gesetzt
 * und mit getWert() ausgelesen werden kann.
 */
public class Zaehler {
    private int zaehler;

    public void hochzaehlen(){
        zaehler++;
    }

    public void zuruecksetzen(){
        zaehler=0;
    }

    public int getWert(){
        return zaehler;
    }
}