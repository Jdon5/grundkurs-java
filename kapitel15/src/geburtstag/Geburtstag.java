package geburtstag;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Aufgabe 23: Isabelle ist am 28.12.2006 geboren. Ermittelt, wie alt
 * sie heute ist und wie viele Tage es noch bis zu ihrem naechsten
 * Geburtstag dauert.
 */
public class Geburtstag {
    public static void main(String[] args) {
        LocalDate heute = LocalDate.now();
        LocalDate geburtsdatum = LocalDate.of(2006, 12, 28);

        // Alter in vollen Jahren; Period beruecksichtigt Schaltjahre
        int alter = Period.between(geburtsdatum, heute).getYears();

        // Geburtstag in diesem Jahr; ist er schon vorbei, der im naechsten Jahr
        LocalDate naechsterGeburtstag = geburtsdatum.withYear(heute.getYear());
        if (naechsterGeburtstag.isBefore(heute)) {
            naechsterGeburtstag = naechsterGeburtstag.plusYears(1);
        }

        long tageBisGeburtstag = ChronoUnit.DAYS.between(heute, naechsterGeburtstag);

        System.out.println("Heute: " + heute);
        System.out.println("Alter: " + alter + " Jahre");
        System.out.println("Naechster Geburtstag: " + naechsterGeburtstag);
        System.out.println("Tage bis zum naechsten Geburtstag: " + tageBisGeburtstag);
    }
}