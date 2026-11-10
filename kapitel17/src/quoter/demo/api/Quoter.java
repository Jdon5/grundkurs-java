package quoter.demo.api;
import java.util.ServiceLoader;

/**
 * Aufgabe 2: Service-Interface, das einen Text in Anfuehrungszeichen
 * einkleidet. Die Implementierung wird ueber den ServiceLoader
 * gefunden, der sie aus META-INF/services/quoter.demo.api.Quoter
 * liest.
 */
public interface Quoter {

    String quote(String text);

    // liefert die erste gefundene Implementierung, oder null,
    // wenn keine registriert ist
    static Quoter newInstance() {
        ServiceLoader serviceLoader = ServiceLoader.load(Quoter.class);
        for (Object service : serviceLoader) {
            return (Quoter) service; 
        }
        return null;
    }
}