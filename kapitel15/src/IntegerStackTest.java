import deep_copy.*;
/**
 * Testet die tiefe Kopie: Nach dem Klonen und einer Aenderung der
 * Kopie bleibt das Original unveraendert.
 */
public class IntegerStackTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        IntegerStack stack1  = new IntegerStack(5);

        for(int i = 0; i < 5; i++){
            stack1.push(i);
        }

        IntegerStack stack2 = stack1.clone();

        stack2.pop();
        stack2.push(99);


        stack1.display();
        System.out.println();
        stack2.display();
        System.out.println();
        System.out.println(stack1 == stack2);
    }
}