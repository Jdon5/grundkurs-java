import rechnen.*;

/**
 * Testet alle vier Grundrechenarten des Enums Calculate
 * mit denselben beiden Zahlen.
 */
    public class CalculateTest {

    public static void main(String[] args) {
        double x = 10;
        double y = 4;

        // erwartet -> ADDITION 14.0, SUBTRACTION 6.0,
        //             MULTIPLICATION 40.0, DIVISION 2.5
        for (Calculate rechenart : Calculate.values()) {
            System.out.println(rechenart + ": " + rechenart.compute(x, y));
        }
    }
}