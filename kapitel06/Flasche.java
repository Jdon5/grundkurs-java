package kapitel06;

/**
 * Aufgabe 19: Klasse Flasche mit id, inhalt (in ml) und
 * fassungsVermoegen (in ml). Drei Konstruktoren (mit Inhalt und
 * Fassungsvermoegen, mit Standard-Fassungsvermoegen 500, mit Inhalt
 * in Prozent). Methoden zum Setzen, Nachfuellen, Verschuetten und
 * Umfuellen des Inhalts, zur Pruefung auf leer/voll, zur
 * Ermittlung des Fuellgrads sowie zum Vergleich zweier Flaschen.
 */
public class Flasche {

    private int id;
    private int inhalt;
    private int fassungsVermoegen;

    // setzt die Attribute nur, wenn die Flasche nicht ueberlaeuft;
    // bei ungueltigen Werten bleiben alle Attribute auf 0
    public Flasche(int id, int inhalt, int fassungsVermoegen){
        if(inhalt <= fassungsVermoegen) {
            this.id = id;
            this.inhalt = inhalt;
            this.fassungsVermoegen = fassungsVermoegen;
        }
    }

    // Standard-Fassungsvermoegen: 500 ml
    public Flasche(int id, int inhalt){
        this(id,inhalt,500);
    }
    
    // Inhalt wird als Prozentsatz (0.0 bis 1.0) des Fassungsvermoegens angegeben
    public Flasche(int id, double prozent, int fassungsVermoegen){
        this(id,(int)(prozent*fassungsVermoegen),fassungsVermoegen);
    }

    // setzt den Inhalt, sofern die Flasche dadurch nicht ueberlaeuft
    public void setInhalt(int inhalt){
        if(inhalt<=fassungsVermoegen){
            this.inhalt = inhalt;
        }
    }

    // fuellt die angegebene Menge nach, sofern die Flasche nicht ueberlaeuft
    public void nachfuellen(int menge){
        if(inhalt + menge <= fassungsVermoegen){
            inhalt+= menge;
        }
    }

    // verschuettet die angegebene Menge, sofern der Inhalt nicht negativ wird
    public void verschuetten(int menge){
        if(inhalt - menge >= 0){
            inhalt-= menge;
        }
    }

    // fuellt die Menge in eine andere Flasche um (verschuettet sie hier,
    // fuellt sie dort nach)
    public void umfuellen(Flasche flasche, int menge){
        verschuetten(menge);
        flasche.nachfuellen(menge);
    }

    // true, wenn die Flasche leer oder voll ist
    public boolean isFlascheLeerOderVoll(){
        if(inhalt == 0 | inhalt == fassungsVermoegen){
            return true;
        } else {
            return false;
        }
    }

    // Fuellgrad als Wert zwischen 0.0 und 1.0
    public double berechneFuellgrad(){
        return ((double)inhalt / (double) fassungsVermoegen);
    }

    // liefert 1, wenn flasche1 groesser ist, 2, wenn flasche2 groesser ist,
    // und 0, wenn beide das gleiche Fassungsvermoegen haben
    public static int vergleicheFlasche(Flasche flasche1, Flasche flasche2){
        if(flasche1.fassungsVermoegen > flasche2.fassungsVermoegen){
            return 1;
        } else if(flasche1.fassungsVermoegen == flasche2.fassungsVermoegen) {
            return 0;
        } else {
            return 2;
        }
    }
    
}