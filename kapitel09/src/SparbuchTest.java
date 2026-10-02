import displayable.*;

/**
 * Testet Utilities.display() mit zwei Sparbuch-Objekten - zeigt,
 * dass Utilities nur das Interface Displayable kennen muss, nicht
 * die konkrete Klasse Sparbuch.
 */

public class SparbuchTest {

    public static void main(String[] args) {
        Sparbuch sparbuch1 = new Sparbuch(101,2000,0.25);
        Sparbuch sparbuch2 = new Sparbuch(102,2000,0.25);

        Utilities.display(sparbuch1);
        System.out.println();
        Utilities.display(sparbuch2);
    }
}