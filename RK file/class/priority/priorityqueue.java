

import java.util.Arrays;

public class priorityqueue {
    public static void main(String[] args) {
        // Maxheap mh = new Maxheap(10);
        // mh.insert(5);
        // mh.insert(15);
        // mh.insert(25);
        // mh.insert(55);
        // mh.insert(105);
        // mh.print();
        // System.out.println(mh.pop());

        // mh.print();

        Maxheap mh = new Maxheap(10);
        int b[] = { 5, 1, 8, 2, 3, 15 };
        mh.buildhead(b);
        System.out.println(Arrays.toString(b));
    }

}

class Maxheap {
    int a[];
    int capacity;
    int size;

    public Maxheap(int capacity) {
        this.capacity = capacity;
        a = new int[capacity];
        size = 0;
    }

    public boolean insert(int e) {
        if (size == capacity)
            return false;
        a[size] = e;
        int i = size;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (a[parent] < a[i]) {
                swap(i, parent);
                i = parent;
            } else
                break;

        }
        size++;
        return true;
    }

    public void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }

    public int pop() {
        if (size == 0)
            return -1;
        size--;
        int temp = a[0];
        a[0] = a[size];
        heapify(0);
        return temp;
    }

    void heapify(int i) {
        if (i >= size)
            return;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int larger = i;
        if (left < size && a[left] > a[i]) {
            larger = left;
        }
        if (right < size && a[right] > a[larger]) {
            larger = right;
        }
        if (larger != i) {
            swap(larger, i);
            heapify(larger);
        }

    }

    //////////////////////////////////
    public void buildhead(int b[]) {
        if (b.length > capacity)
            return;
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];

        }
        size = b.length;
        for (int i = size - 1; i >= 0; i--) {
            heapify(i);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];

        }

    
    }
    public void heapSort(int b[]){
        buildhead(b);
    }
}
