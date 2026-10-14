import queue.*;

/**
 * Testet die Klasse Queue (verkettete Liste mit head und tail):
 * enter, leave, isEmpty und displayQueue nach dem FIFO-Prinzip,
 * inklusive leerer Schlange und erneutem Befuellen nach dem Leeren.
 */
public class WarteschlangeTest {

    public static void main(String[] args) {
        Warteschlange queue = new Warteschlange();

        // Test 1: neue Schlange ist leer
        // erwartet -> true
        System.out.println("Test 1 - leer: " + queue.isEmpty());

        // Test 2: drei Werte einfuegen und anzeigen
        queue.enter(1);
        queue.enter(2);
        queue.enter(3);
        // erwartet -> 1, 2, 3 (Reihenfolge des Einfuegens)
        System.out.println("Test 2 - Inhalt nach enter(1), enter(2), enter(3):");
        queue.displayQueue();

        // Test 3: leave liefert das zuerst eingefuegte Element (FIFO)
        // erwartet -> 1
        System.out.println("Test 3 - leave: " + queue.leave());
        // erwartet -> 2, 3
        System.out.println("Inhalt nach leave:");
        queue.displayQueue();

        // Test 4: Schlange komplett leeren
        // erwartet -> 2, dann 3
        System.out.println("Test 4 - alle restlichen Elemente entnehmen:");
        while (!queue.isEmpty()) {
            System.out.println(queue.leave());
        }
        // erwartet -> true
        System.out.println("leer: " + queue.isEmpty());

        // Test 5: nach dem Leeren wieder befuellen
        // prueft, dass head und tail nach dem Leeren korrekt zurueckgesetzt sind
        queue.enter(4);
        queue.enter(5);
        // erwartet -> 4, 5
        System.out.println("Test 5 - Inhalt nach erneutem Befuellen:");
        queue.displayQueue();
        // erwartet -> 4
        System.out.println("leave: " + queue.leave());

        // Test 6: viele Elemente, keine Kapazitaetsgrenze
        for (int i = 6; i <= 20; i++) {
            queue.enter(i);
        }
        // erwartet -> 5 bis 20
        System.out.println("Test 6 - Inhalt nach 15 weiteren enter-Aufrufen:");
        queue.displayQueue();
    }
}