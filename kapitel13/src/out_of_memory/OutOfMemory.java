package out_of_memory;

/**
 * Aufgabe 7: Erzeugt ein sehr grosses int-Array (ca. 7,5 GB), um
 * einen OutOfMemoryError auszuloesen. OutOfMemoryError ist eine
 * Subklasse von Error und nicht kontrolliert.
 */
public class OutOfMemory {

    public static int[] bigArray(){
        return new int[2_000_000_000];
    }
}