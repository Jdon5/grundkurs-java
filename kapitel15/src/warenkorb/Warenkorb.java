package warenkorb;
import java.util.Vector;
/**
 * Aufgabe 8: Warenkorb, der Artikel in einem Vector sammelt.
 * bestellwert() liefert die Summe aus Preis mal Menge aller Artikel.
 */
public class Warenkorb {
    private Vector warenkorb = new Vector();

    public void add(Artikel artikel) {
        warenkorb.addElement(artikel);
    }

    public double bestellwert() {
        double bestellwert = 0;

        for(Object obj: warenkorb) {
            Artikel k = (Artikel) obj;
            bestellwert += k.getPreis() * k.getMenge();
        }

        return bestellwert;
    }
    
}
