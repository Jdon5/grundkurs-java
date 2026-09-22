package kapitel06;

/**
 * BelegTest
 */
public class BelegTest {

    public static void main(String[] args) {
       Beleg b1 = new Beleg();
       Beleg b2 = new Beleg();
       Beleg b3 = new Beleg();
       
       System.out.println("Belegnummer von b2 (später abgefragt): " + b2.getBelegnummer());
    }
}