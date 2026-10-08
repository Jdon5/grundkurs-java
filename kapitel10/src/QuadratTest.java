import quadrat.*;


public class QuadratTest {
    public static void main(String[] args) {

        Quadrat q = new Quadrat(5);
        System.out.println(q.getFlaeche());   // erwartet 25
        q.setLaenge(10);
        System.out.println(q.getFlaeche());   // erwartet 100
        q.setBreite(20);
        System.out.println(q.getLaenge());    // erwartet 20
        System.out.println(q.getFlaeche());   // erwartet 400

    }
}