package queue;

/**
 * Warteschlange
 */
public class Warteschlange {
    private Node head;
    private Node tail;


    public static class Node{
        private int data;
        private Node next; 

        public Node(int data){
            this.data = data;
        }
    }

    public void enter(int x) {
    Node element = new Node(x);

    if (head == null) {        // Schlange ist leer
        head = element;
        tail = element;
    } else {
        tail.next = element;   // neuen Knoten hinter das letzte Element haengen
        tail = element;        // tail rueckt auf das neue letzte Element
    }
}

    public int leave(){
        int wert = head.data;
        head = head.next;
        return wert; 
    }

    public void displayQueue() {
        Node help = head;
        while (help != null) {
            System.out.println(help.data);
            help = help.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}   