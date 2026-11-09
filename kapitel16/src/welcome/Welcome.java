package welcome;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Aufgabe 1: Gibt einen Begruessungstext fuer das ueber die
 * Kommandozeile angegebene Gebietsschema aus (Sprachcode und
 * Laendercode, z. B. de DE, en US, fr FR). Die Texte stehen im
 * Ressourcenbuendel welcome.Messages.
 */
public class Welcome {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Aufruf: java welcome.Welcome <Sprachcode> <Laendercode>");
            System.out.println("Beispiel: java welcome.Welcome de DE");
            return;
        }
        
        ResourceBundle res = ResourceBundle.getBundle("welcome.Messages",Locale.of(args[0], args[1]));
            
        System.out.println(res.getString("greeting"));
    }
}