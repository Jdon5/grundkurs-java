package hiwi;

/**
 * Aufgabe 4: Interface Student, erweitert Person um die
 * Matrikelnummer.
 */
public interface Student extends Person {

    int getMatrNr();
    void setMatrNr(int matrikelnummer);

}