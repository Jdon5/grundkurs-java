package kapitel04;

/**
 * Aufgabe 5: Eine Schleife soll den Wertebereich zwischen 0 und 100
 * in 5 Schritten gleicher Laenge durchlaufen. Alle 5 Zahlen sollen
 * ausgegeben werden.
 */
public class Schritte {

    public static void main(String[] args) {
        for(int i = 20; i <= 100; i+=20){
            System.out.println(i);
        }
    }
}