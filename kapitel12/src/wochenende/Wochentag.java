package wochenende;

public enum Wochentag {
    MO("Montag"), DI("Dienstag"), MI("Mittwoch"),DO("Donnerstag"),FR("Freitag"),
    SA("Samstag"),SO("Sonntag");

    private final String wochentag;

    Wochentag(String wochentag){
        this.wochentag = wochentag;
    }

    public String getWochentag(){
        return wochentag;
    }

    // liefert die Anzahl der Tage bis Samstag; an Samstag und
    // Sonntag 0, da dann bereits Wochenende ist
    public static int bisWochenende(Wochentag wochentag){
        if (Wochentag.SA.ordinal() - wochentag.ordinal() < 1)
            return 0;
        else 
            return Wochentag.SA.ordinal() - wochentag.ordinal();
    }
}
