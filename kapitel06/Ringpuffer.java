package kapitel06;

/**
 * Aufgabe 15: Implementiert mit Hilfe eines Arrays einen Ringpuffer
 * fester Laenge, in den ganze Zahlen geschrieben werden koennen.
 * Ist der Puffer voll, wird der jeweils aelteste Eintrag
 * ueberschrieben. Ein Index gibt an, an welcher Stelle die naechste
 * Schreiboperation erfolgt, und wird nach Erreichen der oberen
 * Grenze wieder auf 0 gesetzt.
 */

public class Ringpuffer {
    private int[] ringpuffer = new int[5];
    private int index;

    public void push(int e){

        // index wird auf Null gesetzt, sobald der Puffer voll ist.
        if(index == ringpuffer.length){

            index = 0;
        }

        ringpuffer[index++] = e;
    }

    // Ausgabe des Puffers
    public void display(){
        for(int i: ringpuffer){
            System.out.println(i);
        }
    }
}