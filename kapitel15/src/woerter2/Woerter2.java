package woerter2;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 * Aufgabe 11: Variante von Aufgabe 10. extract() liefert jedes Wort
 * genau einmal, ergaenzt um die Anzahl seines Auftretens im Text,
 * sortiert als Array. Ein Hashtable dient als Zwischenspeicher:
 * Schluessel ist das Wort, Wert die bisherige Anzahl.
 */
public class Woerter2 {

    public static String[] extract(String text, String delim) {
        
        Hashtable hashtable = new Hashtable<>();
        StringTokenizer st = new StringTokenizer(text, delim);

        int initial = 1;
        while(st.hasMoreTokens()) {
            String tokenHolder = st.nextToken();

            if(!hashtable.containsKey(tokenHolder)) {
                hashtable.put(tokenHolder,initial);
            } else { 
                int bisher = (Integer) hashtable.get(tokenHolder);
                hashtable.put(tokenHolder,bisher+1);

            }
            
        }
        String[] stringArr = new String[hashtable.size()];

        int i =0;
        Enumeration e = hashtable.keys();
        while(e.hasMoreElements()) {
            String key = (String) e.nextElement(); 
            stringArr[i++] = key + " " + hashtable.get(key);
        }

        Arrays.sort(stringArr);

        return stringArr;
    }
    
}