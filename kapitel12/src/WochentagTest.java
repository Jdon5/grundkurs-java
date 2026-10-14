import wochenende.*;

/**
 * Testet bisWochenende() fuer alle Wochentage, inklusive
 * Samstag und Sonntag (erwartet 0).
 */
public class WochentagTest {

    public static void main(String[] args) {
        // erwartet -> Montag 5, Dienstag 4, Mittwoch 3, Donnerstag 2,
        //             Freitag 1, Samstag 0, Sonntag 0
        for (Wochentag tag : Wochentag.values()) {
            System.out.println(tag.getWochentag() + ": " + Wochentag.bisWochenende(tag));
        }
    }
}