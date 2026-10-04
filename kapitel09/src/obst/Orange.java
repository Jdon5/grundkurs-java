package obst;

/**
 * Aufgabe 3: Klasse Orange, implementiert das Interface Obst.
 */
public class Orange implements Obst{
    private String name;
    private String farbe;

    public Orange(String name, String farbe){
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