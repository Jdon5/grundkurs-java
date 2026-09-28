package kapitel06;

/**
 * FlascheTest
 */
public class FlascheTest {

    public static void main(String[] args) {
        
        Flasche flasche1 = new Flasche(1,0,500);
        Flasche flasche2 = new Flasche(2,0.5,1000);
        Flasche flasche3 = new Flasche(3,200);

        // inhalt setzen. erwartet -> 0.2
        flasche1.setInhalt(100);
        double fuellgrad = flasche1.berechneFuellgrad();
        System.out.println(fuellgrad);

        // nachfuellen. 
        flasche1.nachfuellen(100);
        fuellgrad = flasche1.berechneFuellgrad();
        // erwartet 0.4
        System.out.println(fuellgrad);

        // verschuetten. 
        flasche1.verschuetten(100);
        fuellgrad = flasche1.berechneFuellgrad();
        // erwartet 0.2
        System.out.println(fuellgrad);

        // fuellgrad anzeigen mit prozentualer Angabe des Inhalt im Konstruktor
        fuellgrad = flasche2.berechneFuellgrad();
        // erwartet -> 0.5
        System.out.println(fuellgrad);

        //erwartet -> 0.4
        fuellgrad = flasche3.berechneFuellgrad();
        System.out.println(fuellgrad);

        //umfuellen
        flasche1.umfuellen(flasche3,100);
        fuellgrad = flasche1.berechneFuellgrad();
        //erwartet -> 0.0
        System.out.println(fuellgrad);

        fuellgrad = flasche3.berechneFuellgrad();
        // erwartet -> 0.6
        System.out.println(fuellgrad);

        // Flasche voll oder Leer
        boolean isFullorEmpty = flasche1.isFlascheLeerOderVoll();
        // erwartet -> true
        System.out.println(isFullorEmpty);

        // Vergleich basierend auf Fassungsvermoegen
        int compare = Flasche.vergleicheFlasche(flasche1, flasche2);
        // erwartet -> 2
        System.out.println(compare);

    }
}