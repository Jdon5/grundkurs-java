import figur.*;

/**
 * Testet verschiedene Figuren (Kreis, Rechteck) ueber ein Array
 * vom Typ Figur - zeigt Polymorphie: zeichne() und getFlaeche()
 * rufen je nach tatsaechlichem Typ die passende Implementierung auf.
 */
public class FigurTest {

    public static void main(String[] args) {

        Figur[] figur = new Figur[]{new Kreis(5), new Rechteck(5,5)};

        for(Figur i: figur){
            i.zeichne();
            System.out.println(i.getFlaeche());
        }
    }
}