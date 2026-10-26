package woerter1;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 * Aufgabe 10: Methode extract(), die einen Text anhand der
 * Trennzeichen in delim in einzelne Woerter zerlegt und diese
 * sortiert als Array zurueckgibt. Ein Vector dient als
 * Zwischenspeicher, da die Anzahl der Woerter vorher nicht
 * bekannt ist.
 */
public class Woerter1 {

    public static String[] extract(String text, String delim) {
        
        Vector vector = new Vector<>();
        StringTokenizer st = new StringTokenizer(text, delim);

        while(st.hasMoreTokens()) {
            vector.add(st.nextToken());
        }
        String[] stringArr = new String[vector.size()];

        vector.copyInto(stringArr);

        Arrays.sort(stringArr);

        return stringArr;
    }

    public static void main(String[] args) {
        
        String text = "Ich weiß nicht, was soll es bedeuten.";
        String[] arr = extract(text, " ,.");

        for(String wort: arr) {
            System.out.println(wort);
        }
    }
}