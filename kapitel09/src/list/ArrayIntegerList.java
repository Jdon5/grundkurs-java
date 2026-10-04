package list;

/**
 * ArrayIntegerList
 */
public class ArrayIntegerList implements IntegerList{
    private int[] intArr = new int[5];
    private int counter;

    public ArrayIntegerList(){
    }

    public int getLength(){
        return counter;
    }


    public void insertLast(int value){
        if(counter <= (intArr.length-1)){
            intArr[counter++] = value;
        }
    }

    // liefert das erste Element, bei leerer Liste -1
    // (eindeutig, da die Liste nur Zahlen >= 0 enthaelt)
    public int getFirst(){
        if(counter>0)
            return intArr[0];
        else
            return -1;
    }

    public void deleteFirst(){
        if(counter > 0){
            for(int i=0;i<counter-1;i++){
            intArr[i] = intArr[i+1];
        }
        counter--;
        }
    }

    public boolean search(int value){
        boolean search = false;
        for(int i=0; i<counter; i++){
            if(intArr[i] == value){
                search = true;
            } 
        }
        return search;
    }

    public void display(){
        for(int i=0; i<counter; i++){
            System.out.println(intArr[i]);
        }
    }
    
}