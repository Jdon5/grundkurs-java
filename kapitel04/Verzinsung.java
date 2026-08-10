package kapitel04;

/**
 * Aufgabe 6: Ermittelt, wie hoch ein Guthaben von 5000 Geldeinheiten
 * bei 1,5 % Verzinsung nach Ablauf eines Jahres ist.
 */
public class Verzinsung {

    public static void main(String[] args) {
        double guthaben = 5000;
        double zins = 0.015; // 1,5 % Verzinsung
        int jahre = 1;

        for(int i = 0; i<jahre; i++){
            guthaben *= (1+zins);
        }

        System.out.println(guthaben);

    }
}