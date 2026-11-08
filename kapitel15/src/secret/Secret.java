package secret;

import java.util.*;

/**
 * Aufgabe 19: Versteckt einen Text in einem neu erzeugten Text. Der
 * Text wird in Grossbuchstaben umgewandelt, und hinter jedes Zeichen
 * werden n zufaellige Grossbuchstaben gesetzt. Nur wer n kennt, kann
 * den Text wiederfinden.
 */
public class Secret {

    public static String encrypt(int n, String text) {
        Random rand = new Random();
        StringBuilder sb1 = new StringBuilder(text.toUpperCase());
        StringBuilder sb2 = new StringBuilder();

        for(int i = 0; i<text.length(); i++) {
            sb2.append(sb1.charAt(i));
            for(int j = 0; j < n; j++) {
                sb2.append((char) rand.nextInt('A','Z'+1));
            }
        }
        return sb2.toString();
    }
}