package displayable;


/**
 * Aufgabe 1: Enthaelt die Klassenmethode display(Displayable a),
 * die vor dem eigentlichen Anzeigen eine laufende Nummer ausgibt,
 * die bei jedem Aufruf um 1 erhoeht wird.
 */

public class Utilities {
    private static int counter = 1;

    public static void display(Displayable a){
        System.out.println("Display: "+ counter++);
        a.display();
    }

    
}