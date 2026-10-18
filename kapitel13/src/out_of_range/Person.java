package out_of_range;

/**
 * Aufgabe 6: Person, deren Alter nur zwischen 0 und 120 liegen darf.
 * Bei einem Verstoss loest der Konstruktor eine OutOfRangeException
 * aus und uebergibt ihr den ungueltigen Wert und die Grenzen.
 */
public class Person {
    
    private int alter;
    private static final int O_GRENZE = 120;
    private static final int U_GRENZE = 0;

    public Person(int alter) {
        if(alter >= U_GRENZE && alter <= O_GRENZE){
            this.alter = alter;
        } else {
            throw new OutOfRangeException("Alter muss zwischen " + U_GRENZE + " und " + O_GRENZE +" sein.",alter,U_GRENZE,O_GRENZE);
        }
    }

    public int getAlter(){
        return alter;
    }
}