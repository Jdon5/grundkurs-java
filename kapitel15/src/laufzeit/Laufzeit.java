package laufzeit;

import java.time.Duration;
import java.time.Instant;

/**
 * Aufgabe 4: Addiert die Zahlen von 1 bis Integer.MAX_VALUE einmal
 * mit einer Variablen vom Typ long und einmal mit Long und misst
 * die Laufzeit. Mit Long wird bei jeder Addition ein neues Objekt
 * erzeugt (Autoboxing), daher ist diese Variante deutlich langsamer.
 * Die Schleifenvariable ist long, da ein int nach Integer.MAX_VALUE
 * ueberlaufen wuerde.
 */
public class Laufzeit {
    public static void main(String[] args) {
        Instant instant1 = Instant.now();
        long sum = 0;
        for(long i=1; i <= Integer.MAX_VALUE; i++){
             sum += i; 
        }
        Instant instant2 = Instant.now();
        System.out.println("Laufzeit long: " + Duration.between(instant1, instant2).toMillis() + " ms");

        instant1 = Instant.now();
        Long sum1 = Long.valueOf(0);
        for(long i=1; i <= Integer.MAX_VALUE; i++){
             sum1+= i; 
        }
        instant2 = Instant.now();
        System.out.println("Laufzeit Long: " + Duration.between(instant1, instant2).toMillis() + " ms");
    }

    
}