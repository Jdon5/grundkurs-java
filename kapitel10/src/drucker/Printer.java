package drucker;

/**
 * Aufgabe 2: Delegiert das Drucken an den aktuell eingestellten
 * Drucker. switchTo() wechselt den Drucker zur Laufzeit. Ist noch
 * kein Drucker eingestellt, gibt print() einen Hinweis aus.
 */
public class Printer {
    private Printable printer;
    

    public void switchTo(Printable printer){
        this.printer = printer;
    }

    public void print(){
        if (printer != null){
            printer.print();
        } else {
            System.out.println("Kein Drucker ausgewaehlt. Bitte zuerst mit switchTo() einen Drucker einstellen.");
        }
    }

}