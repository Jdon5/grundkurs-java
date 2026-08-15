package kapitel04;

/**
 * Aufgabe 11: Ermittelt den groessten gemeinsamen Teiler von zwei
 * positiven ganzen Zahlen p und q mit Hilfe des Euklidischen
 * Algorithmus.
 */
public class Euklid {

    public static void main(String[] args) {
        int p = 32;
        int q = 24;
        int i = 0;
        int r = 0;

        // Ist p kleiner als q, Belegung tauschen
        while (q != 0) {
            if(p<q){
                i = p;
                p = q;
                q = i;
            }
            r = p % q;
            p = q;
            q = r;
        }

        System.out.println(p); // p enthaelt am Ende den ggT
    }
}