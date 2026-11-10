package factory;

/**
 * Aufgabe 1: Fabrik-Methode createService(), die ein Objekt einer
 * Klasse erzeugt, deren Name als String uebergeben wird. Die Klasse
 * muss das Interface Service implementieren. So lassen sich
 * Implementierungen austauschen, ohne das Programm zu aendern.
 */
public class ServiceFactory {

    public static Service createService(String name) throws Exception {

        Class c = Class.forName(name);

        Service s = (Service) c.getDeclaredConstructor().newInstance();

        return s;
    }
}