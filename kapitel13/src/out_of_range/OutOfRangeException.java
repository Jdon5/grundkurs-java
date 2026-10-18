package out_of_range;

/**
 * Aufgabe 6: Nicht kontrollierte Ausnahme fuer Werte ausserhalb
 * eines gueltigen Bereichs. Stellt den ungueltigen Wert sowie die
 * untere und obere Grenze ueber Getter zur Verfuegung.
 */
public class OutOfRangeException extends RuntimeException {
    private int wert;
    private int untereGrenze;
    private int obereGrenze;


    public OutOfRangeException(String message, int wert, int untereGrenze, int obereGrenze){
        super(message);
        this.wert = wert; 
        this.obereGrenze = obereGrenze; 
        this.untereGrenze = untereGrenze;
    }

    public int getWert(){
        return wert;
    }

    public int getObereGrenze(){
        return obereGrenze;
    }

    public int getUntereGrenze(){
        return untereGrenze;
    }
    
}