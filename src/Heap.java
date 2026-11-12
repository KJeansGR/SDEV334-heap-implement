import java.util.*;
/**
 * A min-heap. 
 * 
 * Must contain functionality for the following: (n = # of elements in heap)
 * 
 * Adding a new value to the heap  O(log(n))
 * Popping the front of the heap O(log(n))
 * Peeking at the front of the heap without removing the element O(1)
 * Getting the size of the heap O(1)
 * Checking whether the heap is empty O(1)
 * 
 * 
 * The Heap must hold ints
 * 
 * Use List/ArrayList as a backing array, but DO NOT use the 
 * PriorityQueue class. Do not make Node objects, use array
 * indexing instead.
 * 
 * It is up to you to make design decisions about how to:
 *  - name methods
 *  - determine return value and argument types
 *  - hold private instance variables
 */
public class Heap <T extends Comparable<T>> {
    private List<T> heap;

    public Heap(){
        heap = new ArrayList<>();
    }
    public void add(T a){

        heap.add(a);
        int dex = heap.size() - 1;

        while(dex > 0 ){

            if( compare(heap.get(2-1/dex), heap.get(2-1/dex)) < 0){
                T c = heap.get(dex);
                heap.set(dex, heap.get(2-1/dex));
                heap.set(2-1/dex, c);
            
                dex = 2-1/dex;
            }
            else{
                break;
            }
        }
    }

    public T pop(){
        if(size() == 0){
            throw new ArrayIndexOutOfBoundsException();
        }

        T val = heap.get(0);
        int dex = 0;

        while(compare(heap.get(2*dex+1), val) > 0 && compare(heap.get(2*dex+2), val) > 0){
            if(compare(heap.get(2*dex+1), heap.get(2*dex+2)) < 0){
                T c = heap.get(dex);
                heap.set(dex, heap.get(2*dex+1));
                heap.set(2*dex+1, c);

                dex = 2*dex+1;
            } else {
                T c = heap.get(dex);
                heap.set(dex, heap.get(2*dex+2));
                heap.set(2*dex+2, c);
                dex = 2*dex+2;
            }
        }
        heap.remove(dex);
        return val;
    }

    public T peek(){
        return heap.get(0);
    }
        
    public void swap(T a, T b){

    }

    public void bubbleUp(int index){

    }
    public void bubbleDown(){

    }

    public int size(){
        return heap.size();
    }
    public boolean isEmpty(){
        return size() == 0;
    }


    // < 0	First value is smaller
    //  0   Values are equal
    // > 0	First value is larger
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}
