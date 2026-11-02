import fakultaet.*;

/**
 * Testet Fakultaet.fakultaet() mit 0, kleinen und grossen Werten
 * sowie einem negativen Wert.
 */
public class FakultaetTest {
    public static void main(String[] args) {
        // erwartet -> 1
        System.out.println("0! = " + Fakultaet.fakultaet(0));
        // erwartet -> 120
        System.out.println("5! = " + Fakultaet.fakultaet(5));
        // ueber der long-Grenze, erwartet -> 15511210043330985984000000
        System.out.println("25! = " + Fakultaet.fakultaet(25));
        // sehr gross, erwartet -> 16326 Stellen
        System.out.println("5000! hat " + Fakultaet.fakultaet(5000).toString().length() + " Stellen");

        // negativer Wert, erwartet -> IllegalArgumentException
        try {
            Fakultaet.fakultaet(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("-3: " + e.getMessage());
        }
    }
}