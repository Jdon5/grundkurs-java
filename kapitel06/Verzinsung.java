package kapitel06;

/**
 * Aufgabe 14: Verzinsung eines Anfangkapitals nach einer bestimmten
 * Anzahl an Jahren iterativ und rekursiv
 */
public class Verzinsung {

    // Verzinsung des Kapital (iterativ)
    public static double zinsen(double kapital, double zinssatz, int jahre){

        for(int i = 1; i <= jahre; i++ ){
            kapital *= (1+zinssatz);
        }

        return kapital;
    }

    // Verzinsung des Kapital (rekursiv)
    public static double zinsenRekursiv(double kapital, double zinssatz, int jahre){

        if(jahre == 0)
            return kapital;

        return zinsenRekursiv(kapital, zinssatz, jahre-1) * (1+zinssatz);

    }

    public static void main(String[] args) {
        // Test1: Verzinsung des Kapital
        double kapital1 = zinsen(2000, .025, 3);
        double kapital2 = zinsenRekursiv(2000, .025, 3);

        System.out.println(kapital1);
        System.out.println(kapital2);

    }  
}