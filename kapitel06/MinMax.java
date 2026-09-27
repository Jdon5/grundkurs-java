package kapitel06;

/**
 * Aufgabe 18: Ermittelt Minimum und Maximum einer beliebigen Anzahl
 * von double-Werten (Varargs) und liefert das Ergebnis als Instanz
 * des Records MinMaxValues zurueck.
 */
public class MinMax{

    public record MinMaxValues(double min, double max){

    }

    public static MinMaxValues minMax(double a, double... args){
        double max = a;
        double min = a;

        // ermittelt min und max in einem einzigen Schleifendurchlauf
        for(double i: args){
            if(max < i){
                max = i;
            }
            if(min > i){
                min = i;
            }
        }

        return new MinMaxValues(min,max);
    }
}