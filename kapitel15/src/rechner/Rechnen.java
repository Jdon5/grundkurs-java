package rechner;
/**
 * Aufgabe 1: Rechner fuer die vier Grundrechenarten mit
 * Gleitkommazahlen. Wird mit drei Kommandozeilen-Parametern
 * aufgerufen, z. B. 114.5 + 2.5 (Multiplikation im Terminal
 * als '*' angeben). Falsche Parameteranzahl und ungueltige
 * Zahlen werden abgefangen.
 */
public class Rechnen {
    public static void main(String[] args) {
        // Pruefung, ob genau drei Parameter uebergeben wurden
        if (args.length != 3) {
            System.out.println("Aufruf: java rechner.Rechnen <Zahl> <Operator> <Zahl>");
            System.out.println("Beispiel: java rechner.Rechnen 114.5 + 2.5");
            return;
        }
        

        try {
            double num1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double num2 = Double.parseDouble(args[2]);

            switch (operator) {
            case "+" -> System.out.println(num1+num2);
            case "-" -> System.out.println(num1-num2);
            case "*" -> System.out.println(num1*num2);
            case "/" -> System.out.println(num1/num2);
            default -> System.out.println("Rechenoperator: + - * / nutzen");
        }
        } catch (NumberFormatException e) {
            System.out.println("Bitte zwei Zahlen eingeben, z. B. 114.5 + 2.5");
        }
    }
}