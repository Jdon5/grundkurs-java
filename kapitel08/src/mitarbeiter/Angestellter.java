package mitarbeiter;

/**
 * Aufgabe 3: Klasse Angestellter, abgeleitet von Mitarbeiter. Hat
 * zusaetzlich eine Stufe (maximal MAX_STUFE), die per befoerdere()
 * erhoeht wird. Eine Zulage wird nur gewaehrt, wenn die Stufe
 * groesser als 1 ist.
 */
public class Angestellter extends Mitarbeiter{
    private static final int MAX_STUFE = 5;
    private int stufe;

    public Angestellter(String nachname, String vorname, double gehalt){
        super(nachname,vorname,gehalt);
    }

    // Stufe um 1 erhoehen
    public void befoerdere(){
        if(stufe < MAX_STUFE){
            stufe++;
        }
    }

    // Ausgabe aller Variableninhalte
    @Override
    public void zeigeDaten(){
        super.zeigeDaten();
        System.out.println("Stufe: "+stufe);
    }

    public void addZulage(double betrag){
        if(stufe > 1){
            erhoeheGehalt(betrag);
        }
    }
    
}