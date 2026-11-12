package de.test;
import de.test.api.MyService;
/**
 * Service Consumer: holt sich ueber MyService.newInstance() eine
 * Implementierung, ohne MyServiceImpl selbst zu kennen, und gibt den genutzen Service
 * auf der Konsole aus
 */

public class Consumer {
    /**
     * {@summary Holt eine Implementierung von MyService und ruft show() auf.}
     * @param args wird nicht benoetigt
     **/
    public static void main(String[] args) {
        MyService myService = MyService.newInstance();
        if (myService != null)
            myService.show();
    }
    
}
