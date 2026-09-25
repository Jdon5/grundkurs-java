package kapitel06;

/**
 * Testet die Klasse Rechteck: Flaeche und Umfang eines normalen
 * Rechtecks sowie eines ueber den Ein-Parameter-Konstruktor
 * erzeugten Quadrats.
 */
public class RechteckTest {

    public static void main(String[] args) {
        Rechteck rechteck1 = new Rechteck(3,2);
        Rechteck rechteck2 = new Rechteck(2);


        // Test1: erwartet -> 6
        double flaeche1 = rechteck1.berechneFlaeche();
        System.out.println("Flaeche beträgt: " + flaeche1 + " FE");

        // Test2: erwartet -> 4
        double flaeche2 = rechteck2.berechneFlaeche();
        System.out.println("Flaeche beträgt: " + flaeche2 + " FE");

        // Test3: erwartet -> 10
        double umfang1 = rechteck1.berechneUmfang();
        System.out.println("Umfang beträgt: " + umfang1 + " FE");

        // Test4: erwartet: 8
        double umfang2 = rechteck2.berechneUmfang();
        System.out.println("Umfang beträgt: " + umfang2 + " FE");
    }
}