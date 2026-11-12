package dienstleister.demo.impl;
import dienstleister.demo.api.Dienstleistung;
/**
 * Aufgabe 3: Service Provider fuer die Dienstleistung
 * "IT-Projekt-Leitung".
 */
public class ITProjektLeitung implements Dienstleistung{

    @Override
    public String getDienstleistung(){
        return "IT-Projekt-Leitung"; 
    }

    @Override
    public void arbeit() {
        System.out.println("IT-Projekt-Leitung");
    }
    
}
