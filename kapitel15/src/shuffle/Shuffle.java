package shuffle;
import java.util.Hashtable;
import java.util.Random;

/**
 * Shuffle
 */
public class Shuffle {

    public static void shuffleArray(int[] a) {
           Random rand = new Random();
           int zufall;
           Hashtable htable = new Hashtable();
           int[] shuffle = new int[a.length];

           for(int i=0; i<a.length; i++) {
            
            do {
                zufall = rand.nextInt(0,a.length);
            } while(htable.get(zufall) != null);
            htable.put(zufall,zufall);
            shuffle[i] = a[zufall];
            }

            for (int i = 0; i < a.length; i++) {
                a[i] = shuffle[i];
            }
    }
}