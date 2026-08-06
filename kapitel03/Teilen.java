package kapitel03;

/**
 * Aufgabe 2: Zu vorgegebenen Zahlen x und y soll festgestellt werden,
 * ob x durch y teilbar ist.
 */
public class Teilen {

    public static void main(String[] args) {

        int x = 12;
        int y = 5;

        // x ist durch y teilbar, wenn der Rest der Division 0 ist (Modulo-Operator)
        // Bedingungsoperator (? :) waehlt je nach Ergebnis die passende Ausgabe
        String ausgabe = (x % y == 0) ? "x ist durch y teilbar" : "x ist nicht durch y teilbar";
        System.out.println(ausgabe);
    }
}