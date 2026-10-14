import stack.*;

/**
 * Testet die Klasse Stapel (verkettete Liste mit Node):
 * push, pop, isEmpty und displayStack, inklusive leerem Stapel
 * und mehr als 10 Elementen (keine Kapazitaetsgrenze mehr).
 */
public class StapelTest {

    public static void main(String[] args) {
        Stapel stapel = new Stapel();

        // Test 1: neuer Stapel ist leer
        // erwartet -> true
        System.out.println("Test 1 - leer: " + stapel.isEmpty());

        // Test 2: drei Werte pushen und anzeigen
        stapel.push(1);
        stapel.push(2);
        stapel.push(3);
        // erwartet -> 3, 2, 1 (oberstes Element zuerst)
        System.out.println("Test 2 - Inhalt nach push(1), push(2), push(3):");
        stapel.displayStack();

        // Test 3: Stapel ist nicht mehr leer
        // erwartet -> false
        System.out.println("Test 3 - leer: " + stapel.isEmpty());

        // Test 4: pop liefert das zuletzt gepushte Element (LIFO)
        // erwartet -> 3
        System.out.println("Test 4 - pop: " + stapel.pop());
        // erwartet -> 2, 1
        System.out.println("Inhalt nach pop:");
        stapel.displayStack();

        // Test 5: Stapel komplett leeren
        // erwartet -> 2, dann 1
        System.out.println("Test 5 - alle restlichen Elemente poppen:");
        while (!stapel.isEmpty()) {
            System.out.println(stapel.pop());
        }
        // erwartet -> true
        System.out.println("leer: " + stapel.isEmpty());

        // Test 6: mehr als 10 Elemente (alte Array-Grenze aus Kapitel 6)
        for (int i = 1; i <= 15; i++) {
            stapel.push(i);
        }
        // erwartet -> 15 bis 1
        System.out.println("Test 6 - Inhalt nach 15x push:");
        stapel.displayStack();
    }
}