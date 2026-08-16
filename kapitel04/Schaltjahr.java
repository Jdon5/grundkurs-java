package kapitel04;

/**
 * Aufgabe 15: Prueft, ob ein vorgegebenes Jahr ein Schaltjahr ist.
 * Ein Jahr ist ein Schaltjahr, wenn es durch 4 teilbar ist, aber
 * nicht durch 100 - es sei denn, es ist auch durch 400 teilbar.
 */
public class Schaltjahr {

    public static void main(String[] args) {
        int jahr = 2000;

        if( jahr % 4 == 0 ) {
            if(jahr % 100 == 0) {
                if(jahr% 400 == 0) {
                    System.out.println("Schaltjahr");
                } else {
                    System.out.println("Kein Schaltjahr");
                }
            } else {
                System.out.println("Schaltjahr");
            }
        } else {
            System.out.println("Kein Schaltjahr");
        }
    }
}