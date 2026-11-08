import secret.*;
/**
 * Versteckt einen Beispieltext mit n = 3 und gibt das Ergebnis aus.
 */
public class SecretTest {

    public static void main(String[] args) {
        String text = "Wir treffen uns um acht hinter der Hecke";
        System.out.println(Secret.encrypt(3, text));
    }
}