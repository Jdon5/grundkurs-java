package kapitel06;

/**
 * Aufgabe 5: Klasse Sparbuch mit den Attributen kontonummer, kapital
 * und zinssatz. Bietet Methoden zum Einzahlen, Abheben, Verzinsen
 * sowie zur hypothetischen Ertragsberechnung ueber eine Laufzeit.
 */

public class Sparbuch {
    private int kontonummer;
    private double kapital;
    private double zinssatz;

    public Sparbuch(int kontonummer, double kapital, double zinssatz){
        this.kontonummer = kontonummer;
        this.kapital = kapital;
        this.zinssatz = zinssatz;
    }

    // erhoeht das Guthaben um den angegebenen Betrag
    public void zahleEin(double betrag){
        kapital+=betrag;
    }

    // vermindert das Guthaben um den angegebenen Betrag
    public void hebeAb(double betrag){
        kapital-=betrag;
    }
    
    // berechnet hypothetisch das Kapital mit Zins und Zinseszins nach
    // der vorgegebenen Laufzeit, OHNE das tatsaechliche Kapital zu veraendern
    public double getErtrag(int laufzeit){
        double ertrag = kapital;

        for(int i =1; i<=laufzeit; i++){
            ertrag*=(1+zinssatz);
        }

        return ertrag; 
    }

    // erhoeht das tatsaechliche Guthaben dauerhaft um den Jahreszins
    public void verzinse(){
        kapital*=(1+zinssatz);
    }

    public int getKontonummer(){
        return kontonummer;
    }

    public double getKapital(){
        return kapital;
    }

    public double getZinssatz(){
        return zinssatz; 
    }

}