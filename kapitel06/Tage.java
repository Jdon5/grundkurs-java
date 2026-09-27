package kapitel06;

/**
 * Aufgabe 16: Methode tage(jahr, monat) liefert die Anzahl der Tage
 * des angegebenen Monats im angegebenen Jahr. Bei Februar wird
 * geprueft, ob es sich um ein Schaltjahr handelt. Bei ungueltiger
 * Monatszahl wird 0 zurueckgegeben.
 */

public class Tage {

    public static int tage(int jahr, int monat){
        if(monat == 1){
            return 31;
        } else if(monat == 2){
            if( jahr % 4 == 0 ) {
                if(jahr % 100 == 0) {
                    if(jahr% 400 == 0) {
                        return 29;
                    } else {
                        return 28;
                    }
                } else {
                    return 29;
                }
            } else {
                return 28;
            }
        } else if(monat == 3){
            return 31;
        } else if(monat == 4){
            return 30;
        } else if(monat == 5){
            return 31;
        } else if(monat == 6){
            return 30;
        } else if(monat == 7){
            return 31;
        } else if(monat == 8){
            return 31;
        } else if(monat == 9){
            return 30;
        } else if(monat == 10){
            return 31;
        } else if(monat == 11){
            return 30;
        } else if(monat == 12){
            return 31;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(tage(2024, 2)); // Schaltjahr -> erwartet 29
        System.out.println(tage(1900, 2)); // durch 100, nicht durch 400 -> erwartet 28
        System.out.println(tage(2000, 2)); // durch 400 -> erwartet 29
        System.out.println(tage(2023, 4)); // normaler Monat -> erwartet 30

    }
}