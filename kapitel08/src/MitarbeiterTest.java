
import mitarbeiter.*;
/**
 * Testet die Klassen Azubi und Angestellter: setPruefungen bzw.
 * befoerdere sowie addZulage, jeweils einmal so, dass die
 * Bedingung fuer die Zulage erfuellt ist.
 */
public class MitarbeiterTest {

    public static void main(String[] args) {
        Azubi azubi = new Azubi("Osei","Jesse",3000);
        azubi.setPruefungen(15);
        azubi.addZulage(500);
        azubi.zeigeDaten();
        System.out.println();
        Angestellter angestellter = new Angestellter("Tagro", "Jean", 200);
        angestellter.befoerdere();
        angestellter.befoerdere();
        angestellter.addZulage(4000);
        angestellter.zeigeDaten();
    }
}