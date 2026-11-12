package dienstleister.demo;
import java.util.ServiceLoader;

import dienstleister.demo.api.Dienstleistung;

/**
 * Aufgabe 3: Service Consumer, der in einem Programmlauf mehrere
 * Implementierungen von Dienstleistung nutzt: zuerst eine bestimmte
 * ueber ihren Namen, dann alle registrierten nacheinander.
 */
public class Consumer {

    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Dienstleistung angeben: java dienstleister.demo.Consumer <Dienstleistung>");
            return; 
        }

        // Teil 1: eine bestimmte Dienstleistung ueber ihren Namen auswaehlen
        System.out.println("--- ausgewaehlte Dienstleistung ---");
        try {
            Dienstleistung dl = Dienstleistung.forDienstleistung(args[0]);
            dl.arbeit();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teil 2: alle registrierten Dienstleistungen in einem Lauf nutzen
        System.out.println("--- alle Dienstleistungen ---");

        ServiceLoader serviceLoader = ServiceLoader.load(Dienstleistung.class);
        for (Object service : serviceLoader) {

            Dienstleistung dl = (Dienstleistung) service;
            dl.arbeit();
        }
    }
}