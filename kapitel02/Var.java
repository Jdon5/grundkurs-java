package kapitel02;

/**
 * Aufgabe 5: Codiert die Loesung zu Aufgabe 4 mit Hilfe
 * des Typ-Platzhalters var.
 */
public class Var {
    public static void main(String[] args) {
        var binaerZahl = 0b10101010; // Binär-Literal (Präfix 0b)
        var hexadezimalZahl = 0xAA00; // Hexadezimal-Literal (Präfix 0x)

        //Ausgabe
        System.out.println("Hexadezimalzahl: "+ hexadezimalZahl);
        System.out.println("Binaere Zahl: "+ binaerZahl);
    }    
}