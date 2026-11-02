import java.util.Arrays;

import kunde.*;
/**
 * Erzeugt ein Array von Kunden und sortiert es mit Arrays.sort
 * aufsteigend nach dem Namen.
 */
public class KundeTest {
    public static void main(String[] args) {
        Kunde k1 = new Kunde("Angela","Schulstr");
        Kunde k2 = new Kunde("Jesse","Schimmelhoferring");
        Kunde k3 = new Kunde("Jean","Brettenerstr");
        Kunde k4 = new Kunde("Sharon","Bertramstr");
        Kunde k5 = new Kunde("Brevi", "Modemannstr");

        Kunde[] kunden = {k1, k2, k3, k4, k5 };

        System.out.println("vor dem Sortieren:  " + Arrays.toString(kunden));
        Arrays.sort(kunden);
        System.out.println("nach dem Sortieren:  " + Arrays.toString(kunden));


    }
    
}