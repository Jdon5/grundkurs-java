package kapitel04;

/**
 * Aufgabe 18: Ermittelt fuer einen vorgegebenen Monat (als int-Zahl)
 * die jeweilige Jahreszeit, unter Verwendung von switch als
 * Ausdruck mit Ergebnis.
 */
public class Jahreszeit {

    public static void main(String[] args) {
         int zahl = 5;

         String result = switch(zahl) {
            case 12,1,2 -> "Winter";
            case 3, 4, 5 -> "Fruehling";
            case 6,7,8 -> "Sommer";
            case 9,10,11 -> "Herbst";
            default -> " Unbekannt";
         };
         System.out.println(result);
    }
}