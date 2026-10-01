package figur;

/**
 * Aufgabe 4: Klasse Rechteck, abgeleitet von Figur. Implementiert
 * zeichne() und getFlaeche() (laenge * breite).
 */
public class Rechteck extends Figur{ 
    
    private double laenge;
    private double breite;

    public Rechteck(double laenge, double breite){
        this.laenge = laenge;
        this.breite = breite;
    }

    public void zeichne(){
        System.out.println(" ___ ");
        System.out.println("|   |");
        System.out.println(" --- ");
    }
    public double getFlaeche(){
        return laenge*breite;
    }
}