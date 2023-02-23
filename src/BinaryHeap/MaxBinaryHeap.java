package BinaryHeap;

public class MaxBinaryHeap {

    Integer [] heap;
    int n;

    public MaxBinaryHeap(int capacity){
        n = 0;
        heap = new Integer[capacity + 1];
    }

    public boolean isEmpty(){
        return n==0;
    }

    public int size(){
        return n;
    }

    public void insert(int x){
        if(n == heap.length-1){

        }
        n++;
        heap[n] = x;
        swim(n);
    }

    public void swim(int k){

    }

    public static void main(String[] args) {
        MaxBinaryHeap binaryHeap = new MaxBinaryHeap(3);
        System.out.println(binaryHeap.isEmpty());
        System.out.println(binaryHeap.size());
    }
}
