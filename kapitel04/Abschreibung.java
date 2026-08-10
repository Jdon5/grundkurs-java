package kapitel04;
/**
 * Aufgabe 7: Schreibt den Buchwert von 15000 Geldeinheiten mit einem
 * Abschreibungssatz von 40 % und einem Restwert von 100 Geldeinheiten
 * geometrisch degressiv ab.
 */
public class Abschreibung {

    public static void main(String[] args) {
        double buchwert = 15000;
        int restwert = 100;

        // Solange der Buchwert ueber dem Restwert liegt, jedes Jahr um 40% reduzieren
        int jahre = 1;
        for(jahre = 0; buchwert > restwert; jahre++){
            buchwert *= (1 - 0.4);
        }
        System.out.println("Buchwert: " + buchwert + " nach " + jahre + " Jahren");
    }
}