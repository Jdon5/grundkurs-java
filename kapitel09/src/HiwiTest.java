import hiwi.*;

/**
 * HiwiTest
 */


public class HiwiTest {
    public static void main(String[] args) {
        Hiwi hiwi = new Hiwi("Jesse", 10017729, 2000, 5);

        System.out.println(hiwi.getName());
        System.out.println(hiwi.getMatrNr());
        System.out.println(hiwi.getGehalt());
        System.out.println(hiwi.getDauer());
        
    }
}