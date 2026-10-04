package obst;

/**
 * Aufgabe 3: Klasse Apfel, implementiert das Interface Obst.
 */
public class Apfel implements Obst{
    private String name;
    private String farbe;

    public Apfel(String name, String farbe){
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