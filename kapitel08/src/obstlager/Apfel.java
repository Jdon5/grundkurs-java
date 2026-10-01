package obstlager;

/**
 * Aufgabe 5: Klasse Apfel, abgeleitet von Obst.
 */
public class Apfel extends Obst{
    

    public Apfel(String name, String farbe){
       super(name,farbe);
    }

    public String getName(){
        return name; 
    }

    public String getFarbe(){
        return farbe;
    }
    
}