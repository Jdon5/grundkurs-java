package kapitel06;

/**
 * Testet alle Methoden der Klasse Sparbuch: Einzahlen, Abheben,
 * hypothetische Ertragsberechnung, tatsaechliche Verzinsung sowie
 * die drei Getter.
 */
public class SparbuchTest {

    public static void main(String[] args) {
        Sparbuch sparbuch1 = new Sparbuch(2214,2000,.025);

        sparbuch1.hebeAb(100);
        sparbuch1.zahleEin(850);

        // hypothetischer Ertrag nach 3 Jahren, kapital bleibt unveraendert
        double ertrag = sparbuch1.getErtrag(3);
        System.out.println("Ertrag nach 3 Jahren (hypothetisch): " + ertrag);

        double kapital = sparbuch1.getKapital();
        System.out.println("Kapital vor Verzinsung: " + kapital);

        // verzinse() veraendert das Kapital jetzt tatsaechlich
        sparbuch1.verzinse();
        kapital = sparbuch1.getKapital();
        System.out.println("Kapital nach Verzinsung: " + kapital);

        int kontonummer = sparbuch1.getKontonummer();
        System.out.println("Kontonummer: " + kontonummer);
    }
}