package deep_copy;

/**
 * Aufgabe 6: Stapel fuer ganze Zahlen in einem Array vorgegebener
 * Laenge. clone() erzeugt eine tiefe Kopie: Die Kopie erhaelt ein
 * eigenes Array mit denselben Werten, sodass Original und Kopie
 * danach unabhaengig voneinander veraendert werden koennen.
 */
public class IntegerStack implements Cloneable{
    private int[] arr;
    private int counter = 0;

    public IntegerStack (int laenge) {
        arr = new int[laenge];
    }

    public void push(int value){
        if(counter < arr.length && counter >=0){
            arr[counter] = value;
            counter++;
        } else {
            System.out.println("Array full");
        }
    }

    public int pop(){
        if(counter == 0){
            throw new IllegalStateException("Stapel ist leer");
        } else {
            return arr[--counter];
        }
    }

    // tiefe Kopie: super.clone() uebernimmt counter, das Array wird
    // zusaetzlich kopiert, damit Original und Kopie es nicht teilen
    @Override
    public IntegerStack clone() throws CloneNotSupportedException {
        IntegerStack i = (IntegerStack) super.clone();
        i.arr = arr.clone();
        return i;
    }

    public void display(){
        for(int i = 0; i < counter; i++){
            System.out.print(arr[i] + " ");
        }
    }

}