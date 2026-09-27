package kapitel06;

/**
 * DatumTest
 */
public class DatumTest {

    public static void main(String[] args) {


        // Test 1: erwartete Ausgabe -> 12.12.2024
        new Datum(12, 12, 2024).display();

        //Test 2: erwartete Ausgabe -> invalid;
        new Datum(0,12,2024).display();

        //Test 3: erwartete Ausgabe -> invalid
        new Datum(1,13,2024).display();

        // Test 4: erwartetet Ausgabe -> 31.12.2024
        new Datum(31, 12, 2024).display();
    }
}