package clone;

/**
 * Aufgabe 5: Zeigt, dass clone() bei Arrays eine flache Kopie
 * erzeugt: Das Array selbst wird kopiert, die Elemente nicht.
 * Eine Aenderung an einem Element ueber die Kopie ist daher auch
 * im Original sichtbar.
 */
public class CloneTest {

    public static void main(String[] args) {
        // StringBuilder als Elemente, da sie veraenderbar sind
        // (bei Integer oder String waere die Demonstration nicht moeglich)
        StringBuilder sb1 = new StringBuilder("Text1");
        StringBuilder sb2 = new StringBuilder("Text2");
        StringBuilder[] arr1 = {sb1, sb2};

        // flache Kopie: neues Array mit denselben Referenzen
        StringBuilder[] arr2 = arr1.clone();

        // Element ueber die Kopie veraendern
        arr2[1].append("s");
        
        // gleiches Element in beiden Arrays -> true
        System.out.println(arr1[1] == arr2[1]);

        // Aenderung ist auch im Original sichtbar -> Text2s
        System.out.println(arr1[1].toString());
        System.out.println(arr2[1].toString());

        // die Arrays selbst sind verschieden -> false
        System.out.println(arr1 == arr2);        
    }
}