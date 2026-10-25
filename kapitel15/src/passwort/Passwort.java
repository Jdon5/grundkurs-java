package passwort;

/**
 * Aufgabe 2: Bewertet die Qualitaet eines Passworts, das als
 * Kommandozeilen-Parameter uebergeben wird. Fuer jede erfuellte
 * Regel gibt es einen Punkt: mindestens 8 Zeichen, Klein- und
 * Grossbuchstaben, Ziffern, Sonderzeichen.
 */
public class Passwort {
    public static int checkLength(String passwort) {

        if (passwort.length() >= 8) {
            return 1;
        } else {
            return 0;
        }  
    }

    public static int checkUpperAndLowerCase(String passwort) {
        char c;
        boolean small = false; 
        boolean big = false; 

        for(int i = 0; i < passwort.length(); i++){
            c = passwort.charAt(i);

            if (Character.isUpperCase(c)) {
                big = true; 
            } else if(Character.isLowerCase(c)){
                small = true;
            }
        }

        if (small && big) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int checkDigit(String passwort) {
        char c;
        boolean digit = false;

        for(int i = 0; i < passwort.length(); i++){
            c = passwort.charAt(i);

            if (Character.isDigit(c)) {
                digit = true; 
            } 
        }

        if (digit) {
            return 1; 
        } else {
            return 0;
        }
    }

    public static int checkSpecialCharacter(String passwort) {
        char c;
        boolean specialCharacter = false;

        for(int i = 0; i < passwort.length(); i++){
            c = passwort.charAt(i);

            if (!(Character.isLetterOrDigit(c))) {
                specialCharacter = true; 
            } 
        }

        if (specialCharacter) {
            return 1; 
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Aufruf: java passwort.Passwort <Zeichenkette>");
            return;
        }

        int punkte = checkLength(args[0]) + checkUpperAndLowerCase(args[0]) + checkDigit(args[0]) + checkSpecialCharacter(args[0]);

        if(punkte <= 2){
            System.out.println("Schwaches Passwort");
        } else if (punkte == 3) {
            System.out.println("Gutes Passwort");
        } else {
            System.out.println("Starkes Passwort");
        }

        System.out.println(punkte +" von 4 Punkten" );
    }
}