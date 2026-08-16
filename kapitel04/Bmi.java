package kapitel04;

/**
 * Aufgabe 17: Berechnet den Body-Mass-Index (BMI) und gibt je
 * nach Wert eine Gewichtskategorie aus.
 * bmi = gewicht / (groesse * groesse)
 */
public class Bmi {

    public static void main(String[] args) {
        double gewicht = 80;
        double groesse = 1.8;

        double bmi = gewicht / (groesse * groesse);

        if(bmi < 18.5) {
            System.out.println("Untergewicht");
        } else if ((bmi >= 18.5) && (bmi < 25)) {
            System.out.println("Normalgewicht");
        } else if ((bmi >= 25) && (bmi < 30)) {
            System.out.println("Uebergewicht");
        } else {
            System.out.println("Adipositas");
        }
    }
}