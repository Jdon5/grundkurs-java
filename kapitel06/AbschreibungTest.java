package kapitel06;

/**
 * AbschreibungTest
 */
public class AbschreibungTest {

    public static void main(String[] args) {
        Abschreibung abschreibung = new Abschreibung(100_000,5,0.25);

        System.out.println("Degressive Abschreibung");
        abschreibung.degressiveAbschreibung();
        System.out.println("Lineare Abschreibung");
        abschreibung.lineareAbschreibung();


    }
}