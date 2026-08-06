package kapitel03;

/**
 * Aufgabe 3: Jetzt ist es x Uhr (volle Stundenzahl).
 * Wie viel Uhr ist es in n Stunden?
 */
public class Uhrzeit {

    public static void main(String[] args) {
        
        int uhr = 23;
        int n = 5;

        // Modulo mit 24 sorgt automatisch fuer den Ueberlauf ueber Mitternacht
        int zeit = (uhr + n) % 24;
        System.out.println(zeit);
    }
}