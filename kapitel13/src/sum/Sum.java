package sum;

/**
 * Aufgabe 3: Statische Methode sum(n), die die Summe 1 + 2 + ... + n
 * ermittelt. Bei n <= 0 wird die nicht kontrollierte Ausnahme
 * IllegalArgumentException ausgeloest.
 */
public class Sum {
    public static long sum(int n) throws IllegalArgumentException{
        if (n<=0) {
            throw new IllegalArgumentException("n muss groesser 0 sein");
        } else if (n==1) {
            return 1;
        }
        else {
            return sum(n-1)+n;
        }  
    } 
}

/**
 * Testet Sum.sum(): Ausnahme bei n <= 0 sowie die Summe fuer
 * gueltige Werte.
 */