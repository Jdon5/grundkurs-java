package kapitel04;

/**
 * Aufgabe 10: Schreibt ein Programm, das eine ganze Zahl vom Typ int
 * in Binaerdarstellung (32 Bit) ausgibt, unter Verwendung der
 * Bitoperatoren & und <<.
 */
public class Binaer {

    public static void main(String[] args) {
        int num = 8;
        
        // Bit-Positionen von 31 (hoechstwertig) bis 0 (niedrigstwertig) durchgehen
        for(int i = 31; i >= 0; i--){
             // num & (1 << i) isoliert das Bit an Position i
            if((num & (1<<i)) == 0){
                System.out.print(0);
            } else {
                System.out.print(1);
            }
        }
    }
}