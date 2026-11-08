import java.util.Arrays;
import shuffle.*;

/**
 * Testet Shuffle.shuffleArray(): Das Array wird direkt veraendert,
 * die Reihenfolge ist zufaellig, und es gehen keine Elemente
 * verloren oder kommen doppelt vor.
 */
public class ShuffleTest {
    public static void main(String[] args) {
        int[] zahlen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] original = zahlen.clone();   // Kopie zum spaeteren Vergleich

        System.out.println("vorher:  " + Arrays.toString(zahlen));

        // mehrmals mischen: jede Ausgabe sollte anders aussehen
        for (int i = 1; i <= 3; i++) {
            Shuffle.shuffleArray(zahlen);
            System.out.println("Mischung " + i + ": " + Arrays.toString(zahlen));
        }

        // Pruefung: sortiert muessen wieder genau die Ausgangswerte herauskommen
        int[] sortiert = zahlen.clone();
        Arrays.sort(sortiert);
        // erwartet -> true
        System.out.println("gleiche Elemente wie vorher: " + Arrays.equals(sortiert, original));

        // Randfaelle: leeres Array und ein einzelnes Element
        int[] leer = {};
        Shuffle.shuffleArray(leer);
        // erwartet -> []
        System.out.println("leeres Array: " + Arrays.toString(leer));

        int[] eins = {42};
        Shuffle.shuffleArray(eins);
        // erwartet -> [42]
        System.out.println("ein Element: " + Arrays.toString(eins));
    }
}