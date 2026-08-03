package kapitel03;

/**
 * Aufgabe 1: Es sollen x Flaschen in Kartons verpackt werden.
 * Ermittelt, wie viele Kartons benoetigt werden und wie viele
 * Flaschen dabei uebrig bleiben.
 */
public class Verpacken {

    public static void main(String[] args) {
        // Anzahl der Flaschen
        int flaschen = 56;

        // Karton kann n Flaschen aufnehmen
        int karton = 24;

        // Anzahl voller Kartons (ganzzahlige Division)
        int kartonAnzahl = flaschen/karton;

        // Uebrig gebliebenen Flaschen (Rest der Division, Modulo-Operator)
        int flaschenUebrig = flaschen%karton;

        System.out.println("Anzahl Kartons: "+ kartonAnzahl);
        System.out.println("Übrig gebliebenen Flasche: " + flaschenUebrig);
        }
}