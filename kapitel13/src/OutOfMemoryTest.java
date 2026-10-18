import out_of_memory.*;

/**
 * Loest den OutOfMemoryError aus und faengt ihn zur Demonstration
 * ab. Mit "java -Xmx64m ..." tritt der Fehler unabhaengig vom
 * Arbeitsspeicher des Rechners auf.
 */
public class OutOfMemoryTest {
    public static void main(String[] args) {
        
        try {
            OutOfMemory.bigArray();
        } catch (OutOfMemoryError e) {
            System.out.println(e);
        }
        
    }
    
}