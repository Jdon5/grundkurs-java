package analyse;

/**
 * Aufgabe 3: Ermittelt fuer eine als Kommandozeilen-Parameter
 * uebergebene Zeichenkette die Anzahl der Kleinbuchstaben,
 * Grossbuchstaben, Leerzeichen und sonstigen Zeichen.
 */
public class Analyse {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Bitte Zeichenkette eingeben");
            System.out.println("analyse.Analyse <'Zeichenkette'>");
            return; 
        }

        String text = args[0];
        int countSmallLetter = 0;
        int countBigLetter = 0;
        int countSpace = 0;
        int otherCharacters = 0;

        for (int i = 0; i < text.length(); i++ ){
            char c = text.charAt(i);
            if(Character.isLowerCase(c)) {
                countSmallLetter++;
            } else if (Character.isUpperCase(c)) {
                countBigLetter++;
            } else if (Character.isSpaceChar(c)){
                countSpace++;
            } else  {
                otherCharacters++;
            }
        }

        System.out.println("Anzahl kleiner Buchstaben: " + countSmallLetter);
        System.out.println("Anzahl grosser Buchstaben: " + countBigLetter);
        System.out.println("Anzahl Leerzeichen: " + countSpace);
        System.out.println("Anzahl sonstiger Zeichen: " + otherCharacters);

       
    }
}