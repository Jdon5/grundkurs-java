import woerter2.*;

/**
 * Woerter2Test
 */
public class Woerter2Test {

    public static void main(String[] args) {
        String text = "es ist was es ist, und es bleibt.";
        for (String eintrag : Woerter2.extract(text, " ,.")) {
            System.out.println(eintrag);
        }
    }
}