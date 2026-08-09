package kapitel04;
/**
 * Aufgabe 3: Schreibt ein Programm, das eine vorgegebene Anzahl von
 * Sternchen (*) in Form eines Dreiecks ausgibt. Die Zeilen werden
 * nacheinander mit steigender Länge (1, 2, 3, ...) gefüllt, bis
 * die vorgegebene Gesamtanzahl n erreicht ist. Reicht die letzte
 * Zeile nicht mehr komplett aus, wird nur der Rest ausgegeben.
 */
public class Sternchen {

    public static void main(String[] args) {
        int n = 24; // Sternchenanzahl

        int sum = 0; // Summe der bereits verplanten Sternchen (inkl. aktueller Zeile)
        for(int i = 1; sum < n; i++ ){ 
            sum += i; // sum wäre die Gesamtzahl, wenn die Zeile komplett mit i Sternchen gefüllt wird
            for(int j = 0; j<i; j++){
                if(n > sum){
                    // genug Sternchen übrig: Zeile komplett mit i Sternchen füllen
                    System.out.print("* ");
                } else {
                    // nicht mehr genug Sternchen für eine volle Zeile:
                    // nur die tatsächlich noch übrigen (n - vorherige Summe) ausgeben
                    for(int k = sum - i; k < n; k++){
                    System.out.print("* ");
                    }   
                    break; // Zeile ist fertig, restliche j-Durchläufe überspringen
                    }
                }
                System.out.println();
            }
        }
    }