package hiwi;

/**
 * Aufgabe 4: Interface StudHilfskraft, erweitert sowohl Student
 * als auch Angestellter (Mehrfachvererbung bei Interfaces) und
 * ergaenzt die Dauer der Beschaeftigung.
 */
public interface StudHilfskraft extends Student, Angestellter{
    int getDauer();
    void setDauer(int dauer);
    
}