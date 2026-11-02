package fakultaet;

import java.math.BigInteger;

/**
 * Aufgabe 13: Berechnet die Fakultaet n! mit BigInteger, sodass
 * auch Ergebnisse jenseits der long-Grenze (ab 21!) moeglich sind.
 * Rekursiv geloest, daher bei sehr grossem n durch die Stack-Groesse
 * begrenzt. Fuer negative n wird eine IllegalArgumentException
 * ausgeloest.
 */
public class Fakultaet {

    public static BigInteger fakultaet(int n) {
        if(n <0) {
            throw new IllegalArgumentException("n darf nicht negativ sein");
        } else if(n <= 1) {
            return BigInteger.ONE;
        } else {
           return fakultaet(n-1).multiply(BigInteger.valueOf(n)); 
        }
    }
}