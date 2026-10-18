import sum.*;

/**
 * Testet Sum.sum(): Ausnahme bei n <= 0 sowie die Summe fuer
 * gueltige Werte.
 */
public class SumTest {
    

    public static void main(String[] args) {
        // Test1: erwartet -> java.lang.IllegalArgumentException: n muss groesser 0 sein
        try {
            Sum.sum(0);
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
        

        // Test2: erwartet -> 1;
        System.out.println(Sum.sum(1));

        // Test3: erwartet -> 10
        System.out.println(Sum.sum(4));
    }
}