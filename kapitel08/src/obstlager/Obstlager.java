package obstlager;

/**
 * Aufgabe 5: Verwaltet ein Array verschiedener Obstsorten.
 * print() gibt Name und Farbe jeder enthaltenen Frucht aus,
 * unabhaengig von der konkreten Obstsorte (Polymorphie).
 */
public class Obstlager {

    private Obst[] obstlager;

    public Obstlager(Obst[] obstlager){
        this.obstlager = obstlager; 
    }

    public void print(){
        for (Obst i: obstlager){
            System.out.println("Name: "+i.getName()+" farbe: "+i.getFarbe());
        }
    }
}