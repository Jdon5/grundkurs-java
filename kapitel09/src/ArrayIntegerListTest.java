import list.*;

/**
 * ArrayIntegerListTest
 */
public class ArrayIntegerListTest {

    public static void main(String[] args) {
        
        ArrayIntegerList arrayIntegerList = new ArrayIntegerList();




        // Befüllen der Liste
        arrayIntegerList.insertLast(1);
        arrayIntegerList.insertLast(2);
        arrayIntegerList.insertLast(3);
        arrayIntegerList.insertLast(4);
        arrayIntegerList.insertLast(5);
        
        //Listenlänge. erwartet -> 5
        System.out.println(arrayIntegerList.getLength());

        // Ausgabe der ersten Zahl der Liste
        // erwartet -> 1
        System.out.println(arrayIntegerList.getFirst());
        


        // Löschen der ersten Zahl der Liste
        arrayIntegerList.deleteFirst();
        // erwartet -> 2
        System.out.println(arrayIntegerList.getFirst());
        //Listenlänge. erwartet -> 4
        System.out.println(arrayIntegerList.getLength());



        // Löschen der verbleibenden Werte
        arrayIntegerList.deleteFirst();
        arrayIntegerList.deleteFirst();
        arrayIntegerList.deleteFirst();
        arrayIntegerList.deleteFirst();

        // Bei einer leeren Liste wird -1 zurückgegeben. erwartet -> -1
        System.out.println(arrayIntegerList.getFirst());

        // Loeschen bei leerer Liste - Laenge darf nicht negativ werden
        arrayIntegerList.deleteFirst();
        // erwartet -> 0
        System.out.println(arrayIntegerList.getLength());

        // Befüllen der Liste
        arrayIntegerList.insertLast(6);
        arrayIntegerList.insertLast(7);
        arrayIntegerList.insertLast(8);
        arrayIntegerList.insertLast(9);
        arrayIntegerList.insertLast(10);

        // Setzen eines 6. Elements bei einer max. Länge von 5
        arrayIntegerList.insertLast(11);
        //Listenlänge. erwartet -> 5
        System.out.println(arrayIntegerList.getLength());


        // Prüft ob Element in der List vorhanden ist
        // erwartet -> false
        System.out.println(arrayIntegerList.search(5));

        // Prüft ob Element in der List vorhanden ist
        // erwartet -> true
        System.out.println(arrayIntegerList.search(6));
        
        // Ausgabe der Elemente der Liste
        arrayIntegerList.display();
    }
}