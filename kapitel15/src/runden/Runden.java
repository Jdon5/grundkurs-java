package runden;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Aufgabe 14: Methoden round() fuer float und double, die eine Zahl
 * auf die angegebene Anzahl Nachkommastellen runden. Die Zahl wird
 * ueber ihre String-Darstellung in ein BigDecimal umgewandelt, damit
 * Ungenauigkeiten der binaeren Darstellung (z. B. bei 1.005) das
 * Ergebnis nicht verfaelschen.
 */
public class Runden {

    public static float round(float x, int digits) {
    float roundedValue = new BigDecimal(Float.toString(x)).setScale(digits, RoundingMode.HALF_UP).floatValue();

    return roundedValue;
    }

    public static double round(double x, int digits) {
        double roundedValue = new BigDecimal(Double.toString(x)).setScale(digits, RoundingMode.HALF_UP).doubleValue();

        return roundedValue;
    }

    public static void main(String[] args) {
    // Beispiel aus der Aufgabe (double), erwartet -> 123.46
    System.out.println(round(123.456, 2));
    // dasselbe als float, das f waehlt die float-Methode, erwartet -> 123.46
    System.out.println(round(123.456f, 2));
    // Randfall, intern 1.00499..., erwartet -> 1.01
    System.out.println(round(1.005, 2));
    // Abrunden, erwartet -> 2.34
    System.out.println(round(2.344, 2));
    }
}