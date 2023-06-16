package PriorityQueueHeap;

import java.util.ArrayList;

public interface TADheap<E extends Comparable<E>> {
	void insert(E x,ArrayList<E> array);
	void remove(ArrayList<E> array);
}
