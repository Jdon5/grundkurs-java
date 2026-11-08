import diff.*;

/**
 * Testet Diff.getDaysBetween() mit Schaltjahr, Nicht-Schaltjahr,
 * einem ganzen Jahr und gleichem Start- und Enddatum.
 */
public class DiffTest {
    public static void main(String[] args) {
        // Februar im Schaltjahr, erwartet -> 29
        System.out.println("1.2.2024 - 1.3.2024: " + Diff.getDaysBetween(2024, 2, 1, 2024, 3, 1));
        // Februar ohne Schaltjahr, erwartet -> 28
        System.out.println("1.2.2023 - 1.3.2023: " + Diff.getDaysBetween(2023, 2, 1, 2023, 3, 1));
        // ein ganzes Jahr, erwartet -> 365
        System.out.println("1.1.2023 - 1.1.2024: " + Diff.getDaysBetween(2023, 1, 1, 2024, 1, 1));
        // gleiches Datum, erwartet -> 0
        System.out.println("5.5.2024 - 5.5.2024: " + Diff.getDaysBetween(2024, 5, 5, 2024, 5, 5));
    }
}