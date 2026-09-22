package kapitel06;

/**
 * StapelTest
 */
public class StapelTest {

    public static void main(String[] args) {
        Stapel stapel1 = new Stapel();
        Stapel stapel2 = new Stapel();

        stapel1.push(1);
        stapel1.push(2);
        stapel1.push(1);
        stapel1.push(2);
        stapel1.displayStack();
        System.out.println();

        stapel2.push(1);
        stapel2.push(2);
        stapel2.push(3);
        stapel2.push(4);
        stapel2.push(5); // loest die automatische Vergroesserung aus
        stapel2.displayStack();

        System.out.println();
        System.out.println("Nach pop(): " + stapel1.pop());
        stapel1.displayStack();
    }
}