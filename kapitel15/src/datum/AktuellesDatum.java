package datum;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Aufgabe 20: Klassenmethode getDatum(), die das aktuelle Datum als
 * Zeichenkette im Format "Dienstag, den 17.10.2023" liefert. Die
 * Sprache ist fest auf Deutsch eingestellt, damit der Wochentag
 * unabhaengig von den Systemeinstellungen deutsch erscheint.
 */
public class AktuellesDatum {
    public static String getDatum() {

        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("EEEE', den' dd.MM.yyyy",Locale.GERMAN);
        String s = f.format(date);

        return s; 
    }

    public static void main(String[] args) {
        System.out.println(getDatum());
    }
}