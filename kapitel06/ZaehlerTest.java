package kapitel06;

/**
 * Testet die Klasse Zaehler: Es werden zwei unabhaengige Zaehler-
 * Objekte erzeugt, um zu pruefen, dass jedes Objekt seinen eigenen
 * Zaehlerstand hat (Instanzvariable statt Klassenvariable).
 */
public class ZaehlerTest {

    public static void main(String[] args) {
        Zaehler zaehler1 = new Zaehler();
        Zaehler zaehler2 = new Zaehler();

        // zaehler1: hochzaehlen, hochzaehlen, zuruecksetzen, hochzaehlen -> erwartet 1
        zaehler1.hochzaehlen();
        zaehler1.hochzaehlen();
        zaehler1.zuruecksetzen();
        zaehler1.hochzaehlen();

        // zaehler2: hochzaehlen, hochzaehlen -> erwartet 2
        zaehler2.hochzaehlen();
        zaehler2.hochzaehlen();

        int wert1 = zaehler1.getWert();
        int wert2 = zaehler2.getWert();

        System.out.println(wert1);
        System.out.println(wert2);
    }
}