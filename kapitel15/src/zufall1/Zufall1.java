package zufall1;

import java.util.Random;

/**
 * Aufgabe 16: Methode random(n), die eine Zeichenkette aus n
 * zufaellig gewaehlten Kleinbuchstaben (a bis z) erzeugt.
 */
public class Zufall1 {

    public static String random(int n) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++) {

            sb.append((char) rand.nextInt('a', 'z'+1));
        }

        return sb.toString();

    }
    
    public static void main(String[] args) {
        String str = random(5);
        System.out.println(str);
    }
}