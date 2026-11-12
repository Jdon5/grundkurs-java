package dienstleister.demo.impl;
import dienstleister.demo.api.Dienstleistung;
/**
 * Aufgabe 3: Service Provider fuer die Dienstleistung "IT-Support".
 */
public class ITSupport implements Dienstleistung {

    @Override
    public String getDienstleistung(){
        return "IT-Support"; 
    }

    @Override
    public void arbeit(){
        System.out.println("IT-Support");
    }
}
