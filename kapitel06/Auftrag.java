package kapitel06;

/**
 * Aufgabe 9: Klasse Auftrag haelt eine Referenz auf den bestellten
 * Artikel sowie die bestellte Menge. Die Klassenmethode
 * getGesamtwert() summiert die Auftragswerte (Menge x Artikelpreis)
 * ueber eine beliebige Anzahl von Auftraegen (Varargs).
 */

public class Auftrag {
    private Artikel artikel;
    private int menge;

    public Auftrag(Artikel artikel, int menge){
        this.artikel = artikel;
        this.menge = menge;
    }

    public int getMenge(){
        return menge;
    }

    public Artikel getArtikel(){
        return this.artikel;
    }

    public void setArtikel(Artikel artikel){
        this.artikel = artikel;
    }

    public void setMenge(int menge){
        this.menge = menge;
    }

    // summiert Menge * Artikelpreis ueber alle uebergebenen Auftraege
    public static double getGesamtwert(Auftrag... auftraege){
        double gesamtwert = 0;

        for(Auftrag i: auftraege){
            gesamtwert+=(i.artikel.getPreis()*i.menge);
        }

        return gesamtwert;
    }   
}