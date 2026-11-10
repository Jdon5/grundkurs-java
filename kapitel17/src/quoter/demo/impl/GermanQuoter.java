package quoter.demo.impl;
import quoter.demo.api.Quoter;

/**
 * Aufgabe 2: Implementierung von Quoter mit deutschen Anfuehrungs-
 * zeichen: tiefgestellt am Anfang (\u201E) und hochgestellt am
 * Ende (\u201D).
 */
public class GermanQuoter implements Quoter {

    @Override
    public String quote(String text) {
        return "\u201E" + text + "\u201D";
    }

}