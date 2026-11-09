package date;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale; 
/**
 * Aufgabe 2: Gibt das aktuelle Datum in Langform (DateFormat.FULL)
 * fuer die Gebietsschemata de_DE, en_US und fr_FR hintereinander
 * aus. Reihenfolge, Schreibweise und Sprache von Wochentag und Monat
 * richten sich jeweils nach dem Land.
 */
public class Datum {

    public static void main(String[] args) {
        Date now = new Date();
        DateFormat dfDE = DateFormat.getDateInstance(DateFormat.FULL, Locale.of("de","DE"));
        DateFormat dfUS = DateFormat.getDateInstance(DateFormat.FULL, Locale.of("en","US"));
        DateFormat dfFR = DateFormat.getDateInstance(DateFormat.FULL, Locale.of("fr","FR"));

        System.out.println(dfDE.format(now));
        System.out.println(dfUS.format(now));
        System.out.println(dfFR.format(now));
    }
}