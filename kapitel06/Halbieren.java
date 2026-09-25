package kapitel06;

/**
 * Halbieren
 */
public class Halbieren {

    //double zahl wird solange halbiert, bis sie eine bestimmte Zahl unterschreitet
    public static double halbieren(double num, int end){
        // ende der Rekursion
        if(num<=end){
            return num;
        }

        //double zahl wird halbiert
        return halbieren(num/2, end);

    }

    public static void main(String[] args) {

        double num = halbieren(500,12);
        System.out.println(num);
    }
}