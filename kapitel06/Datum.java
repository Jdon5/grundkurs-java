package kapitel06;

/**
 * Aufgabe 17: Klasse Datum mit den Attributen tag, monat und jahr.
 * display() gibt das Datum formatiert aus, wenn es gueltig ist -
 * die Gueltigkeit wird mit Tage.tage() aus Aufgabe 16 geprueft.
 */
public class Datum {

    private int tag;
    private int monat;
    private int jahr;

    public Datum(int tag, int monat, int jahr){
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    public void display(){

        if(tag > 0 & tag <= Tage.tage(jahr, monat)){
            System.out.println(tag + "." + monat + "." + jahr);
        } else {
            System.out.println("invalid");
        }
    }
}