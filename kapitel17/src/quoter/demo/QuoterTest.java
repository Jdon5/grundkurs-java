package quoter.demo;
import quoter.demo.api.Quoter;

/**
 * Service Consumer: holt sich ueber Quoter.newInstance() eine
 * Implementierung, ohne GermanQuoter selbst zu kennen, und gibt
 * einen Text in Anfuehrungszeichen aus.
 */
public class QuoterTest {
    public static void main(String[] args) {
        Quoter quoter = Quoter.newInstance();
        if (quoter != null)
            System.out.println(quoter.quote("Beispiel"));
        
    }
    
}