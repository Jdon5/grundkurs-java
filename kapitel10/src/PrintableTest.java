import drucker.*;
/**
 * Testet Printer: Drucken ohne eingestellten Drucker sowie
 * Wechsel zwischen Farb- und Schwarz-Weiss-Drucker zur Laufzeit.
 */
public class PrintableTest {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Printable mono = new MonochromePrinter();
        Printable color = new ColorPrinter();
        printer.print();
        printer.print();
        printer.switchTo(color);
        printer.print();
        printer.print();
        printer.switchTo(mono);
        printer.print();
        printer.print();

    }
    
}