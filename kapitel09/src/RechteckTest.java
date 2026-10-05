import rechteck.*;
/**
 * Testet RechteckImpl: isQuadrat() fuer Quadrat und Nicht-Quadrat
 * sowie Rechteck.compare() fuer alle drei Ergebnisse (-1, 0, 1).
 */
public class RechteckTest {

    public static void main(String[] args) {
        RechteckImpl rechteck1 = new RechteckImpl(2,3);
        RechteckImpl rechteck2 = new RechteckImpl(3,2);
        RechteckImpl rechteck3 = new RechteckImpl(2, 2);


        // Vergleiche zwischen zweier Rechtecke
        //erwartet -> 0
        System.out.println(Rechteck.compare(rechteck1, rechteck2));
        //erwartet -> 1
        System.out.println(Rechteck.compare(rechteck2, rechteck3));
        //erwartet -> -1
        System.out.println(Rechteck.compare(rechteck3, rechteck2));

        // Überprueft, ob ein Rechteck ein Quadrat ist
        // erwartet -> true
        System.out.println(rechteck3.isQuadrat());
        // erwartet -> false
        System.out.println(rechteck1.isQuadrat());
    }
}