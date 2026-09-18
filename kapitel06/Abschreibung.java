package kapitel06;

/**
 * Aufgabe 6: Klasse Abschreibung mit Anschaffungspreis, Anzahl der
 * Nutzungsjahre und Abschreibungssatz. Bietet lineare und
 * geometrisch-degressive Abschreibung; die Buchwerte der einzelnen
 * Jahre werden jeweils ausgegeben.
 */

public class Abschreibung {

    private double anschaffungspreis;
    private int nutzungsjahre;
    private double abschreibungssatz;

    // Konstruktor mit frei waehlbarem Abschreibungssatz
    public Abschreibung(double anschaffungspreis, int nutzungsjahre, double abschreibungssatz){
        this.anschaffungspreis = anschaffungspreis;
        this.nutzungsjahre = nutzungsjahre;
        this.abschreibungssatz = abschreibungssatz;
    }

    // Konstruktor mit Standard-Abschreibungssatz von 20%, falls keiner angegeben wird
    public Abschreibung( double anschaffungspreis, int nutzungsjahre) {
        this(anschaffungspreis,nutzungsjahre,0.2);
    }

    // reduziert den Buchwert jedes Jahr um einen GLEICHEN, festen Betrag
    public void lineareAbschreibung(){
        double buchwert = anschaffungspreis;
        double abschreibungsbetrag = anschaffungspreis/ nutzungsjahre;

        for(int i = nutzungsjahre; i > 0; i--){
             buchwert -= abschreibungsbetrag;
            System.out.println("Jahr: "+i+" buchwert: " + buchwert);
        }
    }

    // reduziert den Buchwert jedes Jahr um einen festen PROZENTSATZ
    // des jeweils AKTUELLEN Buchwerts (daher von Jahr zu Jahr kleiner)
    public void degressiveAbschreibung(){
        double buchwert = anschaffungspreis;
        double abschreibungsbetrag = 0;

        for(int i = nutzungsjahre;i > 0;i--){
            abschreibungsbetrag = buchwert * abschreibungssatz;
            buchwert -= abschreibungsbetrag;
            System.out.println("Jahr: "+i+" buchwert: " + buchwert);
        }

    }

}