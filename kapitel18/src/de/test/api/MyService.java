package de.test.api;
import java.util.ServiceLoader;
/**
 * 
 * Service-Interface, die den genutzen Service zeigt. 
 * Die Implementierung wird ueber den ServiceLoader
 * gefunden, der sie aus META-INF/services/de.test.api.MyService
 * liest.
 */
public interface MyService {
    /**
     * {@summary Ausgabe der genutzten Dienstleistung}
     */
    void show();


    /**
     * {@summary Liefert die erste Implementierung, die der ServiceLoader
     * ueber META-INF/services/de.test.api.MyService findet.}
     * @return die erste gefundene Implementierung, oder null, wenn keine
     * registriert ist
     */
    static MyService newInstance() {
        ServiceLoader serviceLoader = ServiceLoader.load(MyService.class);
        for (Object service : serviceLoader) {
            return (MyService) service;
        }
        return null;
    } 
}
