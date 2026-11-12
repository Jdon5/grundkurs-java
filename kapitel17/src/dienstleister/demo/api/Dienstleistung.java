package dienstleister.demo.api;
import java.util.ServiceLoader;

/**
 * Aufgabe 3: Service-Interface fuer Dienstleistungen. Jede
 * Implementierung nennt mit getDienstleistung() ihren Namen,
 * sodass ein Consumer gezielt eine bestimmte auswaehlen kann.
 */
public interface Dienstleistung {

    void arbeit();

    String getDienstleistung();

    // liefert die registrierte Implementierung mit dem angegebenen Namen;
    // gibt es keine, wird eine IllegalArgumentException ausgeloest
    static Dienstleistung forDienstleistung(String dienst) {
        ServiceLoader serviceLoader = ServiceLoader.load(Dienstleistung.class);
        for (Object service : serviceLoader) {
            Dienstleistung dienstleistung = (Dienstleistung) service;
            if (dienstleistung.getDienstleistung().equals(dienst)) {
                return dienstleistung;
            }
        }
        throw new IllegalArgumentException("Dienstleistung nicht gefunden:" + dienst); 
    }
}
