package kapitel06;

/**
 * Beleg
 */
public class Beleg {

    private static int counter = 10_000;
    private int belegnummer;

    public Beleg(){
        setBelegnummer();
        display();
    }

    private void setBelegnummer(){
        belegnummer = counter++;
    }

    public int getBelegnummer(){
        return belegnummer;
    }

    private void display(){
        System.out.println(belegnummer);
    }
}