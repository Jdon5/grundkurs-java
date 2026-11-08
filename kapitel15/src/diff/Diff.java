package diff;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Aufgabe 22: Methode getDaysBetween(), die die Anzahl der Tage
 * zwischen zwei Datumsangaben ermittelt. Ausgehend vom Startdatum
 * wird mit GregorianCalendar.add() Tag fuer Tag addiert, bis das
 * Enddatum erreicht ist. Monate werden wie ueblich ab 1 angegeben
 * und intern umgerechnet, da GregorianCalendar ab 0 zaehlt. Liegt
 * das Enddatum vor dem Startdatum, ist das Ergebnis 0.
 */
public class Diff {

    public static int getDaysBetween(int startYear, int startMonth, int startDay, int endYear, int endMonth, int endDay) {
        GregorianCalendar cal1 = new GregorianCalendar(startYear, startMonth-1, startDay);
        GregorianCalendar cal2 = new GregorianCalendar(endYear, endMonth-1, endDay);
        int daysBetween = 0;

        while(cal1.before(cal2)) {
            cal1.add(Calendar.DAY_OF_YEAR, 1);
            daysBetween++;
        }
        
        return daysBetween;
    }
}