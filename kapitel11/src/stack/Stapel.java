package stack;

/**
 * Aufgabe 1: Stack (Stapel) mit den Methoden push und pop.
 * Die Elemente sind Objekte der geschachtelten Klasse Node, die
 * ueber next miteinander verkettet sind. top zeigt auf das oberste
 * Element. Anders als beim Array-Stapel aus Kapitel 6 gibt es
 * keine feste Kapazitaet.
 */
public class Stapel {
    private Node top; // oberstes Element, null bei leerem Stapel

    // ein Element des Stapels: speichert einen Wert und verweist auf
    // das Element darunter (null beim untersten Element)
    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // legt einen neuen Wert oben auf den Stapel: der neue Knoten
    // verweist auf das bisherige oberste Element und wird selbst zu top
    public void push(int e) {
        Node neu = new Node(e);
        neu.next = top;
        top = neu;
    }

    // entfernt das oberste Element und gibt seinen Wert zurueck.
    // Voraussetzung: Der Stapel ist nicht leer (vorher mit isEmpty()
    // pruefen), sonst NullPointerException.
    public int pop() {
        int wert = top.data; // Wert sichern, bevor top weiterrueckt
        top = top.next;
        return wert;
    }

    // true, wenn der Stapel keine Elemente enthaelt
    public boolean isEmpty() {
        return top == null;
    }

    // gibt alle Elemente von oben nach unten aus, ohne den Stapel
    // zu veraendern (help wandert durch die Kette, top bleibt fest)
    public void displayStack() {
        Node help = top;
        while (help != null) {
            System.out.println(help.data);
            help = help.next;
        }
    }
}