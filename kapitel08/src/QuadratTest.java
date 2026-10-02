import quadrat.*;

/**
 * Aufgabe 6: Testet Rechteck und Quadrat. Zeigt zunaechst die
 * normalen Methoden, und demonstriert dann das eigentliche
 * Problem: Eine von Rechteck geerbte, oeffentliche Methode wie
 * setBreite() aendert bei Quadrat (durch das Override) heimlich
 * auch die Hoehe mit - obwohl jemand, der nur Rechteck kennt und
 * mit einem Quadrat arbeitet, genau das NICHT erwarten wuerde.
 *
 */
public class QuadratTest {
    public static void main(String[] args) {
        // Normale Nutzung von Rechteck
        Rechteck rechteck = new Rechteck(4, 6);
        System.out.println("Rechteck Flaeche: " + rechteck.getFlaeche());

        // Normale Nutzung von Quadrat
        Quadrat quadrat = new Quadrat(5);
        System.out.println("Quadrat Laenge: " + quadrat.getLaenge());
        System.out.println("Quadrat Flaeche: " + quadrat.getFlaeche());

        quadrat.setLaenge(10);
        System.out.println("Nach setLaenge(10): " + quadrat.getFlaeche());

        // Demonstration des Problems: geerbte Methode auf einem Quadrat
        System.out.println();
        System.out.println("--- Demonstration des Problems ---");
        Quadrat quadrat2 = new Quadrat(5);
        System.out.println("Vorher - Breite: " + quadrat2.getBreite() + ", Hoehe: " + quadrat2.getHoehe());

        quadrat2.setBreite(20); // aendert ungewollt auch die Hoehe mit
        System.out.println("Nach setBreite(20) - Breite: " + quadrat2.getBreite() + ", Hoehe: " + quadrat2.getHoehe());
        System.out.println("Die Hoehe hat sich veraendert, obwohl nur die Breite gesetzt wurde!");
    }
}