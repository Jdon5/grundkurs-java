package kapitel06;

/**
 * Aufgabe 13: Implementation einer rekursiven Methode, die eine Zahl n bis auf 0 herunter zählt. 
 * Bei n = 0 soll "ZERO" ausgegeben werden
 */
public class CountDown {

    public static int countdown(int n){
        if(n==0){
            System.out.println("ZERO");
            return 0;
        }
        System.out.println(n);

        return countdown(n-1);
    }
    public static void main(String[] args) {
        countdown(10);
    }
}