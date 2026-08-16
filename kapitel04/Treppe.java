package kapitel04;

/**
 * Treppe
 */
public class Treppe {

    public static void main(String[] args) {
        int h = 10;
        int b = 5;
        int helper = b;
        
        
        for(int i = 1; i <= h*helper;i+=helper){
            // leerzeichen
            int l = h*helper;
            
            while(l>=i){
                System.out.print(" ");
                l--;
            }
            
            // sternchen
            for(int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            b+=helper;
            System.out.println();
        }

    }
}