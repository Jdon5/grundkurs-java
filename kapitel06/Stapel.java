package kapitel06;

/**
 * Aufgabe 8: Stapel (Stack) auf Basis eines Arrays, verwaltet Daten
 * nach dem LIFO-Prinzip (Last in, first out). Ist das Array voll,
 * wird bei push automatisch ein neues Array mit doppelter Laenge
 * erzeugt und die bisherigen Werte werden uebernommen.
 */
public class Stapel {
    private int[] stack = new int[5];
    private int counter; // Index des naechsten freien Platzes = Anzahl der Elemente

    public void push(int e){
        int[] newStack;

        // Kapazitaetspruefung: ist nur noch ein Platz frei, Array verdoppeln
        if(counter == (this.stack.length-1)) {
            newStack = new int[2*this.stack.length];

            for(int i=0; i < this.stack.length; i++){
                newStack[i] = this.stack[i];
            }
            this.stack = newStack;
        }

        stack[counter++] = e;
    }

    
    public int pop(){
        return stack[--counter];
    }

    public int getCounter(){
        return counter;
    }

    // zeigt nur den gueltigen Teil des Stapels (Index 0 bis counter-1)
    public void displayStack(){
        for(int i = 0; i<counter; i++){
            System.out.print(stack[i]);
        }
    }
}