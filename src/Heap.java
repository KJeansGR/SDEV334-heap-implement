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
public class Heap <T> {
    List<T> heap;
    int size = 0;

    public Heap(){
        heap = new ArrayList<>();
    }
    public Heap(int capacity){
        heap = new ArrayList<>(capacity);
    }
    
    public void add(T val){
        heap.add(val);
        //heapify
    }
    public T pop(){
        T val = null;
        return val;
        //heapify
    }
    public T peek(){
        T val = null;
        return val;
        //heapify
    }
    
    public void bubbleUp(){

    }
    public void bubbleDown(){

    }
    public int size(){
        return size();
    }
    public boolean isEmpty(){
        return size == 0;
    }
}