import zufall2.*;

/**
 * Testet Zufall2.random(): mehrfache Auswahl aus demselben Array
 * und Verhalten bei einem leeren Array.
 */
public class Zufall2Test {
    public static void main(String[] args) {
        String[] namen = {"Anna", "Ben", "Clara", "David"};

        // mehrere Aufrufe zeigen, dass verschiedene Elemente gewaehlt werden
        for (int i = 0; i < 10; i++) {
            System.out.println(Zufall2.random(namen));
        }

        // leeres Array, erwartet -> IllegalArgumentException
        try {
            Zufall2.random(new String[0]);
        } catch (IllegalArgumentException e) {
            System.out.println("leeres Array: " + e.getMessage());
        }
    }
}