package kapitel06;

/**
 * RingpufferTest
 */
public class RingpufferTest {

    public static void main(String[] args) {
        Ringpuffer ringpuffer = new Ringpuffer();

        // Befüllung des Ringpuffers
        ringpuffer.push(1);
        ringpuffer.push(2);
        ringpuffer.push(3);
        ringpuffer.push(4);
        ringpuffer.push(5);

        // Test: Überschreibung des Puffers.
        //erwartet -> an Stelle des 1. Index 6 
        ringpuffer.push(6);

        // Test: mehrere Runden - weitere Ueberschreibungen
        // erwartet -> [6, 7, 8, 4, 5]
        ringpuffer.push(7);
        ringpuffer.push(8);

        ringpuffer.display();

    }
}