package hiwi;

/**
 * Aufgabe 4: Interface Angestellter, erweitert Person um das
 * Gehalt.
 */
public interface Angestellter extends Person{
    double getGehalt();
    void setGehalt(double gehalt);
    
}