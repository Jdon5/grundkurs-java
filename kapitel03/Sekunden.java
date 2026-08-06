package kapitel03;

/**
 * Aufgabe 4: Schreiben Sie ein Programm, das die Anzahl von
 * Sekunden im Monat Januar berechnet.
 */
public class Sekunden {
    public static void main(String[] args) {

        // Januar hat 31 Tage
        int tage = 31; 

        // 1 Tag = 24 Stunden * 60 Minuten * 60 Sekunden = 86400 Sekunden
        int tageInSek = 31 * 86400;

        System.out.println(tage + " Tage sind " + tageInSek + " Sekunden");

    }
}