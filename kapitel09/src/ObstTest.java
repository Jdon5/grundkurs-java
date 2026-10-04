import obst.*;
/**
 * Testet Obstlager mit verschiedenen Obstsorten (Apfel, Birne,
 * Orange) in einem gemeinsamen Array vom Typ Obst.
 */
public class ObstTest {
    public static void main(String[] args) {
        Obst[] lager;

        Apfel apfel1 = new Apfel("Apfel1","Gruen");
        Apfel apfel2 = new Apfel("Apfel2", "Rot");
        Birne birne = new Birne("Birne","Gruen");
        Orange orange = new Orange("Orange1","orange");

        lager = new Obst[]{apfel1,apfel2,birne,orange};

        Obstlager obstlager = new Obstlager(lager);
        obstlager.print();
    }
    
}