package list;

/**
 * IntegerList
 */
public interface IntegerList {

    int getLength();

    void insertLast(int value);

    int getFirst();

    void deleteFirst();

    boolean search(int value);
}