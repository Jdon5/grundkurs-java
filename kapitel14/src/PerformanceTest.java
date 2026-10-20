/**
 * Aufgabe 5: Vergleicht die Laufzeit beim wiederholten Anhaengen
 * eines Zeichens: String-Verkettung mit +, StringBuilder.append()
 * und StringBuffer.append(). Gemessen wird mit
 * System.currentTimeMillis().
 */
public class PerformanceTest {

    public static void main(String[] args) {
        long start, end;
        String str = "x";
        StringBuilder sb1 = new StringBuilder();
        StringBuffer sb2 = new StringBuffer();

        start = System.currentTimeMillis();
        for(int i = 0; i < 1_000_000; i++) {
            str += "x";
        }
        end = System.currentTimeMillis();
        System.out.println("String:        " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for(int i = 0; i < 1_000_000; i++) {
            sb1.append("x");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for(int i = 0; i < 1_000_000; i++) {
            sb2.append("x");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer:  " + (end - start) + " ms");
    }
    
}