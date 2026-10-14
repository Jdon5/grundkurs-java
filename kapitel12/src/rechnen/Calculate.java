package rechnen;

/**
 * Aufgabe 2: Aufzaehlung der vier Grundrechenarten. Jede Konstante
 * ueberschreibt die abstrakte Methode compute() mit ihrer eigenen
 * Berechnung (konstantenspezifische Methodenimplementierung).
 */

public enum Calculate {

    ADDITION {
        @Override
        public double compute(double x, double y) {
            return x + y; 
        }
    },
    SUBTRACTION {
        @Override
        public double compute(double x, double y) {
            return x - y; 
        }
    },
    MULTIPLICATION {
        @Override
        public double compute(double x, double y) {
            return x * y; 
        }
    },
    DIVISION {
        @Override
        public double compute(double x, double y) {
            return x / y; 
        }
    };
    public abstract double compute(double x, double y);   
}
