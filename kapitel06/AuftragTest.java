package kapitel06;

/**
 * AuftragTest
 */
public class AuftragTest {

    public static void main(String[] args) {
        Artikel artikel1 = new Artikel(1, 10);
        Artikel artikel2 = new Artikel(2, 24);
        Artikel artikel3 = new Artikel(3, 25);

        Auftrag auftrag1 = new Auftrag(artikel1, 2);
        Auftrag auftrag2 = new Auftrag(artikel2, 2);
        Auftrag auftrag3 = new Auftrag(artikel3, 2);

        // Test 1: alle drei Auftraege -> erwartet 118.0
        double gesamtwert = Auftrag.getGesamtwert(auftrag1, auftrag2, auftrag3);
        System.out.println("Test 1 (3 Auftraege): " + gesamtwert);

        // Test 2: nur ein einzelner Auftrag -> erwartet 20.0
        double einzelwert = Auftrag.getGesamtwert(auftrag1);
        System.out.println("Test 2 (1 Auftrag): " + einzelwert);

        // Test 3: gar kein Auftrag (leeres Vararg) -> erwartet 0.0
        double leerwert = Auftrag.getGesamtwert();
        System.out.println("Test 3 (0 Auftraege): " + leerwert);

        // Test 4: unterschiedliche Mengen pro Auftrag
        Auftrag auftrag4 = new Auftrag(artikel1, 5);  // 10 * 5 = 50
        Auftrag auftrag5 = new Auftrag(artikel2, 3);  // 24 * 3 = 72
        double gemischt = Auftrag.getGesamtwert(auftrag4, auftrag5);
        System.out.println("Test 4 (unterschiedliche Mengen): " + gemischt); // erwartet 122.0

        // Test 5: setMenge()/setArtikel() nachtraeglich aendern und erneut pruefen
        auftrag1.setMenge(10); // war 2, jetzt 10 -> 10 * 10 = 100
        double nachAenderung = Auftrag.getGesamtwert(auftrag1);
        System.out.println("Test 5 (nach setMenge): " + nachAenderung); // erwartet 100.0

        // Test 6: getArtikel() pruefen - liefert es den richtigen Artikel zurueck?
        Artikel abgerufenerArtikel = auftrag2.getArtikel();
        System.out.println("Test 6 (getArtikel liefert Artikel mit id): " + abgerufenerArtikel.getId()); // erwartet 2
    }
}