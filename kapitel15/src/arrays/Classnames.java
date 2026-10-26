package arrays;

/**
 * Classnames
 */
public class Classnames {

    public static void main(String[] args) {
        
        Class c1 = new int[]{}.getClass();
        System.out.println(c1.getName());

        Class c2 = new double[]{}.getClass();
        System.out.println(c2.getName());

        Class c3 = new String[]{}.getClass();
        System.out.println(c3.getName());
       
    }
}