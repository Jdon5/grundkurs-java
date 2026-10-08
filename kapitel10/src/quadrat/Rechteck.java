package quadrat;

/**
 * Rechteck
 */
public class Rechteck {

    protected int breite;
    protected int hoehe;

    public Rechteck(int breite, int hoehe){
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public void setBreite(int breite){
        this.breite = breite;
    }

    public int getBreite(){
        return breite;
    }

    public void setHoehe(int hoehe){
        this.hoehe = hoehe;
    }

    public int getHoehe(){
        return hoehe;
    }

    public int getFlaeche(){
        return hoehe * breite;
    }

}