package kapitel04;
/**
 * Aufgabe 8: Berechnet den kleinsten ganzzahligen Wert von n, sodass
 * 2^n groesser oder gleich einer vorgegebenen ganzen Zahl x ist.
 * Beispiel: Fuer x = 15 ist n = 4.
 */
public class Log {

    public static void main(String[] args) {
        int x = 15;
        int n = 1;
        int potenz = 2; // entspricht 2^n, startet bei 2^1

        while(potenz <= x){
            n++;
            potenz *= 2;
        }
        System.out.println(n);
    }
}