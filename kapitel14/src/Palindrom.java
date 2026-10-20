/**
 * Aufgabe 4: Methode isPalindrom(), die prueft, ob ein Text vorwaerts
 * und rueckwaerts gelesen gleich ist. Gross- und Kleinschreibung,
 * Satzzeichen und Leerzeichen werden nicht beruecksichtigt.
 */
public class Palindrom {

    public static boolean isPalindrom(String text){

        StringBuilder sb1 = new StringBuilder(text.toLowerCase());
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        for(int i = 0; i < sb1.length();i++){
            char c = sb1.charAt(i);

            if ((Character.isLetterOrDigit(c))){
                sb2.append(c);
            } 
        }
        
        for(int i = sb2.length()-1; i >= 0; i--){
            char c = sb2.charAt(i);
            sb3.append(c);
        }

        return sb2.toString().equals(sb3.toString());
    }

    public static void main(String[] args) {
        // Kleinbuchstaben, erwartet -> true
        System.out.println(isPalindrom("anna"));
        // Grossschreibung, erwartet -> true
        System.out.println(isPalindrom("Anna"));
        // Leer- und Satzzeichen, erwartet -> true
        System.out.println(isPalindrom("Ein Esel lese nie."));
        // kein Palindrom, erwartet -> false
        System.out.println(isPalindrom("Jesse"));
    }
}