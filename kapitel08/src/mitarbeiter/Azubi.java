package mitarbeiter;

/**
 * Aufgabe 3: Klasse Azubi, abgeleitet von Mitarbeiter. Hat
 * zusaetzlich die Anzahl abgelegter Pruefungen. Eine Zulage wird
 * nur gewaehrt, wenn mehr als 3 Pruefungen abgelegt wurden.
 */
public class Azubi extends Mitarbeiter{
    private int abgelegtePruefungen;

    public Azubi(String nachname, String vorname, double gehalt){
        super(nachname,vorname,gehalt);
    }

    // Zahl der abgelegten Pruefungen setzen
    public void setPruefungen(int anzahl){
        this.abgelegtePruefungen = anzahl;
    }

    // Ausgabe aller Variableninhalte
    @Override
    public void zeigeDaten(){
        super.zeigeDaten();
        System.out.println("Abgelegte Prufuengen: "+abgelegtePruefungen);
    }

    public void addZulage(double betrag){
        if(abgelegtePruefungen > 3){
            erhoeheGehalt(betrag);
        }
    }    
}