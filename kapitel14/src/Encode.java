/**
 * Aufgabe 3: Methode encode(), die einen Text verschluesselt: Alle
 * Buchstaben werden kleingeschrieben und durch ihre Position im
 * Alphabet ersetzt (a = 1 ... z = 26). Umlaute und ss werden wie
 * ae, oe, ue und ss behandelt, alle anderen Zeichen ignoriert.
 */
public class Encode {
    public static String encode(String text){

        StringBuilder sb = new StringBuilder(text.toLowerCase());
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        for(int i = 0; i < sb.length();i++){
            char c = sb.charAt(i);

            if ((Character.isLetter(c))){
                sb2.append(c);
            } 
        }

        for(int i = 0; i < sb2.length(); i++){
            char c = sb2.charAt(i);

            switch(c){
                case 'ä' -> sb2.replace(i, i+1, "ae");
                case 'ö' -> sb2.replace(i, i+1, "oe");
                case 'ü' -> sb2.replace(i, i+1, "ue");
                case 'ß' -> sb2.replace(i, i+1, "ss");
            }
        }

        for(int i = 0; i < sb2.length(); i++){
            char c = sb2.charAt(i);
            int charToInt = c-96;
            sb3.append(String.valueOf(charToInt));
        }

        return sb3.toString(); 
    }

    public static void main(String[] args){

        // ein Nicht-Buchstabe, erwartet -> 1111
        System.out.println(encode("aaa,a"));
        // zwei Nicht-Buchstaben hintereinander, erwartet -> 111
        System.out.println(encode("aa, a"));
        // Grossbuchstaben und Leerzeichen, erwartet -> 89938291410519195
        System.out.println(encode("Hi, ich bin Jesse"));
        // Umlaut, erwartet -> 21518
        System.out.println(encode("Bär"));
        // ß, erwartet -> 192018119195
        System.out.println(encode("Straße"));
        
    }
}