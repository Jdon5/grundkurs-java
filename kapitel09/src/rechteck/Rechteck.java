package rechteck;

/**
 * Aufgabe 5: Interface Rechteck mit den abstrakten Methoden
 * getBreite() und getHoehe(), der Default-Methode isQuadrat()
 * und der statischen Methode compare(), die die Flaecheninhalte
 * zweier Rechtecke vergleicht (-1, 0 oder 1).
 */
public interface Rechteck {

    int getBreite();
    int getHoehe();
    default boolean  isQuadrat(){
        if(getHoehe() == getBreite()){
            return true;
        } else {
            return false;
        }
    }
    static int compare(Rechteck a, Rechteck b){
        if(a.getBreite()*a.getHoehe() < b.getBreite() * b.getHoehe()){
            return -1;
        } else if(a.getBreite()*a.getHoehe() > b.getBreite() * b.getHoehe()){
            return 1;
        } else {
            return 0;
        }
    }

}