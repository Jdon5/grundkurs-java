package obst;

/**
 * Aufgabe 3: Klasse Birne, implementiert das Interface Obst.
 */
public class Birne implements Obst{
    private String name;
    private String farbe;

    public Birne(String name, String farbe){
        this.name = name;
        this.farbe = farbe;
    }

    public String getName(){
        return name; 
    }
    
    public String getFarbe(){
        return farbe;
    }
}