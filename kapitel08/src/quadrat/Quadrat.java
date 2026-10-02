package quadrat;

/**
 * Quadrat
 */
public class Quadrat extends Rechteck {

    public Quadrat(int laenge){
        super(laenge, laenge);
    }

    public void setLaenge(int laenge){
        super.setBreite(laenge);
        super.setHoehe(laenge);
    }

    public int getLaenge(){
        return super.getBreite();
    }

    @Override
    public void setHoehe(int laenge){
        super.setHoehe(laenge);
        super.setBreite(laenge);
    }

    @Override
    public void setBreite(int laenge){
        super.setHoehe(laenge);
        super.setBreite(laenge);
    }
}