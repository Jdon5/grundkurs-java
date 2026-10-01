package obstlager;

public class Orange extends Obst{

    public Orange(String name, String farbe){
        super(name,farbe);
    }

    public String getName(){
        return name; 
    }
    
    public String getFarbe(){
        return farbe;
    }
    
}