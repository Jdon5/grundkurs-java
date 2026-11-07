package zufall2;
import java.util.Random;

/**
 * Aufgabe 17: Methode random(), die ein zufaellig ausgewaehltes
 * Element eines String-Arrays liefert. Bei einem leeren Array wird
 * eine IllegalArgumentException ausgeloest.
 */
public class Zufall2 {

    public static String random(String[] array) {
        if(array.length == 0) {
            throw new IllegalArgumentException("Array muss befuellt werden");
        } else {
            Random rand = new Random();
            int zufall = rand.nextInt(0,array.length);
            return array[zufall];
        }
    }
}