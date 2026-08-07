package kapitel03;

/**
 * Aufgabe 6: Schreiben Sie ein Programm, das auf Basis eines
 * vorgegebenen Radius den Durchmesser, den Umfang und die
 * Flaeche eines Kreises berechnet.
 */
public class Kreis {

    public static void main(String[] args) {
        double radius = 4; 
        double pi = 3.14159;

        // Durchmesser
        double durchmesser = 2 * radius;
        System.out.println("Durchmesser ist: " + durchmesser);

        // Umfang
        double umfang = 2 * pi * radius; 
        System.out.println("Umfang ist: " + umfang);

        // Flaeche
        double flaeche = pi * radius * radius;
        System.out.println("Flaeche ist: " + flaeche);

    }
}