import java.io.FileInputStream;
import java.io.IOException;
import adressen.*;

public class MailAdressenTest {
    public static void main(String[] args) throws IOException{
        MailAdressen mailAdressen = new MailAdressen();

        // Eintraege aus der Datei laden
        mailAdressen.laden("kapitel15/src/adressen/adressen.txt");

        // zusaetzlichen Eintrag hinzufuegen
        mailAdressen.hinzufuegen("max", "max@example.com");

        // alle Eintraege ausgeben
        System.out.println("Alle Eintraege:");
        mailAdressen.display();

        // Zugriff ueber Namen
        // erwartet -> jesse12@gmail.com (aus der Datei)
        System.out.println("jesse12 aus der Datei: " + mailAdressen.getAdresse("jesse12"));
        // erwartet -> max@example.com (ueber hinzufuegen)
        System.out.println("max: " + mailAdressen.getAdresse("max"));
        // unbekannter Name, erwartet -> null
        System.out.println("unbekannt: " + mailAdressen.getAdresse("unbekannt"));
    }
}
