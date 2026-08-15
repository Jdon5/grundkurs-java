package kapitel04;

/**
 * Aufgabe 12: Ermittelt zu einer Zahl n die Fakultaet n!
 * (n! = 1 * 2 * ... * n, sowie 0! = 1). Fuer n bis 20 passt
 * das Ergebnis noch in eine long-Variable.
 */
public class Fakultaet {

    public static void main(String[] args) {
        int n = 15;
        int i = 1;
        long ans = 1; // long, da int fuer groessere Fakultaeten ueberlaeuft

        while(i <= n){
            ans *= i;
            i++;
        }
        System.out.println(ans);
    }
}