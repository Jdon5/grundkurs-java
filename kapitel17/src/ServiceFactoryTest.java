import factory.*;

/**
 * Erzeugt ueber ServiceFactory den Service, dessen Klassenname als
 * Kommandozeilen-Parameter angegeben wird, z. B. factory.ServiceA,
 * und ruft work() auf.
 */
public class ServiceFactoryTest {
    public static void main(String[] args) throws Exception {

        Service s = ServiceFactory.createService(args[0]);
        s.work();
    }
    
}
