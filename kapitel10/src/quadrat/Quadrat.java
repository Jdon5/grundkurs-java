package quadrat;

/**
 * Aufgabe 1: Quadrat mit Delegation statt Vererbung (loest das
 * Problem aus Kapitel 8, Aufgabe 6). Quadrat erbt nicht von
 * Rechteck, sondern haelt intern ein Rechteck-Objekt und
 * delegiert die Flaechenberechnung daran. setBreite und setHoehe
 * laufen ueber setLaenge, sodass Breite und Hoehe immer gleich
 * bleiben.
 */
public class Quadrat {
    private int laenge;
    private Rechteck delegate;

    public Quadrat(int laenge){
        this.laenge = laenge;
        delegate = new Rechteck(laenge, laenge);
    }

    public int getLaenge(){
        return laenge;
    }

    public void setLaenge(int laenge){
        this.laenge = laenge;
        delegate.setBreite(laenge);
        delegate.setHoehe(laenge);
    }

    public void setHoehe(int laenge){
        setLaenge(laenge);
    }

    public void setBreite(int laenge){
        setLaenge(laenge);
    }

    public int getHoehe(){
        return delegate.getHoehe();
    }

    public int getBreite(){
        return delegate.getBreite();
    }

    public int getFlaeche(){
        return delegate.getFlaeche();
    }
}