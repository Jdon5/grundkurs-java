package hiwi;

/**
 * Aufgabe 4: Klasse Hiwi, implementiert StudHilfskraft und damit
 * alle Methoden von Person, Student, Angestellter und
 * StudHilfskraft.
 */
public class Hiwi implements StudHilfskraft {
    private String name;
    private int matrikelnummer;
    private double gehalt;
    private int dauer;

    public Hiwi(String name, int matrikelnummer, double gehalt, int dauer){
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.gehalt = gehalt;
        this.dauer = dauer;
    }
    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getMatrNr(){
        return matrikelnummer;
    }

    public void setMatrNr(int matrikelnummer){
        this.matrikelnummer = matrikelnummer;
    }

    public double getGehalt(){
        return gehalt;
    }

    public void setGehalt(double gehalt){
        this.gehalt = gehalt;
    }

    public int getDauer(){
        return dauer;
    }
    
    public void setDauer(int dauer){
        this.dauer = dauer;
    }
}