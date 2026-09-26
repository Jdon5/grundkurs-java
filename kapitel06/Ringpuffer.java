package kapitel06;

/**
 * Aufgabe 15: Mit Hilfe eines Arrays soll ein Ringpuffer implementiert werden
 * 
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