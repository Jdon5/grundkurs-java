package kapitel04;

/**
 * Aufgabe 9: Zwei Fliesskommazahlen x und y sollen verglichen werden.
 * Ist der Absolutbetrag der Differenz kleiner als ein vorgegebener
 * Wert z, wird 0 ausgegeben, sonst -1 (x < y) bzw. 1 (x > y).
 */
public class Signum {
    public static void main(String[] args) {
        double x = 22;
        double y = 24;
        double z = 1;

        // Absolutbetrag der Differenz per Bedingungsoperator berechnen
        double absBetrag = ((x - y) < 0) ? -(x - y) : x - y;

        if (absBetrag < z) {
            System.out.println(0);
        } else if (x < y) {
            System.out.println(-1);
        } else {
            System.out.println(1);
        }
    }
}