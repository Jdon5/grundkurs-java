package kapitel04;

/**
 * Aufgabe 16: Berechnet die Quersumme einer vorgegebenen ganzen
 * Zahl. Die Quersumme einer Zahl ist die Summe aller ihrer Ziffern.
 */
public class Quersumme {

    public static void main(String[] args) {
        int num = 32; 
        int sum = 0;

        while(num>0) {
            sum += (num%10); // letzte Ziffer herausholen und aufsummieren
            num/=10; // letzte Ziffer abschneiden
        }
        System.out.println(sum);
    }
}