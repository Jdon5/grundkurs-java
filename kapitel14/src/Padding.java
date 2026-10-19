/**
 * Aufgabe 2: Methoden padStart() und padEnd(), die einen String am
 * Anfang bzw. Ende mit einem Auffuellzeichen bis zur vorgegebenen
 * Laenge ergaenzen. Ist der String bereits mindestens so lang,
 * wird er unveraendert zurueckgegeben.
 */
public class Padding {

    // fuellt str am Anfang mit pad auf, bis die Laenge length erreicht ist
    public static String padStart(String str, int length, char pad){
        StringBuilder sb = new StringBuilder();

        while(str.length() + sb.length() < length){
            sb.append(pad);
        }
        sb.append(str); 

        return sb.toString(); 
    }

    // fuellt str am Ende mit pad auf, bis die Laenge length erreicht ist
    public static String padEnd(String str, int length, char pad){
        StringBuilder sb = new StringBuilder(str);
        while(sb.length() < length){
            sb.append(pad);
        }
        return sb.toString(); 
    }

    public static void main(String[] args) {
        String s = "Jesse";
        System.out.println(padStart(s,10,'+'));
        System.out.println(padEnd(s,10,'+'));
    }
}