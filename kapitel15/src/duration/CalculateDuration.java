package duration;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Aufgabe 21: Berechnet die seit dem 1.1.2020 um 00:00:00 Uhr
 * vergangene Zeit und gibt sie aufgeteilt in Tage, Stunden, Minuten
 * und Sekunden aus.
 */
public class CalculateDuration {
    public static void main(String[] args) {
        LocalDateTime jetzt = LocalDateTime.now();
        LocalDateTime datum = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
        Duration dauer = Duration.between(datum, jetzt);

        System.out.println("Tage: " + dauer.toDaysPart());
        System.out.println("Stunden: " + dauer.toHoursPart());
        System.out.println("Minuten: " + dauer.toMinutesPart());
        System.out.println("Sekunden: " + dauer.toSecondsPart());
    }
    
}