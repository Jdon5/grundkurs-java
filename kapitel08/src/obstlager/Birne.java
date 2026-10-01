package obstlager;

/**
 * Birne
 */
public class Birne extends Obst{

    public Birne(String name, String farbe){
        super(name,farbe);
    }

    public String getName(){
        return name; 
    }
    
    public String getFarbe(){
        return farbe;
    }
}