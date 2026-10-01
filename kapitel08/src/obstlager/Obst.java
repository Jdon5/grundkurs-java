
package obstlager;

/**
 * Aufgabe 5: Abstrakte Klasse Obst mit den Attributen name und
 * farbe sowie den abstrakten Methoden getName() und getFarbe(),
 * die von jeder konkreten Obstsorte implementiert werden.
 */
public abstract class Obst {

    protected String name;
    protected String farbe;

    public Obst(String name, String farbe){
        this.name = name;
        this.farbe = farbe;
    }

    public abstract String getName();
    public abstract String getFarbe();
    
}