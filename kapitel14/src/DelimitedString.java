/**
 * Aufgabe 1: Methode delimitedString(), die den Teilstring von s
 * liefert, der mit dem Zeichen start beginnt und mit dem Zeichen
 * end endet.
 */
public class DelimitedString {
    // liefert den Teilstring von s, der mit start beginnt und mit end
    // endet (beide Zeichen eingeschlossen); kommt eines der beiden
    // Zeichen nicht vor, wird null zurueckgegeben
    public static String delimitedString(String s, char start, char end){
        int pos1 = s.indexOf(start);
        int pos2 = s.indexOf(end,pos1+1);

        if(pos1 < 0){
            return null;
        } else if (pos2 < 0){
            return null;
        } else {
            return s.substring(pos1,pos2+1);
        }
    }

    public static void main(String[] args) {
        // erwartet -> in Je
        System.out.println(delimitedString("Ich bin Jesse", 'i', 'e'));
        // gleiches Start- und Endzeichen, erwartet -> "Hallo"
        System.out.println(delimitedString("Er sagte \"Hallo\" laut", '"', '"'));
        // Startzeichen fehlt, erwartet -> null
        System.out.println(delimitedString("Ich bin Jesse", 'x', 'e'));
        // Endzeichen fehlt, erwartet -> null
        System.out.println(delimitedString("Ich bin Jesse", 'i', 'z'));
    }  
}