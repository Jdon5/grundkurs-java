package mitarbeiter;

/**
 * Aufgabe 3: Abstrakte Klasse Mitarbeiter mit den Attributen
 * nachname, vorname und gehalt. Bietet eine Methode zur
 * Gehaltserhoehung und zur Ausgabe der Daten. addZulage() ist
 * abstrakt, da jede Unterklasse eigene Bedingungen fuer eine
 * Zulage hat.
 */
public abstract class Mitarbeiter {

    protected String nachname;
    protected String vorname;
    protected double gehalt;

    public Mitarbeiter(String nachname, String vorname, double gehalt){
        this.nachname = nachname;
        this.vorname = vorname;
        this.gehalt = gehalt;
    }

    // Erhoehung des Gehalts um Betrag
    public void erhoeheGehalt(double betrag){
        gehalt+=betrag;
    }

    // Ausgabe aller Variableninhalte
    public void zeigeDaten(){
        System.out.println("Nachname: "+nachname);
        System.out.println("Vorname: "+vorname);
        System.out.println("Gehalt: "+gehalt);
    }

    //Gehalt durch Zulagen erhoehen
    public abstract void addZulage(double betrag);


}