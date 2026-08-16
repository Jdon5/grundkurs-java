package kapitel04;

/**
 * Aufgabe 14: Berechnet die Zerlegung einer Zahl n >= 2 in ihre
 * Primfaktoren nach dem vorgegebenen Verfahren (Probedivision
 * mit aufsteigendem Teiler t).
 */
public class Primfaktoren {

    public static void main(String[] args) {
        int n = 60;
        int t = 2;

        while ( n > 1) {
            if (n % t == 0) {
                n/=t;
                System.out.print(t+" ");
            } else {
                t++;
            }
        }
    }
}