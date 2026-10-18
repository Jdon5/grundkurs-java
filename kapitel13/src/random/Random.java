package random;

/**
 * Aufgabe 5: Liefert eine Zufallszahl zwischen 0 und 99. Ist die
 * Zahl 0, wird eine Ausnahme vom Typ Exception ausgeloest. Da
 * Exception kontrolliert ist, muss sie mit throws angekuendigt
 * werden.
 */
public class Random {

    public static int random() throws Exception{
        int zufallszahl = (int) (Math.random() * 100);

        if(zufallszahl == 0) {
            throw new Exception("Zufallszahl ist 0");
        } else {
            return zufallszahl;
        }
    }
}