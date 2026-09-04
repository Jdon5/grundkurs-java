package kapitel05;

/**
 * Aufgabe 1: Berechnet fuer ein mit Zahlen initialisiertes int-Array
 * den kleinsten und den groessten Wert sowie den Mittelwert.
 */
public class Statistik {
    public static void main(String[] args) {
        int[] arr = new int[] {1,4,5,12,8,67};
        int big = arr[0];
        int small = arr[0];
        double mittelwert = 0;

        for(int i = 0; i < arr.length; i++) {   // double, damit die Division spaeter reell erfolgt

            mittelwert += arr[i];
             
            if ( big < arr[i] )
                big = arr[i];

            if ( small > arr[i] )
                small = arr[i];
        }

        System.out.println("Mittelwert: " + mittelwert / arr.length);
        System.out.println("Größte Zahl: " + big);
        System.out.println("Kleinste Zahl: " + small);

    }

}