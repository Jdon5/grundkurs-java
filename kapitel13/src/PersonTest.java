import out_of_range.*;

/**
 * Testet die Klasse Person mit gueltigen Werten (Grenzen und ein
 * Wert dazwischen) und ungueltigen Werten knapp ausserhalb der
 * Grenzen. Bei ungueltigen Werten werden die Informationen der
 * OutOfRangeException ausgegeben.
 */
public class PersonTest {

    public static void main(String[] args) {
        int[] testwerte = {0, 50, 120, -1, 121};

        for (int alter : testwerte) {
            try {
                Person person = new Person(alter);
                System.out.println("gueltig: Person mit Alter " + person.getAlter() + " erzeugt");
            } catch (OutOfRangeException e) {
                System.out.println("ungueltig: " + e.getMessage()
                        + " Wert: " + e.getWert()
                        + ", Grenzen: " + e.getUntereGrenze() + " bis " + e.getObereGrenze());
            }
        }
    }
}