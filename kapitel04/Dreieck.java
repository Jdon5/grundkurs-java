package kapitel04;

/**
 * Aufgabe 2: Erzeugt die Ausgabe des Dreiecksprogramms aus Kapitel 4.3
 * eleganter, ohne Verwendung von continue.
 */
public class Dreieck {
    public static void main(String[] args) {
        // Äussere Schleife steuert die Zeile (1 bis 9)
        for(int i = 1; i < 10; i++) {
            // Innere Schleife gibt in jeder Zeile i Zahlen aus (1 bis i)
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Zeilenumbruch nach jeder Zeile
        }
    }
}