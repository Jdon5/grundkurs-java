package figur;

/**
 * Aufgabe 4: Klasse Kreis, abgeleitet von Figur. Implementiert
 * zeichne() und getFlaeche() (PI * radius^2).
 */
public class Kreis extends Figur{

    private double radius;
    private final double PI = 3.14159;

    public Kreis(double radius){
        this.radius = radius;
    }


    public void zeichne(){
        System.out.println("( )");
    }

    public double getFlaeche(){
        return PI*radius*radius;
    }
}