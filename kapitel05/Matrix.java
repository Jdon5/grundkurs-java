package kapitel05;

/**
 * Aufgabe 2: Erzeugt ein int-Array von 20 x 20 Elementen und
 * initialisiert jedes Element mit dem Produkt seiner Indizes.
 */
public class Matrix {

    public static void main(String[] args) {

        int[][] arr = new int[20][20]; 
        

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j< arr[i].length; j++ ) {
                arr[i][j] = i * j;
                System.out.print(arr[i][j]+ "\t" );
            }
            System.out.println();
        }
    }
}