package kapitel04;
/**
 * Aufgabe 1: Ein Semikolon direkt nach der for-Bedingung erzeugt eine
 * leere Anweisung als Schleifenkoerper. Der nachfolgende Block wird
 * dadurch NICHT mehr Teil der Schleife, sondern nur einmal danach
 * ausgefuehrt - mit dem Endwert von i (10) statt der Werte 0 bis 9.
 * Korrigierte Version ohne das ueberfluessige Semikolon.
 */
public class Preisfrage {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}