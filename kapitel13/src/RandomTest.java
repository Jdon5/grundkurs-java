import random.*;

/**
 * Erzeugt 100 Zufallszahlen. Das try steht innerhalb der Schleife:
 * Eine ausgeloeste Ausnahme beendet nur den aktuellen Durchlauf,
 * die Schleife laeuft danach weiter.
 */
public class RandomTest {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            try {
                System.out.println(Random.random());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}